public class Player
{
	private Champion[] aTier, bTier, cTier, dTier, eTier;
	private String name;

	public Player(String n, Champion[] a, Champion[] b, Champion[] c, Champion[] d, Champion[] e)
	{
		name = n;
		aTier = a;
		bTier = b;
		cTier = c;
		dTier = d;
		eTier = e;
	}

	public Champion[] getaTier()
	{
		return aTier;
	}

	public Champion[] getbTier()
	{
		return bTier;
	}

	public Champion[] getcTier()
	{
		return cTier;
	}

	public Champion[] getdTier()
	{
		return dTier;
	}

	public Champion[] geteTier()
	{
		return eTier;
	}

	public String getName()
	{
		return name;
	}
	public int tier(Champion x)
	{
		for(Champion c : aTier)
		{
			if(x.equals(c))
			return 1;
		}
		for(Champion c : bTier)
		{
			if(x.equals(c))
			return 2;
		}
		for(Champion c : cTier)
		{
			if(x.equals(c))
			return 3;
		}
		for(Champion c : dTier)
		{
			if(x.equals(c))
			return 4;
		}
		for(Champion c : eTier)
		{
			if(x.equals(c))
			return 5;
		}
		return 6;
	}

}
