import java.util.*;

public class Draft
{
	public ArrayList<Champion> bans = new ArrayList<Champion>();
	public ArrayList<Champion> bluePicks = new ArrayList<Champion>();
	public ArrayList<Champion> purplePicks = new ArrayList<Champion>();
	public boolean isBlue;
	Scanner in = new Scanner(System.in);
	public void draft()
	{
		System.out.println("What team are u? (Blue/Purple or B/P)");
		String temp = in.next();
		if (temp.equalsIgnoreCase("B") || temp.equalsIgnoreCase("Blue") || temp.equalsIgnoreCase("Blue"))
		{
			isBlue = true;
		}
		else
		{
			isBlue = false;
		}
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
			
		
		}
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
