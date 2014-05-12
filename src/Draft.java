import java.util.*;

public class Draft
{
	public static ArrayList<Champion> bans = new ArrayList<Champion>();
	public static ArrayList<Champion> bluePicks = new ArrayList<Champion>();
	public static ArrayList<Champion> purplePicks = new ArrayList<Champion>();
	public static ArrayList<Champion> enemyTeam = new ArrayList<Champion>();
	public static ArrayList<Champion> Team = new ArrayList<Champion>();
	public static  void setTeams()
	{
		if(!isBlue)
		{
			enemyTeam = bluePicks;
		}
		else
		{
			enemyTeam = purplePicks;
		}
		if(isBlue)
		{
			Team = bluePicks;
		}
		else
		{
			Team = purplePicks;
		}
	}
	public static boolean isBlue;
	Scanner in = new Scanner(System.in);
	public void draft()
	{
		System.out.println("What team are you? (Blue/Purple or B/P)");
		String temp = in.next();
		if (temp.equalsIgnoreCase("B") || temp.equalsIgnoreCase("Blue") || temp.equalsIgnoreCase("Blue"))
		{
			isBlue = true;
		}
		else
		{
			isBlue = false;
		}
		setTeams();
		blueBan();
		purpleBan();
		blueBan();
		purpleBan();
		blueBan();
		purpleBan();
		bluePick();
		purplePick();
		purplePick();
		bluePick();
		bluePick();
		purplePick();
		purplePick();
		bluePick();
		bluePick();
		purplePick();
	}
	public void purpleBan()
	{
		System.out.println("Who does Purple ban?");
		Champion c = find(in.next());
		c.ban();
		bans.add(c);
	}
	public void purplePick()
	{
		if(isBlue)
		{
			System.out.println("Who does Purple select?");
			Champion c = find(in.next());
			c.ban();
			bans.add(c);
		}
		else
		{
			recommend();
		}
	}
	public void recommend()
	{
		for(Champion c : Pool.getPool())
		{
			c.setIndex(getSelectionIndex(c));
		}
		Collections.sort(Arrays.asList(Pool.getPool())); //Sorts pool by the calculated indices
		//Print highest selection indexes in descending order, those are suggested picks
		menu();
	}
	public double getSelectionIndex(Champion c)
	{
		if(c.banned() || c.picked())
			return 0.0;
		/*
		 * if(onTierList) add ((6- tier).15 * weight)
		 * if(onPrefList) add ((6-tier).15 * weight)
		 */
		double weight = 1.0;
		double index = 1.0;
		for(Champion s : enemyTeam)
		{
			if(s.counters(c))
			{
				index -= (weight * .3)*(10.0-(double)s.countersInt(c));
			}
		}
		for(Champion s : enemyTeam)
		{
			if(c.counters(s))
			{
				index += (weight * .3)*(10.0-(double)c.countersInt(s));
			}
		}
		for(Champion s : Team)
		{
			if(s.hasSynergy(c))
			{
				index += (weight * .15)*(7.0-(double)s.hasSynergyInt(c));
			}
		}
		for(Champion s : Team)
		{
			if(c.hasSynergy(s))
			{
				index += (weight * .15)*(10.0-(double)c.hasSynergyInt(s));
			}
		}

		//TODO deal with role needs using hasX() boolean methods
		//TODO use double variability(int[]) on team (converted to array) to find what elements the team lacks.  Disregard MOB.
		return index;
	}
	public boolean hasMid()
	{
		for(Champion c : Team)
		{
			if (c.isAMid())
				return true;
		}
		return false;
	}
	public boolean hasAnADC()
	{
		for(Champion c : Team)
		{
			if (c.isAnADC())
				return true;
		}
		return false;
	}
	public boolean hasTop()
	{
		for(Champion c : Team)
		{
			if (c.isATop())
				return true;
		}
		return false;
	}
	public boolean hasSupport()
	{
		for(Champion c : Team)
		{
			if (c.isASupport())
				return true;
		}
		return false;
	}
	public boolean hasJungle()
	{
		for(Champion c : Team)
		{
			if (c.isAJungle())
				return true;
		}
		return false;
	}

	public static double variability(int[] x)
	{
		double mean = mean(x);
		double v = 0.0;
		for(int q : x)
		{
			v += Math.abs(mean - q);
		}
		return v;
	}
	public static double mean(int[] x)
	{
		int c = 0;
		for(int i : x)
		{
			c += i;
		}
		return (double)c/(double)x.length;
	}
	public static void menu()
	{
		//donothing for now
	}
	public void blueBan()
	{
		System.out.println("Who does Blue ban?");
		Champion c = find(in.next());
		c.ban();
		bans.add(c);
	}
	public void bluePick()
	{
		if(!isBlue)
		{
			System.out.println("Who does Blue select?");
			Champion c = find(in.next());
			c.ban();
			bans.add(c);
		}
		else
		{
			recommend();
		}
	}
	public Champion find(String name)
	{
		for(Champion champ : Pool.getPool())
		{
			if (champ.getName().equalsIgnoreCase(name))
				return champ;
		}
		return null;
	}

}
