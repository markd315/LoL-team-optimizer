public class Champion
{
	private String name;
	private String[] altRoles;
	private Champion[] counterpicks, synergies;
	private int ad, ap, tank, cc, mobility;
	public Champion(String n, Champion[] cp, Champion[] s, int atk, int mgc, int hp, int crc, int mob, String[] al)
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
	
	public Champion[] getCounters()
	{
		return counterpicks;
	}
	
	public boolean counters(Champion q)
	{
		Champion[] temp = q.getCounters();
		for(Champion c : temp)
		{
			if(c.getName().equalsIgnoreCase(this.getName()))
				return true;
		
		}
		return false;
	}
	
	public boolean counteredBy(Champion q)
	{
		String nme = q.getName()
		for(Champion c : counterpicks)
		{
			if(c.getName().equalsIgnoreCase(nme))
				return true;
		
		}
		return false;
	}
	public boolean hasSynergy(Champion q)
	{
		String nme = q.getName()
		for(Champion c : synergies)
		{
			if(c.getName().equalsIgnoreCase(nme))
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
