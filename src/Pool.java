public class Pool
{
	//TODO Continue adding champion counterpicks/synergies
	//TODO Implement pick preferences and handling for those
	//TODO Code draft procedure
	//TODO Code initial algorithm
	//TODO Find a way to handle fileIO easily for 5s teams and metagame shifts
	//TODO Design and code an easy to use, intuitive GUI

	static Champion Aatrox = new Top("Aatrox",
			new String[] {"Jax", "Riven", "Teemo", "Fiora", "Renekton", "Tryndamere", "Pantheon", "Nasus", "LeeSin", "Ahri"},
			new String[]{"Yasuo", "Zilean", "Tryndamere", "LeeSin", "Ahri"},
			7, 2, 6, 5, 4,
			new String[] {"Jungle"});

	static Champion Ahri = new Mid("Ahri",
			new String[]{"LB", "Annie", "Talon", "Kassadin", "Swain", "Akali", "Diana", "Fizz", "Ryze", "Malzahar"},
			new String[]{"Jax", "Irelia", "Ezreal", "Shen", "Aatrox"},
			2, 7, 3, 4, 7,
			new String[]{});

	static Champion Akali = new Mid("Akali",
			new String[]{"LeeSin", "Garen", "Mordekaiser", "Renekton", "Annie", "Diana", "Rumble", "Katarina", "Swain"},
			new String[]{"Diana", "Katarina", "LB", "Shen", "Ahri"},
			7, 2, 6, 5, 7,
			new String[]{});

	static Champion Alistar = new Support("Alistar",
			new String[]{"Janna", "Vayne", "Lulu", "ChoGath", "Olaf", "Morgana", "Soraka", "Zyra", "Aatrox", "Teemo"},
			new String[]{"Vayne", "Tristana", "Ezreal", "Blitzcrank", "Yasuo"},
			2, 3, 8, 8, 3,
			new String[]{"Jungle", "Top"});

	static Champion Amumu = new Top("Amumu",
			new String[]{"Shyvana", "LeeSin", "Mundo", "Shaco", "Janna", "XinZhao", "Olaf", "KhaZix", "Vi", "Aatrox"},
			new String[]{"Katarina", "Morgana", "Kennen", "Fiddlesticks", "Zyra"},
			1, 4, 6, 9, 4,
			new String[]{"Jungle"});

	static Champion Anivia = new Mid("Anivia",
			new String[]{"Fizz", "Kassadin", "Diana", "Orianna", "Gragas", "Talon", "LB", "Ziggs", "Zed", "Ahri"},
			new String[]{"Jarvan", "Mundo", "Trundle", "Ashe", "Vayne"},
			1, 9, 2, 4, 2,
			new String[]{"Support"});

	static Champion Annie = new Support("Annie",
			new String[]{"Brand", "Orianna", "Morgana", "Kassadin", "Lux", "Syndra", "LB", "Xerath", "Talon", "Ziggs"},
			new String[]{"Amumu", "Jinx", "Lucian", "Blitzcrank", "Caitlyn"},
			3, 7, 3, 5, 2,
			new String[]{"Mid"});

	static Champion Ashe = new ADC("Ashe",
			new String[]{"Ezreal", "Graves", "Sivir", "KhaZix", "Caitlyn", "Draven", "Varus", "Quinn", "Twitch", "KogMaw"},
			new String[]{"Janna", "Leona", "Zyra", "Sona", "Blitzcrank"},
			8, 2, 2, 6, 1,
			new String[]{});

	static Champion Blitzcrank = new Support("Blitzcrank",
			new String[]{"Alistar", "Leona", "Thresh", "Ezreal", "Sivir", "Morgana", "Amumu", "Taric", "Lulu", "Nidalee"},
			new String[]{"Vayne", "Ezreal", "Caitlyn", "Graves", "Draven"},
			2, 4, 6, 7, 5,
			new String[]{});

	static Champion Brand = new Mid("Brand",
			new String[]{"Kassadin", "Fizz", "LB", "Galio", "Lux", "Akali", "Diana", "Talon", "Ahri", "Elise"},
			new String[]{"Amumu", "Jarvan", "Sona", "Vladimir", "Leona"},
			2, 8, 3, 4, 2,
			new String[]{});

	static Champion Caitlyn = new ADC("Caitlyn",
			new String[]{"Sivir", "Jinx", "Varus", "Tristana", "Lucian", "KogMaw", "Jinx", "Draven", "Yasuo", "Leona"},
			new String[]{"Nunu", "Taric", "Leona", "Blitzcrank", "Vi"},
			8, 1, 2, 3, 5,
			new String[]{});

	static Champion Cassiopeia = new Mid("Cassiopeia",
			new String[]{"Galio", "LB", "Talon", "Fizz", "Lux", "Diana", "Kassadin", "Akali", "Zed"},
			new String[]{"Teemo", "Singed", "Yorick", "Amumu", "Katarina"},
			1, 8, 2, 5, 4,
			new String[]{});

	static Champion ChoGath = new Top("ChoGath",
			new String[]{"Warwick", "Vayne", "Kayle", "KogMaw", "Garen", "Renekton", "XinZhao", "Jax", "Fizz", "Aatrox"},
			new String[]{"Yasuo", "Lulu", "Teemo", "Darius", "Aatrox"},
			2, 4, 7, 5, 2,
			new String[]{"Jungle", "Mid"});

	static Champion Corki = new ADC("Corki",
			new String[]{"Caitlyn", "Draven", "Varus", "Urgot", "Lucian", "KogMaw", "Aatrox", "Quinn", "Akali", "Ashe"},
			new String[]{"Leona", "Blitzcrank", "Taric", "Sona", "Soraka"},
			7, 3, 2, 1, 5,
			new String[]{});

	static Champion Darius = new Top("Darius",
			new String[]{"Teemo", "Kayle", "Jayce", "Yorick", "Aatrox", "Renekton", "Jax", "Elise", "ChoGath", "Kennen"},
			new String[]{"Draven", "Garen", "Olaf", "Blitzcrank", "Fiora"},
			6, 1, 6, 4, 2,
			new String[]{"Jungle"});

	static Champion Diana = new Mid("Diana",
			new String[]{"Mordekaiser", "Riven", "Irelia", "Swain", "Syndra", "ChoGath", "Heimerdinger", "Jax", "Ryze", "Ahri"},
			new String[]{"Akali", "Kassadin", "Leona", "Orianna", "Aatrox"},
			3, 6, 2, 5, 5,
			new String[]{"Jungle"});

	static Champion Mundo = new Top("Dr Mundo",
			new String[]{"KogMaw", "Darius", "Trundle", "Riven", "MF", "Fizz", "Tristana", "Shyvana", "Elise", "Aatrox"},
			new String[]{"Anivia", "Teemo", "Nidalee", "Aatrox", "Jax"},
			2, 3, 10, 2, 5,
			new String[]{"Jungle"});

	static Champion Draven = new ADC("Draven",
			new String[]{"Varus", "Caitlyn", "Thresh", "Blitzcrank", "Quinn", "Nami", "Leona", "KogMaw", "Taric", "Teemo"},
			new String[]{"Darius", "Thresh", "Leona", "Taric", "Blitzcrank"},
			10, 0, 1, 2, 5,
			new String[]{});

	static Champion Elise= new Mid("Elise",
			new String[]{"Kassadin", "Wukong", "Yorick", "Mordekaiser", "Malzahar", "LB", "Gangplank", "Riven", "ChoGath", "Akali"},
			new String[]{"Rengar", "Blitzcrank", "Leona", "Karma", "Orianna"},
			2, 6, 5, 4, 5,
			new String[]{"Jungle"});

	static Champion Evelynn = new Jungle("Evelynn",
			new String[]{"Ryze", "LeeSin", "Kassadin", "Mordekaiser", "TF", "Cassiopeia", "Annie", "Malzahar"},
			new String[]{"Shen", "Orianna", "ChoGath", "Udyr", "Fizz"},
			5, 5, 3, 5, 5,
			new String[]{});

	static Champion Ezreal = new ADC("Ezreal",
			new String[]{"Draven", "Graves", "Caitlyn", "MF", "Twitch", "Vayne", "Akali", "Sivir", "Tristana", "Corki"},
			new String[]{"Sona", "Leona", "Taric", "Soraka", "Blitzcrank"},
			8, 3, 2, 0, 6,
			new String[]{});

	static Champion Fiddlesticks = new Jungle("Fiddlesticks",
			new String[]{"Janna", "Xinzhao", "Diana", "Alistar", "Kassadin", "Chogath", "Tristana", "LB", "Aatrox", "Syndra"},
			new String[]{"Amumu", "Galio", "Kennen", "Jarvan", "Orianna"},
			2, 7, 3, 6, 3,
			new String[]{"Mid"});

	static Champion Fiora = new Top("Fiora",
			new String[]{"Jax", "Pantheon", "Malphite", "Singed", "Renekton", "Riven", "Darius", "Teemo", "Elise", "Yorick"},
			new String[]{"Darius", "Morgana", "Amumu", "Blitzcrank", "Ahri"},
			7, 0, 2, 0, 6,
			new String[]{});

	static Champion Fizz = new Mid("Fizz",
			new String[]{"Ryze", "Mordekaiser", "Akali", "Diana", "Kayle", "Lissandra", "Annie", "Elise", "Malzahar", "Zed"},
			new String[]{"Amumu", "Nami", "Aatrox", "Jarvan", "Malphite"},
			3, 8, 1, 2, 7,
			new String[]{"Jungle"});

	static Champion Galio = new Mid("Galio",
			new String[]{"Udyr", "Talon", "Janna", "Yasuo", "Khazix", "Zed", "Lux", "Xinzhao", "Aatrox"},
			new String[]{"Katarina", "Fiddlesticks", "Wukong", "Nunu", "Amumu"},
			1, 6, 6, 7, 2,
			new String[]{"Support"});

	static Champion Gangplank = new Top("Gangplank",
			new String[]{"Pantheon", "Fiora", "Irelia", "Udyr", "Jax", "Riven", "Poppy", "Rumble", "Jayce", "Yorick"},
			new String[]{"Amumu", "TF", "Hecarim", "Aatrox", "Nidalee"},
			5, 2, 5, 4, 5,
			new String[]{"Jungle"});

	static Champion Garen = new Top("Garen",
			new String[]{"Teemo", "Elise", "Pantheon", "Jayce", "Yorick", "Nidalee", "Darius", "Fiora", "Kayle", "Kennen"},
			new String[]{"Lux", "Darius", "Xinzhao", "Jarvan", "Aatrox"},
			2, 2, 10, 4, 5,
			new String[]{});

	static Champion Gragas = new Mid("Gragas",
			new String[]{"Fizz", "Yasuo", "Ahri", "Mordekaiser", "LB", "Evelynn", "Akali", "Fizz", "Ziggs"},
			new String[]{"Ashe", "Malphite", "Khazix", "Aatrox", "Yasuo"},
			2, 7, 6, 5, 4,
			new String[]{});

	static Champion Graves = new ADC("Graves",
			new String[]{"Caitlyn", "Sivir", "MF", "Urgot", "Draven", "Corki", "Tristana", "Aatrox", "Taric", "Kogmaw"},
			new String[]{"Taric", "Leona", "Blitzcrank", "Soraka", "Nami"},
			8, 1, 4, 2, 5,
			new String[]{});

	static Champion Hecarim = new Jungle("Hecarim",
			new String[]{"Nasus", "Sejuani", "Aatrox", "Shyvana", "Warwick", "Leesin", "Udyr"},
			new String[]{"Orianna", "Jayce", "Zilean", "Janna", "Lulu"},
			6, 2, 7, 6, 7,
			new String[]{});

	static Champion Heimerdinger = new Mid("Heimerdinger",
			new String[]{"Zed", "Syndra", "Ziggs", "Velkoz", "Lux", "Nunu", "Gragas", "Xerath", "Orianna", "Malzahar"},
			new String[]{"Blitzcrank", "Vi", "Amumu", "Teemo", "Skarner"},
			1, 7, 4, 5, 5,
			new String[]{});

	static Champion Irelia = new Top("Irelia",
			new String[]{"Olaf", "Jax", "Renekton", "Udyr", "Darius", "Nasus", "Garen", "Singed", "Volibear", "Pantheon"},
			new String[]{"Riven", "Ahri", "Leesin", "Akali", "Orianna"},
			6, 2, 7, 4, 5,
			new String[]{});

	static Champion Janna = new Support("Janna",
			new String[]{"Sona", "Sivir", "Nami", "Aatrox", "Diana", "Hecarim", "Annie", "Yasuo", "Khazix", "Lux"},
			new String[]{"Ashe", "Yasuo", "Draven", "Caitlyn", "Vayne"},
			3, 5, 4, 8, 4,
			new String[]{"Mid"});

	static Champion Jarvan = new Jungle("Jarvan",
			new String[]{"Yorick", "Jax", "Shen", "Elise", "Vi", "Leesin", "Renekton", "Xinzhao", "Garen", "Thresh"},
			new String[]{"Orianna", "Katarina", "Anivia", "MF", "Wukong"},
			5, 2, 5, 7, 7,
			new String[]{"Top"});

	static Champion Jax = new Top("Jax",
			new String[]{"Malphite", "Renekton", "Garen", "Singed", "Jayce", "Pantheon", "Nasus", "Olaf", "Elise", "Yorick"},
			new String[]{"Ahri", "Pantheon", "Orianna", "Zilean", "Lulu"},
			7, 5, 6, 4, 6,
			new String[]{"Jungle"});

	static Champion Jayce = new Top("Jayce",
			new String[]{"Yorick", "Wukong", "Irelia", "Nidalee", "Fiora", "Pantheon", "Xinzhao", "Jarvan", "Elise", "Chogath"},
			new String[]{"Nidalee", "Soraka", "Blitzcrank", "Hecarim", "Leona"},
			7, 0, 6, 4, 5,
			new String[]{"Mid"});

	static Champion Jinx = new ADC("Jinx",
			new String[]{"Ezreal", "Corki", "Vayne", "Sivir", "Varus", "Lucian", "Draven", "Quinn", "Tristana", "Graves"},
			new String[]{"Nami", "Leona", "Thresh", "Blitzcrank", "Sona"},
			9, 0, 2, 5, 2,
			new String[]{});

	static Champion Karma = new Support("Karma",
			new String[]{},
			new String[]{},
			2, 6, 2, 5, 6,
			new String[]{"Mid"});

	static Champion Karthus = new Mid("Karthus",
			new String[]{},
			new String[]{},
			1, 8, 6, 3, 2,
			new String[]{});

	static Champion Kassadin = new Mid("Kassadin",
			new String[]{},
			new String[]{},
			2, 7, 3, 4, 6,
			new String[]{});

	static Champion Katarina = new Mid("Katarina",
			new String[]{},
			new String[]{},
			2, 10, 3, 0, 7,
			new String[]{});

	static Champion Kayle = new Mid("Kayle",
			new String[]{},
			new String[]{},
			4, 7, 4, 4, 6,
			new String[]{"Top", "ADC", "Support", "Jungle"});

	static Champion Kennen = new Mid("Kennen",
			new String[]{},
			new String[]{},
			3, 7, 3, 5, 6,
			new String[]{"Mid"});

	static Champion KhaZix = new Jungle("KhaZix",
			new String[]{},
			new String[]{},
			8, 0, 2, 2, 6,
			new String[]{"Mid"});

	static Champion KogMaw = new ADC("KogMaw",
			new String[]{},
			new String[]{},
			4, 5, 1, 4, 3,
			new String[]{"Mid"});

	static Champion LB = new Mid("LB",
			new String[]{},
			new String[]{},
			0, 10, 2, 5, 7,
			new String[]{"Mid"});

	static Champion LeeSin = new Jungle("LeeSin",
			new String[]{},
			new String[]{},
			6, 1, 4, 4, 8,
			new String[]{"Mid", "Top"});

	static Champion Leona = new Support("Leona",
			new String[]{},
			new String[]{},
			1, 3, 6, 10, 3,
			new String[]{});

	static Champion Lissandra = new Mid("Lissandra",
			new String[]{},
			new String[]{},
			1, 7, 4, 7, 6,
			new String[]{"Support"});

	static Champion Lucian = new ADC("Lucian",
			new String[]{},
			new String[]{},
			8, 1, 2, 0, 6,
			new String[]{});

	static Champion Lulu = new Support("Lulu",
			new String[]{},
			new String[]{},
			2, 4, 3, 5, 5,
			new String[]{"Mid"});

	static Champion Lux = new Mid("Lux",
			new String[]{},
			new String[]{},
			2, 8, 2, 5, 2,
			new String[]{"Support"});

	static Champion Malphite = new Top("Malphite",
			new String[]{},
			new String[]{},
			1, 5, 8, 7, 6,
			new String[]{"Jungle"});

	static Champion Malzahar = new Mid("Malzahar",
			new String[]{},
			new String[]{},
			2, 8, 3, 6, 3,
			new String[]{});

	static Champion Maokai = new Jungle("Maokai",
			new String[]{},
			new String[]{},
			2, 5, 7, 6, 5,
			new String[]{});

	static Champion Yi = new Jungle("Master Yi",
			new String[]{},
			new String[]{},
			8, 0, 2, 0, 8,
			new String[]{"Top"});

	static Champion MF = new ADC("MF",
			new String[]{},
			new String[]{},
			7, 3, 2, 3, 5,
			new String[]{});

	static Champion Mordekaiser = new Mid("Mordekaiser",
			new String[]{},
			new String[]{},
			2, 7, 8, 0, 1,
			new String[]{"Top"});

	static Champion Morgana = new Support("Morgana",
			new String[]{},
			new String[]{},
			1, 6, 3, 6, 3,
			new String[]{"Mid"});

	static Champion Nami = new Support("Nami",
			new String[]{},
			new String[]{},
			3, 5, 2, 7, 5,
			new String[]{});

	static Champion Nasus = new Top("Nasus",
			new String[]{},
			new String[]{},
			4, 4, 7, 4, 2,
			new String[]{"Jungle"});

	static Champion Nautilus = new Jungle("Nautilus",
			new String[]{},
			new String[]{},
			1, 3, 8, 10, 5,
			new String[]{"Support"});

	static Champion Nidalee = new Mid("Nidalee",
			new String[]{},
			new String[]{},
			2, 6, 4, 0, 6,
			new String[]{"Support"});

	static Champion Nocturne = new Jungle("Nocturne",
			new String[]{},
			new String[]{},
			6, 1, 6, 6, 5,
			new String[]{});

	static Champion Nunu = new Jungle("Nunu",
			new String[]{},
			new String[]{},
			2, 5, 6, 5, 5,
			new String[]{"Support"});

	static Champion Olaf = new Top("Olaf",
			new String[]{},
			new String[]{},
			6, 0, 6, 4, 3,
			new String[]{"Jungle"});

	static Champion Orianna = new Mid("Orianna", 
			new String[]{"LB", "Syndra", "Diana", "Ahri", "Gragas", "Zed", "Ziggs", "Akali", "Lux", "Talon"},
			new String[]{"Malphite", "Jarvan", "Wukong", "Zac", "Amumu"},
			3, 8, 7, 3, 6,
			new String[]{"Support"});

	static Champion Pantheon = new Jungle("Pantheon",
			new String[]{},
			new String[]{},
			6, 3, 5, 4, 5,
			new String[]{"Top"});

	static Champion Poppy = new Top("Poppy",
			new String[]{},
			new String[]{},
			6, 0, 9, 4, 5,
			new String[]{});

	static Champion Quinn = new ADC("Quinn",
			new String[]{},
			new String[]{},
			8, 0, 2, 4, 7,
			new String[]{"Top"});

	static Champion Rammus = new Jungle("Rammus",
			new String[]{},
			new String[]{},
			2, 3, 6, 5, 7,
			new String[]{});

	static Champion Renekton = new Top("Renekton",
			new String[]{},
			new String[]{},
			6, 0, 7, 4, 6,
			new String[]{});

	static Champion Rengar = new Jungle("Rengar",
			new String[]{},
			new String[]{},
			7, 0, 4, 5, 6,
			new String[]{"Top"});

	static Champion Riven = new Top("Riven",
			new String[]{},
			new String[]{},
			9, 0, 4, 5, 9,
			new String[]{});

	static Champion Rumble = new Top("Rumble",
			new String[]{},
			new String[]{},
			2, 5, 6, 5, 5,
			new String[]{});

	static Champion Ryze = new Top("Ryze",
			new String[]{},
			new String[]{},
			2, 8, 6, 3, 4,
			new String[]{"Mid"});

	static Champion Sejuani = new Jungle("Sejuani",
			new String[]{},
			new String[]{},
			2, 6, 6, 6, 4,
			new String[]{});	

	static Champion Shaco = new Jungle("Shaco",
			new String[]{},
			new String[]{},
			4, 6, 3, 4, 7,
			new String[]{});

	static Champion Shen = new Top("Shen",
			new String[]{},
			new String[]{},
			2, 3, 9, 4, 5,
			new String[]{});

	static Champion Shyvana = new Jungle("Shyvana",
			new String[]{},
			new String[]{},
			5, 1, 7, 3, 7,
			new String[]{"Top"});

	static Champion Singed = new Top("Singed",
			new String[]{},
			new String[]{},
			1, 5, 7, 5, 7,
			new String[]{});

	static Champion Sion = new Top("Sion",
			new String[]{},
			new String[]{},
			4, 4, 7, 3, 2,
			new String[]{"Mid"});

	static Champion Sivir = new ADC("Sivir",
			new String[]{},
			new String[]{},
			9, 1, 2, 0, 5,
			new String[]{});

	static Champion Skarner = new Jungle("Skarner",
			new String[]{},
			new String[]{},
			3, 3, 7, 7, 5,
			new String[]{});

	static Champion Sona = new Support("Sona",
			new String[]{},
			new String[]{},
			3, 3, 7, 7, 5,
			new String[]{});

	static Champion Soraka = new Support("Soraka",
			new String[]{},
			new String[]{},
			1, 4, 7, 3, 2,
			new String[]{});

	static Champion Swain = new Mid("Swain",
			new String[]{},
			new String[]{},
			1, 7, 6, 4, 2,
			new String[]{"Top"});
	static Champion Syndra = new Mid("Syndra",
			new String[]{},
			new String[]{},
			1, 10, 3, 5, 4,
			new String[]{});
	static Champion Talon = new Mid("Talon",
			new String[]{},
			new String[]{},
			8, 0, 3, 3, 6,
			new String[]{});
	static Champion Taric = new Support("Taric",
			new String[]{},
			new String[]{},
			1, 1, 10, 6, 3,
			new String[]{});
	static Champion Teemo = new Mid("Teemo",
			new String[]{},
			new String[]{},
			3, 5, 3, 5, 7,
			new String[]{"Top", "Support"});
	static Champion Thresh = new Support("Thresh",
			new String[]{},
			new String[]{},
			3, 4, 6, 10, 6,
			new String[]{"ADC"});
	static Champion Tristana = new ADC("Tristana",
			new String[]{},
			new String[]{},
			8, 4, 2, 4, 6,
			new String[]{});
	static Champion TF = new Mid("TF",
			new String[]{},
			new String[]{},
			4, 8, 2, 4, 6,
			new String[]{"ADC"});
	static Champion Trundle = new Top("Trundle",
			new String[]{},
			new String[]{},
			5, 1, 6, 6, 5,
			new String[]{"Jungle"});
	static Champion Tryndamere = new Top("Skarner",
			new String[]{},
			new String[]{},
			7, 3, 7, 3, 3,
			new String[]{"Jungle"});
	static Champion Twitch = new ADC("Twitch",
			new String[]{},
			new String[]{},
			10, 0, 3, 3, 5,
			new String[]{});
	static Champion Udyr = new Jungle("Udyr",
			new String[]{},
			new String[]{},
			5, 2, 7, 4, 7,
			new String[]{"Top"});
	static Champion Urgot = new Jungle("Urgot",
			new String[]{},
			new String[]{},
			6, 1, 5, 6, 2,
			new String[]{});
	static Champion Varus = new Jungle("Varus",
			new String[]{},
			new String[]{},
			8, 2, 2, 5, 2,
			new String[]{});
	static Champion Vayne = new Jungle("Vayne",
			new String[]{},
			new String[]{},
			11, 0, 1, 2, 6,
			new String[]{});
	static Champion Veigar = new Jungle("Veigar",
			new String[]{},
			new String[]{},
			3, 3, 7, 7, 5,
			new String[]{});
	static Champion VelKoz = new Jungle("VelKoz",
			new String[]{},
			new String[]{},
			1, 9, 3, 4, 2,
			new String[]{});
	static Champion Vi = new Jungle("Vi",
			new String[]{},
			new String[]{},
			5, 0, 5, 8, 6,
			new String[]{});
	static Champion Viktor = new Jungle("Viktor",
			new String[]{},
			new String[]{},
			1, 8, 2, 6, 2,
			new String[]{});
	static Champion Vladimir = new Jungle("Vladimir",
			new String[]{},
			new String[]{},
			1, 7, 5, 3, 3,
			new String[]{});
	static Champion Volibear = new Jungle("Volibear",
			new String[]{},
			new String[]{},
			3, 2, 7, 4, 7,
			new String[]{});
	static Champion Warwick = new Jungle("Warwick",
			new String[]{},
			new String[]{},
			5, 4, 5, 4, 4,
			new String[]{"Top"});
	static Champion Wukong = new Jungle("Wukong",
			new String[]{},
			new String[]{},
			6, 0, 4, 7, 6,
			new String[]{"Top"});
	static Champion Xerath = new Mid("Xerath",
			new String[]{},
			new String[]{},
			1, 7, 3, 5, 2,
			new String[]{});
	static Champion XinZhao = new Jungle("XinZhao",
			new String[]{},
			new String[]{},
			3, 3, 7, 7, 5,
			new String[]{"Top"});
	static Champion Yasuo = new Mid("Yasuo",
			new String[]{},
			new String[]{},
			6, 0, 5, 5, 8,
			new String[]{"Top"});

	static Champion Yorick = new Top("Yorick",
			new String[]{},
			new String[]{},
			3, 4, 7, 4, 4,
			new String[]{});
	static Champion Zac = new Jungle("Zac",
			new String[]{},
			new String[]{},
			1, 4, 7, 7, 6,
			new String[]{"Top"});
	static Champion Zed = new Mid("Zed",
			new String[]{},
			new String[]{},
			9, 0, 2, 2, 8,
			new String[]{"Jungle", "Top"});
	static Champion Ziggs = new Mid("Ziggs",
			new String[]{},
			new String[]{},
			3, 8, 2, 5, 4,
			new String[]{});
	static Champion Zilean = new Support("Zilean",
			new String[]{},
			new String[]{},
			1, 4, 6, 3, 6,
			new String[]{"Mid"});
	static Champion Zyra = new Support("Zyra",
			new String[]{},
			new String[]{},
			1, 6, 3, 7, 2,
			new String[]{"Mid"});

	public static Champion[] pool = new Champion[]{Aatrox, Ahri, Akali, Alistar, Amumu, Anivia, Annie, Ashe, Blitzcrank, Brand, Caitlyn, Cassiopeia, ChoGath, Corki, Darius, Diana, Mundo, Draven, Elise, Evelynn, Ezreal, Fiddlesticks, Fiora, Fizz, Galio, Gangplank, Garen, Gragas, Graves, Hecarim, Heimerdinger, Irelia, Janna, Jarvan, Jax, Jayce, Jinx, Karma, Karthus, Kassadin, Katarina, Kayle, Kennen, KhaZix, KogMaw, LB, LeeSin, Leona, Lissandra, Lucian, Lulu, Lux, Malphite, Malzahar, Maokai, Yi, MF, Mordekaiser, Morgana, Nami, Nasus, Nautilus, Nidalee, Nocturne, Nunu, Olaf, Orianna, Pantheon, Poppy, Quinn, Rammus, Renekton, Rengar, Riven, Rumble, Ryze, Sejuani, Shaco, Shen, Shyvana, Singed, Sion, Sivir, Skarner, Sona, Soraka, Swain, Syndra, Talon, Taric, Teemo, Thresh, Tristana, Trundle, Tryndamere, TF, Twitch, Udyr, Urgot, Varus, Vayne, Veigar, VelKoz, Vi, Viktor, Vladimir, Volibear, Warwick, Wukong, Xerath, XinZhao, Yasuo, Yorick, Zac, Zed, Ziggs, Zilean, Zyra};	


	public static void main(String[] args)
	{


	}
	public static Champion[] getPool()
	{
		return pool;
	}
}
