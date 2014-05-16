import java.io.IOException;
import java.util.*;


public class Draft
{
	public static ArrayList<Champion> bans = new ArrayList<Champion>();
	public static ArrayList<Champion> bluePicks = new ArrayList<Champion>();
	public static ArrayList<Champion> purplePicks = new ArrayList<Champion>();
	public static ArrayList<Champion> enemyTeam = new ArrayList<Champion>();
	public static ArrayList<Champion> Team = new ArrayList<Champion>();
	public static boolean isBlue;
	public Scanner in = new Scanner(System.in);

	public static int[] teamStats;

	public static int[] calcTeamStats(ArrayList<Champion> x)
	{
		int ad = 0;
		int ap = 0;
		int hp = 0;
		int cc = 0;
		int mob = 0;
		for(Champion c : x)
		{
			ad += c.getAD();
			ap += c.getAP();
			hp += c.getTank();
			cc += c.getCC();
			mob += c.getMob();
		}
		if(Input.isUseMobilityStat())
			return new int[]
			{ad, ap, hp, cc};
		return new int[]
		{ad, ap, hp, cc, mob};
	}
	public static void setTeams()
	{
		if(!isBlue)
		{
			enemyTeam = bluePicks;
		} else
		{
			enemyTeam = purplePicks;
		}
		if(isBlue)
		{
			Team = bluePicks;
		} else
		{
			Team = purplePicks;
		}
	}
	public void draft() throws IOException
	{
		System.out.println("What team are you? (Blue/Purple or B/P)");
		String temp = in.nextLine();
		if(temp.equalsIgnoreCase("B") || temp.equalsIgnoreCase("Blue") || temp.equalsIgnoreCase("Blu"))
		{
			isBlue = true;
		} else
		{
			isBlue = false;
		}
		setTeams();
		if(Input.isBansPhase())
		{
			blueBan();
			purpleBan();
			blueBan();
			purpleBan();
			blueBan();
			purpleBan();
		}

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
	public void purpleBan() throws IOException
	{
		System.out.println("Who does Purple ban?");
		Champion c = null;
		while(c == null)
		{
			c = find(in.nextLine().replaceAll(" ", ""));
			if(c == null)
				System.out.println("Invalid champion, please re-enter.");
		}
		c.ban();
		bans.add(c);
	}
	public void purplePick() throws IOException
	{
		if(isBlue)
		{
			System.out.println("Who does Purple pick?");
			Champion c = null;
			while(c == null)
			{
				c = find(in.nextLine().replaceAll(" ", ""));
				if(c == null)
					System.out.println("Invalid champion, please re-enter.");
			}
			c.pick();
			purplePicks.add(c);
		} else if(Team.size() >= 4)
		{
			recommend();
		} else
		{
			recommend();
			System.out.println("Who do you pick?");
			Champion c = null;
			while(c == null)
			{
				c = find(in.nextLine());
				if(c == null)
					System.out.println("Invalid champion, please re-enter.");
			}
			c.pick();
			purplePicks.add(c);
		}
	}
	public void blueBan() throws IOException
	{
		System.out.println("Who does Blue ban?");
		Champion c = null;
		while(c == null)
		{
			c = find(in.nextLine().replaceAll(" ", ""));
			if(c == null)
				System.out.println("Invalid champion, please re-enter.");
		}
		c.ban();
		bans.add(c);
	}
	public void bluePick() throws IOException
	{
		if(!isBlue || Team.size() <= 0)
		{
			System.out.println("Who does Blue pick?");
			Champion c = null;
			while(c == null)
			{
				c = find(in.nextLine().replaceAll(" ", ""));
				if(c == null)
					System.out.println("Invalid champion, please re-enter.");
			}
			c.pick();
			bluePicks.add(c);
		} else
		{
			recommend();
			System.out.println("Who do you pick?");
			Champion c = null;
			while(c == null)
			{
				c = find(in.nextLine());
				if(c == null)
					System.out.println("Invalid champion, please re-enter.");
			}
			c.pick();
			bluePicks.add(c);
		}
	}
	private void printPicks(List<Champion> x)
	{
		for(int i = 0; i < Input.getNumSuggestions(); i++)
		{
			System.out.println("#" + (i + 1) + ": " + x.get(i).getName() + " = " + Math.round(x.get(i).getIndex() * 1000.0) / 1000.0);
		}

	}
	public void recommend()
	{
		for(Champion c : Pool.getPool())
		{
			c.setIndex(getSelectionIndex(c));
		}
		List<Champion> sortedByIndex = Arrays.asList(Pool.getPool());
		Collections.sort(sortedByIndex); // Sorts pool by the calculated indices
		Collections.reverse(sortedByIndex);
		printPicks(sortedByIndex);
		menu();
	}
	public double getSelectionIndex(Champion c)
	{
		if(c.banned() || c.picked())
			return 0.0;

		double weight = Input.getOverallWeight();
		double index = Input.getStartIndex();

		if(enemyTeam.size() > 0)
			for(Champion s : enemyTeam)
			{
				if(s.counters(c))
				{
					index -= (Input.getCounterWeight() * weight * .25) * (11.0 - (double)s.countersInt(c));
				}
				if(c.counters(s))
				{
					index += (Input.getCounterWeight() * weight * .25) * (11.0 - (double)c.countersInt(s));
				}
			}

		if(Team.size() > 0)
			for(Champion s : Team)
			{
				if(s.hasSynergy(c)) 
				{
					index += (Input.getSynergyWeight() * weight * .1) * (6.0 - (double)s.hasSynergyInt(c));
				}
				if(c.hasSynergy(s))
				{
					index += (Input.getSynergyWeight() * weight * .03) * (6.0 - (double)c.hasSynergyInt(s));
				}
			}

		ArrayList<Champion> hypotheticalTeam = new ArrayList<Champion>();
		clone(hypotheticalTeam, Team);
		hypotheticalTeam.add(c);
		index += (variability(calcTeamStats(Team)) - variability(calcTeamStats(hypotheticalTeam))) * .06 * weight * Input.getTeamStatsWeight();

		if(Team.size() > 0 && Input.isUseRoleFit())
		{
			int testDex = 0;
			if(!hasMid() && c.isAMid())
				testDex++;
			if(!hasTop() && c.isATop())
				testDex++;
			if(!hasADC() && c.isAnADC())
				testDex++;
			if(!hasSupport() && c.isASupport())
				testDex++;
			if(!hasJungle() && c.isAJungle())
				testDex++;
			double roleFit = ((double)testDex / (double)c.countRoles());
			roleFit *= .05 * weight * Input.getRoleFitWeight();
			index += roleFit;
		}

		double minTier = 6.0;
		for(Player p : Input.getPlayerData())
		{
			if(p.tier(c) < minTier)
				minTier = p.tier(c);
		}
		index += (weight * .5 * Input.getPlayerPrefWeight()) * (6.0 - minTier);

		index += (weight * .25 * Input.getMetaStrengthWeight()) * (6.0 - Input.getMeta().tier(c));

		return index;
	}
	public void clone(ArrayList<Champion> blank, ArrayList<Champion> x)
	{
		for(Champion c : x)
			blank.add(c);
	}
	public boolean hasMid()
	{
		if(Team.size() > 0)
			for(Champion c : Team)
			{
				if(c.isAMid())
					return true;
			}
		return false;
	}
	public boolean hasADC()
	{
		if(Team.size() > 0)
			for(Champion c : Team)
			{
				if(c.isAnADC())
					return true;
			}
		return false;
	}
	public boolean hasTop()
	{
		if(Team.size() > 0)
			for(Champion c : Team)
			{
				if(c.isATop())
					return true;
			}
		return false;
	}
	public boolean hasSupport()
	{
		if(Team.size() > 0)
			for(Champion c : Team)
			{
				if(c.isASupport())
					return true;
			}
		return false;
	}
	public boolean hasJungle()
	{
		if(Team.size() > 0)
			for(Champion c : Team)
			{
				if(c.isAJungle())
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
		return (double)c / (double)x.length;
	}
	public static void menu()
	{
		// donothing for now
	}
	public Champion find(String name)
	{
		for(Champion champ : Pool.getPool())
		{
			if(champ.getName().equalsIgnoreCase(name))
				return champ;
		}
		return null;
	}

}
