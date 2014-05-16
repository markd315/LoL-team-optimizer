import java.util.*;
import java.io.*;


public class Input
{
	static Scanner meta;
	static Scanner players;
	static ArrayList<Player> playerData;
	private static Meta m;
	static Scanner config;
	static boolean bansPhase, useRoleFit, useMobilityStat;
	static int numSuggestions;
	static double startIndex, overallWeight, counterWeight, synergyWeight, teamStatsWeight, roleFitWeight, playerPrefWeight, metaStrengthWeight;

	public Input() throws IOException
	{
		// Input meta
		meta = new Scanner(new File("config/meta.cfg"));
		meta.nextLine();
		String aa = meta.nextLine();
		String bb = meta.nextLine();
		String cc = meta.nextLine();
		String dd = meta.nextLine();
		String ee = meta.nextLine();
		m = new Meta(tokenize(aa), tokenize(bb), tokenize(cc), tokenize(dd), tokenize(ee));

		// Input players
		players = new Scanner(new File("config/yourPlayers.cfg"));
		ArrayList<String> playerNames = new ArrayList<String>();
		players.nextLine();
		while(players.hasNext())
		{
			playerNames.add(players.next());
		}
		playerData = new ArrayList<Player>();
		for(String name : playerNames)
		{
			Scanner x = new Scanner(new File("config/players/" + name + ".cfg"));
			x.nextLine(); // clears comment line of cfg file
			String a = x.nextLine();
			String b = x.nextLine();
			String c = x.nextLine();
			String d = x.nextLine();
			String e = x.nextLine();
			Player pl = new Player(name, tokenize(a), tokenize(b), tokenize(c), tokenize(d), tokenize(e));
			playerData.add(pl);
			x.close();
		}
		players.close();
		
		
		
		//Input config options
		config = new Scanner(new File("config/options.cfg"));
		config.nextLine();
		config.next();
		bansPhase = parseBoolean(config.nextLine());
		config.next();
		useRoleFit = parseBoolean(config.nextLine());
		config.next();
		useMobilityStat = parseBoolean(config.nextLine());
		config.next();
		numSuggestions = Integer.parseInt(config.nextLine().replace(" ", ""));
		config.next();
		startIndex = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		overallWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		counterWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		synergyWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		teamStatsWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		roleFitWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		playerPrefWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
		config.next();
		metaStrengthWeight = Double.parseDouble(config.nextLine().replace(" ", ""));
	}
	private boolean parseBoolean(String x)
	{
		x = x.replaceAll(" ", "");
		if(x.equalsIgnoreCase("T") || x.equalsIgnoreCase("True") || x.equalsIgnoreCase("Tru"))
			return true;
		return false;
	}
	public static Scanner getConfig()
	{
		return config;
	}
	public static void setConfig(Scanner config)
	{
		Input.config = config;
	}
	public static boolean isBansPhase()
	{
		return bansPhase;
	}
	public static void setBansPhase(boolean bansPhase)
	{
		Input.bansPhase = bansPhase;
	}
	public static boolean isUseRoleFit()
	{
		return useRoleFit;
	}
	public static void setUseRoleFit(boolean useRoleFit)
	{
		Input.useRoleFit = useRoleFit;
	}
	public static boolean isUseMobilityStat()
	{
		return useMobilityStat;
	}
	public static void setUseMobilityStat(boolean useMobilityStat)
	{
		Input.useMobilityStat = useMobilityStat;
	}
	public static int getNumSuggestions()
	{
		return numSuggestions;
	}
	public static void setNumSuggestions(int numSuggestions)
	{
		Input.numSuggestions = numSuggestions;
	}
	public static double getStartIndex()
	{
		return startIndex;
	}
	public static void setStartIndex(double startIndex)
	{
		Input.startIndex = startIndex;
	}
	public static double getOverallWeight()
	{
		return overallWeight;
	}
	public static void setOverallWeight(double overallWeight)
	{
		Input.overallWeight = overallWeight;
	}
	public static double getCounterWeight()
	{
		return counterWeight;
	}
	public static void setCounterWeight(double counterWeight)
	{
		Input.counterWeight = counterWeight;
	}
	public static double getSynergyWeight()
	{
		return synergyWeight;
	}
	public static void setSynergyWeight(double synergyWeight)
	{
		Input.synergyWeight = synergyWeight;
	}
	public static double getTeamStatsWeight()
	{
		return teamStatsWeight;
	}
	public static void setTeamStatsWeight(double teamStatsWeight)
	{
		Input.teamStatsWeight = teamStatsWeight;
	}
	public static double getRoleFitWeight()
	{
		return roleFitWeight;
	}
	public static void setRoleFitWeight(double roleFitWeight)
	{
		Input.roleFitWeight = roleFitWeight;
	}
	public static double getPlayerPrefWeight()
	{
		return playerPrefWeight;
	}
	public static void setPlayerPrefWeight(double playerPrefWeight)
	{
		Input.playerPrefWeight = playerPrefWeight;
	}
	public static double getMetaStrengthWeight()
	{
		return metaStrengthWeight;
	}
	public static void setMetaStrengthWeight(double metaStrengthWeight)
	{
		Input.metaStrengthWeight = metaStrengthWeight;
	}
	public Champion[] tokenize(String x)
	{
		ArrayList<Champion> c = new ArrayList<Champion>();
		String[] z = x.split(" ");
		for(String s : z)
			c.add(find(s));
		return c.toArray(new Champion[c.size()]);
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
	public static ArrayList<Player> getPlayerData()
	{
		return playerData;
	}
	public String scan(Scanner x)
	{
		return x.next();
	}
	public void advanceLine(Scanner x)
	{
		x.nextLine();
	}
	public static int countLines(String filename) throws IOException
	{
		InputStream is = new BufferedInputStream(new FileInputStream(filename));
		try
		{
			byte[] c = new byte[1024];
			int count = 0;
			int readChars = 0;
			boolean empty = true;
			while((readChars = is.read(c)) != -1)
			{
				empty = false;
				for(int i = 0; i < readChars; ++i)
				{
					if(c[i] == '\n')
					{
						++count;
					}
				}
			}
			return (count == 0 && !empty) ? 1 : count;
		} finally
		{
			is.close();
		}
	}
	public static Meta getMeta()
	{
		return m;
	}
}
