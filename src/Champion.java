public class Champion
{
	private String name;
	private String[] altRoles, counterpicks, synergies;
	private int ad, ap, tank, cc, mobility;
	public Champion(String n, String[] cp, String[] s, int atk, int mgc, int hp, int crc, int mob, String[] al)
	{
		name = n;
		counterpicks = cp;
		synergies = s;
		ad = atk;
		ap = mgc;
		tank = hp;
		cc = crc;
		mobility = mob;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String[] getCounters()
	{
		return counterpicks;
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
	
	public boolean counters(Champion q)
	{
		String[] temp = q.getCounters();
		Champion[] temp1 = new Champion[temp.length];
		for(int i = 0; i < temp.length; i++)
		{
			temp1[i] =  find(temp[i]);
		}
		
		for(Champion c : temp1)
		{
			if(c.getName().equalsIgnoreCase(this.getName()))
				return true;
		
		}
		return false;
	}
	
	public boolean counteredBy(Champion q)
	{
		String nme = q.getName();
		for(String c : counterpicks)
		{
			if(c.equalsIgnoreCase(nme))
				return true;
		
		}
		return false;
	}
	public boolean hasSynergy(Champion q)
	{
		String nme = q.getName();
		for(String c : synergies)
		{
			if(c.equalsIgnoreCase(nme))
				return true;
		
		}
		return false;
	}
	public int getAD()
	{
		return ad;
	}
	public int getAP()
	{
		return ap;
	}
	public int getTank()
	{
		return tank;
	}
	public int getCC()
	{
		return cc;
	}
	public int getMob()
	{
		return mobility;
	}

}
