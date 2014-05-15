public class Champion implements Comparable<Champion>
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
	public int countRoles()
	{
		int i = 0;
		if (isAnADC())
			i++;
		if (isAMid())
			i++;
		if (isATop())
			i++;
		if (isASupport())
			i++;
		if (isAJungle())
			i++;
		return i;
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
		if(y != null && y.length > 0)
			for(String q : y)
				if (x.equalsIgnoreCase(q))
					return true;
		return false;
	}
	public String[] getSynergies()
	{
		return synergies;
	}
	public boolean isAnADC()
	{
		if(this instanceof ADC)
			return true;
		if(getAltRoles() != null && getAltRoles().length > 0 && isIn("ADC", altRoles))
			return true;
		return false;
	}
	public boolean isAMid()
	{
		if(this instanceof Mid)
			return true;
		if(getAltRoles() != null && getAltRoles().length > 0 && isIn("Mid", altRoles))
			return true;
		return false;
	}
	public boolean isATop()
	{
		if(this instanceof Top)
			return true;
		if(getAltRoles() != null && getAltRoles().length > 0 && isIn("Top", altRoles))
			return true;
		return false;
	}
	public boolean isAJungle()
	{
		if(this instanceof Jungle)
			return true;
		if(getAltRoles() != null && getAltRoles().length > 0 && isIn("Jungle", altRoles))
			return true;
		return false;
	}
	public boolean isASupport()
	{
		if(this instanceof Support)
			return true;
		if(getAltRoles() != null && getAltRoles().length > 0 && isIn("Support", altRoles))
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

	public int countersInt(Champion q)
	{
		String[] temp = q.getCounters();
		Champion[] temp1 = new Champion[temp.length];
		for(int i = 0; i < temp.length; i++)
		{
			temp1[i] =  find(temp[i]);
		}

		for(int i = 0; i < temp1.length;  i++)
		{
			Champion c = temp1[i];
			if(c.getName().equalsIgnoreCase(this.getName()))
				return i;

		}
		return -1;
	}
	public boolean counters(Champion q)
	{
		for(String s : q.getCounters())
		{
			if (s.equalsIgnoreCase(q.getName()))
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
	public int countersInt(String x)
	{
		Champion q = find(x);
		String[] temp = q.getCounters();
		Champion[] temp1 = new Champion[temp.length];
		for(int i = 0; i < temp.length; i++)
		{
			temp1[i] =  find(temp[i]);
		}

		for(int i = 0; i < temp1.length;  i++)
		{
			Champion c = temp1[i];
			if(c.getName().equalsIgnoreCase(this.getName()))
				return i;

		}
		return -1;
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
	public int counteredByInt(Champion q)
	{
		String nme = q.getName();
		for(int i = 0; i < counterpicks.length; i++)//every string c in counterpicks
		{
			String c = counterpicks[i];
			if(c.equalsIgnoreCase(nme))
				return i;

		}
		return -1;
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
	public int counteredByInt(String x)
	{
		Champion q = find(x);
		String nme = q.getName();
		for(int i = 0; i < counterpicks.length; i++)//every string c in counterpicks
		{
			String c = counterpicks[i];
			if(c.equalsIgnoreCase(nme))
				return i;

		}
		return -1;
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
	public int hasSynergyInt(Champion q)
	{
		String nme = q.getName();
		for(int i = 0; i < synergies.length; i++)//every string c in counterpicks
		{
			String c = synergies[i];
			if(c.equalsIgnoreCase(nme))
				return i;

		}
		return -1;
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
	public int hasSynergyInt(String nme)
	{
		for(int i = 0; i < synergies.length; i++)//every string c in counterpicks
		{
			String c = synergies[i];
			if(c.equalsIgnoreCase(nme))
				return i;

		}
		return -1;
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
	public double getIndex()
	{
		return index;
	}
	public void setIndex(double x)
	{
		index = x;
	}
	public int compareTo(Champion o)
	{
		if(this.getIndex()-o.getIndex() > 0.0)
			return 1;
		if(this.getIndex()-o.getIndex() < 0.0)
			return -1;
		return 0;
	}
}
