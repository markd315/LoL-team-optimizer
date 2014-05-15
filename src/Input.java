import java.util.*;
import java.io.*;

public class Input
{
	static Scanner meta;
	static Scanner players;
	ArrayList<Player> playerData;
	private static Meta m;
	public Input() throws IOException
	{
		//Input meta
		meta = new Scanner(new File("src/meta.cfg"));
		meta.nextLine();
		String aa = meta.nextLine();
		String bb = meta.nextLine();
		String cc = meta.nextLine();
		String dd = meta.nextLine();
		String ee = meta.nextLine();
		m = new Meta(tokenize(aa), tokenize(bb), tokenize(cc), tokenize(dd), tokenize(ee));
		
		
		//Input players
		players = new Scanner(new File("src/yourPlayers.cfg"));
		ArrayList<String> playerNames = new ArrayList<String>();
		players.nextLine();
		while(players.hasNext())
		{
			playerNames.add(players.next());
		}
		playerData = new ArrayList<Player>();
		for(String name : playerNames)
		{
			Scanner x = new Scanner(new File("src/" + name + ".cfg"));
			x.nextLine(); //clears comment line of cfg file
			String a = x.nextLine();
			String b = x.nextLine();
			String c = x.nextLine();
			String d = x.nextLine();
			String e = x.nextLine();		
			Player pl = new Player(name, tokenize(a), tokenize(b), tokenize(c), tokenize(d), tokenize(e));
			playerData.add(pl);
			x.close();
		}
	}
	public Champion[] tokenize(String x)
	{
		ArrayList<Champion> c = new ArrayList<Champion>();
		StringTokenizer st = new StringTokenizer(x);
		while (st.hasMoreTokens()) 
		{
			c.add(find(st.nextToken()));
		}
		return c.toArray(null);
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
	public ArrayList<Player> getPlayerData()
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
	public static int countLines(String filename) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream(filename));
		try {
			byte[] c = new byte[1024];
			int count = 0;
			int readChars = 0;
			boolean empty = true;
			while ((readChars = is.read(c)) != -1) {
				empty = false;
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n') {
						++count;
					}
				}
			}
			return (count == 0 && !empty) ? 1 : count;
		} finally {
			is.close();
		}
	}
	public static Meta getMeta()
	{
		return m;
	}

}
