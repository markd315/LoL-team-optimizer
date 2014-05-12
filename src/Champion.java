public class Champion
{
	private boolean isPicked = false, isBanned = false;
	private double index;
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
	public void ban()
	{
	this.isBanned = true;	
	}
	public void pick()
	{
		this.isPicked = true;
	}
	public boolean picked()
	{
		return isPicked;
	}
	public boolean banned()
	{
		return isBanned;
	}
	
	public boolean isIn(String x, String[] y)
	{
		for(String q : y)
			if (q.equalsIgnoreCase(x))
				return true;
		return false;
	}
	public boolean isAnADC()
	{
		if (this instanceof ADC || isIn("ADC", altRoles))
			return true;
		return false;
	}
	public boolean isAMid()
	{
		if (this instanceof Mid || isIn("Mid", altRoles))
			return true;
		return false;
	}
	public boolean isATop()
	{
		if (this instanceof Top || isIn("Top", altRoles))
			return true;
		return false;
	}
	public boolean isAJungle()
	{
		if (this instanceof Jungle || isIn("Jungle", altRoles))
			return true;
		return false;
	}
	public boolean isASupport()
	{
		if (this instanceof Support || isIn("Support", altRoles))
			return true;
		return false;
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
	public boolean counters(String x)
	{
		Champion q = find(x);
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
	public boolean counteredBy(String x)
	{
		Champion q = find(x);
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
	public boolean hasSynergy(String nme)
	{
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
	public String[] getAltRoles() 
	{
		return altRoles;
	}
}
