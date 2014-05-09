public class Player
{
	private Champion[] aTier, bTier, cTier, dTier, eTier;
	private String name;

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

	public Player(String n, Champion[] a, Champion[] b, Champion[] c, Champion[] d, Champion[] e)
	{
		name = n;
		aTier = a;
		bTier = b;
		cTier = c;
		dTier = d;
		eTier = e;
	}

	public Player(String n, Champion[] a, Champion[] b, Champion[] c, Champion[] d)
	{
		name = n;
		aTier = a;
		bTier = b;
		cTier = c;
		dTier = d;
	}

	public Player(String n, Champion[] a, Champion[] b, Champion[] c)
	{
		name = n;
		aTier = a;
		bTier = b;
		cTier = c;
	}

	public Player(String n, Champion[] a, Champion[] b)
	{
		name = n;
		aTier = a;
		bTier = b;
	}

	public Player(String n, Champion[] a)
	{
		name = n;
		aTier = a;
	}
}
