import java.io.IOException;

public class Pool
{
	//TODO handle incorrect champion name
	//TODO Alpha test
	// Kinda done? Finish finding a way to handle fileIO easily for 5s teams
	//TODO Handle fileIO for metagame
	//TODO Handle exceptions
	//TODO Provide toggles/sliders for algorithm weight
	
	//TODO Menu for after pool recommendations
	//TODO Design and code an easy to use, intuitive GUI
	//TODO Update for Braum
	
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
			new String[]{"Veigar", "Nami", "Malzahar", "Talon", "Xerath", "Aatrox", "Swain", "Leesin", "Zac", "Sona"},
			new String[]{"Ezreal", "Lucian", "Jinx", "Caitlyn", "Vayne"},
			2, 6, 2, 5, 6,
			new String[]{"Mid"});
	static Champion Karthus = new Mid("Karthus",
			new String[]{"Kassadin", "Katarina", "Fizz", "Soraka", "Lux", "Akali", "Ahri", "Veigar", "LB", "Orianna"},
			new String[]{"Kayle", "Yorick", "Amumu", "Vladimir", "Soraka"},
			1, 8, 6, 3, 2,
			new String[]{});
	static Champion Kassadin = new Mid("Kassadin",
			new String[]{"Talon", "Pantheon", "Mordakaiser", "Fizz", "Khazix", "Heimerdinger", "Zed", "Sion", "Swain", "Gangplank"},
			new String[]{"Diana", "Leesin", "Aatrox", "Khazix", "Amumu"},
			2, 7, 3, 4, 6,
			new String[]{});
	static Champion Katarina = new Mid("Katarina",
			new String[]{"Diana", "Fiddlesticks", "Malzahar", "Lissadra", "Fizz", "LB", "Annie", "Chogath", "Talon"},
			new String[]{"Amumu", "Galio", "Jarvan", "Akali", "Malphite"},
			2, 10, 3, 0, 7,
			new String[]{});
	static Champion Kayle = new Mid("Kayle",
			new String[]{"Pantheon", "Anivia", "Gragas", "Xinzhao", "Jarvan", "Annie", "Ziggs", "Malzahar", "LB", "Orianna"},
			new String[]{"Karthus", "Ezreal", "Katarina", "Tryndamere", "Morgana"},
			4, 7, 4, 4, 6,
			new String[]{"Top", "ADC", "Support", "Jungle"});
	static Champion Kennen = new Mid("Kennen",
			new String[]{"Ryze", "Janna", "Swain", "Yorick", "Irelia", "LB", "Fiora", "Annie", "Kassadin", "Lux"},
			new String[]{"Amumu", "Vladimir", "Fiddlesticks", "Wukong", "Jarvan"},
			3, 7, 3, 5, 6,
			new String[]{"Mid"});
	static Champion KhaZix = new Jungle("KhaZix",
			new String[]{"Leesin", "Rengar", "Jax", "Jayce", "Yorick", "Pantheon", "Ryze", "Renekton", "Garen", "Shen"},
			new String[]{"Rengar", "Xinzhao", "Aatrox", "Blitzcrank", "Morgana"},
			8, 0, 2, 2, 6,
			new String[]{"Mid"});
	static Champion KogMaw = new ADC("KogMaw",
			new String[]{"Jinx", "Blitzcrank", "Sivir", "Akali", "LB", "Draven", "Tristana", "Ahri", "MF", "Lucian"},
			new String[]{"Nunu", "Lulu", "Soraka", "Taric", "Janna"},
			4, 5, 1, 4, 3,
			new String[]{"Mid"});
	static Champion LB = new Mid("LB",
			new String[]{"Galio", "Fizz", "Sion", "Mordekaiser", "Diana", "Talon", "Morgana", "Syndra", "Zed", "Yasuo"},
			new String[]{"Akali", "Udyr", "Amumu", "Maokai", "Veigar"},
			0, 10, 2, 5, 7,
			new String[]{"Mid"});
	static Champion LeeSin = new Jungle("LeeSin",
			new String[]{"Trundle", "Udyr", "Renekton", "Garen", "Jax", "Riven", "Pantheon", "Darius", "Aatrox"},
			new String[]{"Teemo", "Aatrox", "Warwick", "Ryze", "Kassadin"},
			6, 1, 4, 4, 8,
			new String[]{"Mid", "Top"});
	static Champion Leona = new Support("Leona",
			new String[]{"Alistar", "Morgana", "Lulu", "Janna", "Thresh", "Zyra", "Karma", "Annie", "Sivir", "Lux"},
			new String[]{"Ezreal", "Corki", "Varus", "Graves", "Vayne"},
			1, 3, 6, 10, 3,
			new String[]{});
	static Champion Lissandra = new Mid("Lissandra",
			new String[]{"Kassadin", "Lux", "Anivia", "Diana", "LB", "Brand", "Ahri", "Syndra", "Morgana", "Cassiopeia" },
			new String[]{"Sejuani", "Trundle", "Amumu", "Ashe", "Malphite"},
			1, 7, 4, 7, 6,
			new String[]{"Support"});
	static Champion Lucian = new ADC("Lucian",
			new String[]{"Vayne", "Draven", "Ezreal", "Caitlyn", "Quinn", "Graves", "Tristana", "Sivir", "Aatrox"},
			new String[]{"Thresh", "Leona", "Nami", "Soraka", "Blitzcrank"},
			8, 1, 2, 0, 6,
			new String[]{});
	static Champion Lulu = new Support("Lulu",
			new String[]{"Soraka", "Sona", "Syndra", "Sivir", "Ziggs", "Morgana", "Caitlyn", "Orianna", "Brand", "Viktor"},
			new String[]{"Vayne", "Ezreal", "Caitlyn", "Chogath", "Kogmaw"},
			2, 4, 3, 5, 5,
			new String[]{"Mid"});
	static Champion Lux = new Mid("Lux",
			new String[]{"Talon", "Fizz", "Katarina", "Kassadin", "Zed", "Gragas", "Yasuo", "Diana", "LB", "Yi"},
			new String[]{"Ezreal", "Garen", "Caitlyn", "Jinx", "Ashe"},
			2, 8, 2, 5, 2,
			new String[]{"Support"});
	static Champion Malphite = new Top("Malphite",
			new String[]{"Rumble", "Chogath", "Vladimir", "Yorick", "Shen", "Riven", "Olaf", "Nasus", "Vi", "Warwick"},
			new String[]{"Orianna", "Yasuo", "Katarina", "Amumu", "Mordekaiser"},
			1, 5, 8, 7, 6,
			new String[]{"Jungle"});
	static Champion Malzahar = new Mid("Malzahar",
			new String[]{"Gangplank", "Lux", "Galio", "LB", "Talon", "Morgana", "Ziggs", "Syndra", "Diana", "Fizz"},
			new String[]{"Warwick", "Jarvan", "Amumu", "Maokai", "Skarner"},
			2, 8, 3, 6, 3,
			new String[]{});
	static Champion Maokai = new Jungle("Maokai",
			new String[]{"Shyvana", "Mundo", "Leesin", "Shaco", "Chogath", "Teemo", "Vi", "Jax"},
			new String[]{"Ryze", "Swain", "Orianna", "Zyra", "Anivia"},
			2, 5, 7, 6, 5,
			new String[]{});
	static Champion Yi = new Jungle("Yi",
			new String[]{"Jax", "Teemo", "Aatrox", "Rammus", "Pantheon", "Wukong", "Chogath", "Fiora", "Fiddlesticks", "Fizz"},
			new String[]{"Ashe", "Amumu", "Lux", "Morgana", "Aatrox"},
			8, 0, 2, 0, 8,
			new String[]{"Top"});
	static Champion MF = new ADC("MF",
			new String[]{"Tristana", "Draven", "Caitlyn", "Taric", "Varus", "Quinn", "Sivir", "Leona", "Aatrox"},
			new String[]{"Sona", "Leona", "Thresh", "Taric", "Nami"},
			7, 3, 2, 3, 5,
			new String[]{});
	static Champion Mordekaiser = new Mid("Mordekaiser",
			new String[]{"Garen", "Zyra", "Cassiopeia", "Swain", "Yorick", "Malzahar", "Lux", "Kayle", "Ziggs", "Aatrox"},
			new String[]{"Yorick", "Malphite", "Wukong", "Skarner", "Amumu"},
			2, 7, 8, 0, 1,
			new String[]{"Top"});
	static Champion Morgana = new Support("Morgana",
			new String[]{"Talon", "Mordekaiser", "Vladimir", "Katarina", "Fizz", "Gangplank", "Zed", "Ahri", "Gragas", "Orianna"},
			new String[]{"Amumu", "Katarina", "Draven", "Jinx", "Varus"},
			1, 6, 3, 6, 3,
			new String[]{"Mid"});
	static Champion Nami = new Support("Nami",
			new String[]{"Lulu", "Ezreal", "Leona", "Fizz", "Morgana", "Blitzcrank", "Vayne", "Yasuo", "Aatrox", "Sona"},
			new String[]{"Vayne", "Jinx", "Caitlyn", "Graves", "Ezreal"},
			3, 5, 2, 7, 5,
			new String[]{});
	static Champion Nasus = new Top("Nasus",
			new String[]{"Teemo", "Riven", "Garen", "Rumble", "Pantheon", "Darius", "Renekton", "Olaf", "Vladimir", "Leesin"},
			new String[]{"Renekton", "Zed", "Lulu", "Kayle", "Aatrox"},
			4, 4, 7, 4, 2,
			new String[]{"Jungle"});
	static Champion Nautilus = new Jungle("Nautilus",
			new String[]{"Shyvana", "Udyr", "Vi", "Yorick", "Aatrox", "Janna", "Khazix"},
			new String[]{"Yasuo", "Ezreal", "Ashe", "Vayne", "Thresh"},
			1, 3, 8, 10, 5,
			new String[]{"Support"});
	static Champion Nidalee = new Mid("Nidalee",
			new String[]{"Yasuo", "Pantheon", "Fizz", "Akali", "LB", "Katarina", "Xinzhao", "Diana", "Zed", "Ahri"},
			new String[]{"Caitlyn", "Varus", "Jayce", "Ezreal", "Ashe"},
			2, 6, 4, 0, 6,
			new String[]{"Support"});
	static Champion Nocturne = new Jungle("Nocturne",
			new String[]{"Olaf", "Udyr", "Graves", "Vi", "Karma", "Shyvana", "Xinzhao", "Khazix", "Aatrox", "Jax"},
			new String[]{"TF", "Shen", "Orianna", "Rengar", "Lucian"},
			6, 1, 6, 6, 5,
			new String[]{});
	static Champion Nunu = new Jungle("Nunu",
			new String[]{"Cassiopeia", "Sona", "Soraka", "Sivir", "Janna", "Riven", "Alistar", "Leona", "Nocturne", "Nami"},
			new String[]{"Vayne", "Kogmaw", "Caitlyn", "Ashe", "MF"},
			2, 5, 6, 5, 5,
			new String[]{"Support"});
	static Champion Olaf = new Top("Olaf",
			new String[]{"Kennen", "Volibear", "Kayle", "Yorick", "Jarvan", "Elise", "Pantheon", "Jayce", "Darius", "Garen"},
			new String[]{"Darius", "Blitzcrank", "Aatrox", "Amumu", "Skarner"},
			6, 0, 6, 4, 3,
			new String[]{"Jungle"});
	static Champion Orianna = new Mid("Orianna", 
			new String[]{"LB", "Syndra", "Diana", "Ahri", "Gragas", "Zed", "Ziggs", "Akali", "Lux", "Talon"},
			new String[]{"Malphite", "Jarvan", "Wukong", "Zac", "Amumu"},
			3, 8, 7, 3, 6,
			new String[]{"Support"});
	static Champion Pantheon = new Jungle("Pantheon",
			new String[]{"Shen", "Yorick", "Udyr", "Elise", "Malphite", "Darius", "Olaf", "Chogath", "Aatrox", "Vladimir"},
			new String[]{"Taric", "Blitzcrank", "Xinzhao", "Jax", "Shen"},
			6, 3, 5, 4, 5,
			new String[]{"Top"});
	static Champion Poppy = new Top("Poppy",
			new String[]{"Olaf", "Darius", "Teemo", "Irelia", "Renekton", "Ahri", "Kennen", "Rumble", "Yorick", "Kayle"},
			new String[]{"Vayne", "Chogath", "Aatrox", "Alistar", "Jayce"},
			6, 0, 9, 4, 5,
			new String[]{});
	static Champion Quinn = new ADC("Quinn",
			new String[]{"Caitlyn", "Varus", "MF", "Tristana", "Draven", "Graves", "Corki", "Kogmaw", "Aatrox"},
			new String[]{"Leona", "Thresh", "Blitzcrank", "Nami", "Taric"},
			8, 0, 2, 4, 7,
			new String[]{"Top"});
	static Champion Rammus = new Jungle("Rammus",
			new String[]{"Trundle", "Vi", "Shyvana", "Olaf", "Mundo", "Morgana", "Chogath", "Udyr", "Jarvan"},
			new String[]{"Ashe", "Shen", "Fizz", "Ahri", "Yasuo"},
			2, 3, 6, 5, 7,
			new String[]{});
	static Champion Renekton = new Top("Renekton",
			new String[]{"Garen", "Ryze", "Pantheon", "Elise", "Vayne", "Shyvana", "Trundle", "Olaf", "Kennen", "Vladimir"},
			new String[]{"Nasus", "Aatrox", "Lulu", "Ahri", "Amumu"},
			6, 0, 7, 4, 6,
			new String[]{});
	static Champion Rengar = new Jungle("Rengar",
			new String[]{"Jax", "Fiora", "Pantheon", "Leesin", "Darius", "Riven", "Renekton", "Teemo", "Garen", "Irelia"},
			new String[]{"Khazix", "Elise", "Shen", "Orianna", "Nocturne"},
			7, 0, 4, 5, 6,
			new String[]{"Top"});
	static Champion Riven = new Top("Riven",
			new String[]{"Garen", "Olaf", "Renekton", "Jax", "Kennen", "Darius", "Pantheon", "Fiora", "Shyvana", "Jayce"},
			new String[]{"Irelia", "Amumu", "Orianna", "Ahri", "Aatrox"},
			9, 0, 4, 5, 9,
			new String[]{});
	static Champion Rumble = new Top("Rumble",
			new String[]{"Yorick", "Xinzhao", "Jayce", "Elise", "Viktor", "Darius", "Riven", "Renekton", "Volibear", "Leesin"},
			new String[]{"Amumu", "Jarvan", "Sejuani", "Kennen", "Sona"},
			2, 5, 6, 5, 5,
			new String[]{});
	static Champion Ryze = new Top("Ryze",
			new String[]{"Cassiopeia", "Xerath", "Brand", "Anivia", "Lux", "Ziggs", "Orianna", "TF", "Zyra", "Kassadin"},
			new String[]{"Maokai", "Leesin", "Udyr", "Jax", "Amumu"},
			2, 8, 6, 3, 4,
			new String[]{"Mid"});
	static Champion Sejuani = new Jungle("Sejuani",
			new String[]{"Xinzhao", "Leesin", "Olaf", "Morgana", "Jarvan", "Vi", "Elise", "Nocturne", "Aatrox", "Jayce"},
			new String[]{"Lissandra", "Katarina", "Talon", "Rumble", "Wukong"},
			2, 6, 6, 6, 4,
			new String[]{});	
	static Champion Shaco = new Jungle("Shaco",
			new String[]{"Leesin", "Vi", "Riven", "Warwick", "Olaf", "Jax", "Teemo", "Udyr", "Shyvana", "Rengar"},
			new String[]{"Blitzcrank", "Shen", "Teemo", "Yorick", "Singed"},
			4, 6, 3, 4, 7,
			new String[]{});
	static Champion Shen = new Top("Shen",
			new String[]{"Yorick", "Warwick", "Jayce", "Vladimir", "Teemo", "Jax", "Kayle", "Darius", "Olaf", "Elise"},
			new String[]{"TF", "Akali", "Zed", "Rengar", "Nocturne"},
			2, 3, 9, 4, 5,
			new String[]{});
	static Champion Shyvana = new Jungle("Shyvana",
			new String[]{"Olaf", "Teemo", "Elise", "Yasuo", "Darius", "Trundle", "Pantheon", "Yorick", "Fiora", "Jax"},
			new String[]{"Orianna", "Shen", "Jarvan", "Yasuo", "Riven"},
			5, 1, 7, 3, 7,
			new String[]{"Top"});
	static Champion Singed = new Top("Singed",
			new String[]{"Teemo", "Vladimir", "Jayce", "Elise", "Kayle", "Kennen", "Darius", "Vayne", "Nidalee", "Rumble"},
			new String[]{"Cassiopeia", "Volibear", "Teemo", "Zilean", "Sion"},
			1, 5, 7, 5, 7,
			new String[]{});
	static Champion Sion = new Top("Sion",
			new String[]{"Morgana", "Teemo", "Jax", "Nasus", "Darius", "Garen", "Pantheon", "Riven", "Mordekaiser"},
			new String[]{"Talon", "Pantheon", "Singed", "Taric", "Jax"},
			4, 4, 7, 3, 2,
			new String[]{"Mid"});
	static Champion Sivir = new ADC("Sivir",
			new String[]{"Vayne", "Draven", "Twitch", "Khazix", "MF", "Corki", "Tristana", "Aatrox", "Lucian", "Draven"},
			new String[]{"Taric", "Soraka", "Leona", "Thresh", "Blitzcrank"},
			9, 1, 2, 0, 5,
			new String[]{});
	static Champion Skarner = new Jungle("Skarner",
			new String[]{"Morgana", "Ashe", "Sona", "Shyvana", "Gangplank", "Nautilus", "Aatrox", "Renekton", "Xinzhao", "Ryze"},
			new String[]{"Thresh", "Orianna", "Jayce", "Mordekaiser", "Heimerdinger"},
			3, 3, 7, 7, 5,
			new String[]{});
	static Champion Sona = new Support("Sona",
			new String[]{"Blitzcrank", "Leona", "Thresh", "MF", "Draven", "Taric", "Nidalee", "Aatrox", "Zyra", "Caitlyn"},
			new String[]{"Ezreal", "MF", "Ashe", "Varus", "Caitlyn"},
			3, 3, 7, 7, 5,
			new String[]{});
	static Champion Soraka = new Support("Soraka",
			new String[]{"MF", "Tristana", "Blitzcrank", "Varus", "Zac", "Leona", "Hecarim", "Thresh", "Orianna", "Aatrox"},
			new String[]{"Ezreal", "Graves", "Varus", "Urgot", "Sivir"},
			1, 4, 7, 3, 2,
			new String[]{"Mid"});
	static Champion Swain = new Mid("Swain",
			new String[]{"Viktor", "Fizz", "Cassiopeia", "Lux", "LB", "Syndra", "Galio", "Ziggs", "Orianna"},
			new String[]{"Maokai", "Amumu", "Aatrox", "Jarvan", "Vladimir"},
			1, 7, 6, 4, 2,
			new String[]{"Top"});
	static Champion Syndra = new Mid("Syndra",
			new String[]{"Fizz", "Talon", "LB", "Akali", "Ziggs", "Lux", "Zed", "Gragas"},
			new String[]{"Zilean", "Nami", "Zac", "Maokai", "Teemo"},
			1, 10, 3, 5, 4,
			new String[]{});
	static Champion Talon = new Mid("Talon",
			new String[]{"Leesin", "Diana", "Riven", "Pantheon", "Yorick", "Kayle", "Mordekaiser", "Gragas", "Sion", "Wukong"},
			new String[]{"Zed", "Sion", "Darius", "Sejuani", "Amumu"},
			8, 0, 3, 3, 6,
			new String[]{});
	static Champion Taric = new Support("Taric",
			new String[]{"Sivir", "Lulu", "Nami", "Morgana", "Alistar", "Corki", "Leona", "Varus", "Thresh", "Aatrox"},
			new String[]{"Graves", "Ezreal", "Caitlyn", "Draven", "Vayne"},
			1, 1, 10, 6, 3,
			new String[]{});
	static Champion Teemo = new Mid("Teemo",
			new String[]{"Yorick", "Pantheon", "Rumble", "Jayce", "Zed", "Akali", "Wukong", "Leesin", "Jax", "Katarina"},
			new String[]{"Cassiopeia", "Leesin", "Blitzcrank", "Volibear", "Singed"},
			3, 5, 3, 5, 7,
			new String[]{"Top", "Support"});
	static Champion Thresh = new Support("Thresh",
			new String[]{"Lulu", "Alistar", "Lucian", "Morgana", "Leona", "Ezreal", "Janna", "Zyra", "Sivir"},
			new String[]{"Draven", "Vayne", "Lucian", "Caitlyn", "Jinx"},
			3, 4, 6, 10, 6,
			new String[]{"ADC"});
	static Champion Tristana = new ADC("Tristana",
			new String[]{"Corki", "Draven", "Caitlyn", "Diana", "Sivir", "Twitch", "Lux", "Kogmaw", "Talon", "Caitlyn"},
			new String[]{"Leona", "Alistar", "Thresh", "Taric", "Blitzcrank"},
			8, 4, 2, 4, 6,
			new String[]{});
	static Champion TF = new Mid("TF",
			new String[]{"Fizz", "Diana", "Ahri", "LB", "Kassadin", "Akali", "Nocturne", "Zed", "Khazix", "Lux"},
			new String[]{"Nocturne", "Shen", "Gangplank", "Rammus", "Taric"},
			4, 8, 2, 4, 6,
			new String[]{"ADC"});
	static Champion Trundle = new Top("Trundle",
			new String[]{"Sona", "Jax", "Teemo", "Kennen", "Pantheon", "Ahri", "Aatrox", "Vladimir", "Heimerdinger", "Jayce"},
			new String[]{"Anivia", "Lissandra", "Vayne", "Blitzcrank", "Aatrox"},
			5, 1, 6, 6, 5,
			new String[]{"Jungle"});
	static Champion Tryndamere = new Top("Skarner",
			new String[]{"Teemo", "Jax", "Malphite", "Rammus", "Renekton", "Nasus", "Pantheon", "Leesin", "Garen", "Fiora"},
			new String[]{"Aatrox", "Kayle", "Zilean", "Ashe", "Nunu"},
			7, 3, 7, 3, 3,
			new String[]{"Jungle"});
	static Champion Twitch = new ADC("Twitch",
			new String[]{"Caitlyn", "Leesin", "Corki", "Draven", "Jinx", "Varus", "Quinn", "MF", "Lulu", "Graves"},
			new String[]{"Taric", "Leona", "Thresh", "Nami", "Blitzcrank"},
			10, 0, 3, 3, 5,
			new String[]{});
	static Champion Udyr = new Jungle("Udyr",
			new String[]{"Ashe", "Trundle", "Teemo", "Kayle", "Jax", "Elise", "Janna", "Garen", "Trundle", "Aatrox"},
			new String[]{"LB", "Ryze", "Janna", "Aatrox", "Amumu"},
			5, 2, 7, 4, 7,
			new String[]{"Top"});
	static Champion Urgot = new Jungle("Urgot",
			new String[]{"Soraka", "Sivir", "Nami", "Yasuo", "Thresh", "Caitlyn", "Nidalee", "LB", "MF", "Zed"},
			new String[]{"Soraka", "Taric", "Alistar", "Thresh", "Leona"},
			6, 1, 5, 6, 2,
			new String[]{});
	static Champion Varus = new Jungle("Varus",
			new String[]{"Graves", "Lucian", "Sivir", "Tristana", "Blitzcrank", "Leona", "Lucian", "Aatrox", "Thresh", "Kogmaw"},
			new String[]{"Leona", "Thresh", "Soraka", "Sona", "Nami"},
			8, 2, 2, 5, 2,
			new String[]{});
	static Champion Vayne = new Jungle("Vayne",
			new String[]{"Caitlyn", "Draven", "Quinn", "Graves", "Jinx", "Varus", "Ashe", "Corki", "Tristana", "MF"},
			new String[]{"Nunu", "Blitzcrank", "Alistar", "Thresh", "Leona"},
			11, 0, 1, 2, 6,
			new String[]{});
	static Champion Veigar = new Jungle("Veigar",
			new String[]{"Fizz", "Ryze", "Talon", "Kassadin", "Zed", "LB", "Katarina", "Galio", "Diana", "Akali"},
			new String[]{"Warwick", "Amumu", "Lux", "Maokai", "Chogath"},
			3, 3, 7, 7, 5,
			new String[]{});
	static Champion VelKoz = new Jungle("VelKoz",
			new String[]{"Yasuo", "LB", "Fizz", "Talon", "Zed", "Katarina", "Ahri", "Akali", "Diana", "Syndra"},
			new String[]{"Amumu", "Leona", "Yasuo", "Jarvan", "Galio"},
			1, 9, 3, 4, 2,
			new String[]{});
	static Champion Vi = new Jungle("Vi",
			new String[]{"Jax", "Teemo", "Riven", "Darius", "Karma", "Leesin", "Pantheon", "Garen", "Renekton", "Irelia"},
			new String[]{"Caitlyn", "Yasuo", "Orianna", "Blitzcrank", "Heimerdinger"},
			5, 0, 5, 8, 6,
			new String[]{});
	static Champion Viktor = new Jungle("Viktor",
			new String[]{"LB", "Talon", "Syndra", "Fizz", "Lux", "Ahri", "Tristana", "Ziggs", "Gragas", "Zed"},
			new String[]{"Jarvan", "Amumu", "Sona", "Aatrox", "Chogath"},
			1, 8, 2, 6, 2,
			new String[]{});
	static Champion Vladimir = new Jungle("Vladimir",
			new String[]{"Swain", "Riven", "Fiddlesticks", "Malzahar", "Irelia", "Xinzhao", "Jarvan", "Ryze", "Mordekaiser", "Yorick"},
			new String[]{"Kennen", "Jarvan", "Amumu", "Brand", "Karthus"},
			1, 7, 5, 3, 3,
			new String[]{});
	static Champion Volibear = new Jungle("Volibear",
			new String[]{"Teemo", "Jayce", "Kayle", "Kennen", "Renekton", "Elise", "Vayne", "Darius", "Garen", "Yorick"},
			new String[]{"Teemo", "Singed", "Ashe", "Vayne", "Caitlyn"},
			3, 2, 7, 4, 7,
			new String[]{});
	static Champion Warwick = new Jungle("Warwick",
			new String[]{"Yorick", "Kayle", "Olaf", "Udyr", "Rengar", "Jax", "Leesin", "Teemo", "Renekton", "Nasus"},
			new String[]{"Malzahar", "Leesin", "Veigar", "Katarina", "Lux"},
			5, 4, 5, 4, 4,
			new String[]{"Top"});
	static Champion Wukong = new Jungle("Wukong",
			new String[]{"Leesin", "Darius", "Garen", "Olaf", "Renekton", "Pantheon", "Riven", "Fiora", "Nasus", "Singed"},
			new String[]{"Yasuo", "Orianna", "Katarina", "Jarvan", "Amumu"},
			6, 0, 4, 7, 6,
			new String[]{"Top"});
	static Champion Xerath = new Mid("Xerath",
			new String[]{"Ahri", "Fizz", "LB", "Kassadin", "Syndra", "Gragas", "Zed", "Yasuo", "Diana", "Malzahar"},
			new String[]{"Jarvan", "Amumu", "Varus", "Leona", "Aatrox"},
			1, 7, 3, 5, 2,
			new String[]{});
	static Champion XinZhao = new Jungle("XinZhao",
			new String[]{"Jax", "Malphite", "Volibear", "Pantheon", "Teemo", "Renekton", "Fiora", "Garen", "Trundle"},
			new String[]{"Jarvan", "Pantheon", "Yasuo", "Khazix", "Blitzcrank"},
			3, 3, 7, 7, 5,
			new String[]{"Top"});
	static Champion Yasuo = new Mid("Yasuo",
			new String[]{"Jax", "Riven", "Fiora", "Soraka", "Akali", "Kayle", "Darius", "Renekton", "Pantheon", "Tryndamere"},
			new String[]{"Malphite", "Wukong", "Janna", "Vi", "Alistar"},
			6, 0, 5, 5, 8,
			new String[]{"Top"});
	static Champion Yorick = new Top("Yorick",
			new String[]{"Chogath", "Trundle", "Nunu", "Xinzhao", "Renekton", "Riven", "Rengar", "Nasus", "Aatrox"},
			new String[]{"Mordekaiser", "Vayne", "Cassiopeia", "Karthus", "Zilean"},
			3, 4, 7, 4, 4,
			new String[]{});
	static Champion Zac = new Jungle("Zac",
			new String[]{"Vi", "Zilean", "Renekton", "Vladimir", "Fizz", "Riven", "Jayce", "Yorick", "Chogath", "Vayne"},
			new String[]{"Orianna", "Yasuo", "Lulu", "Syndra", "Aatrox"},
			1, 4, 7, 7, 6,
			new String[]{"Top"});
	static Champion Zed = new Mid("Zed",
			new String[]{"Kayle", "Wukong", "Singed", "Irelia", "Jax", "Lissandra", "Aatrox", "Diana", "LB"},
			new String[]{"Talon", "Shen", "Nasus", "Kayle", "Aatrox"},
			9, 0, 2, 2, 8,
			new String[]{"Jungle", "Top"});
	static Champion Ziggs = new Mid("Ziggs",
			new String[]{"LB", "Yasuo", "Talon", "Fizz", "Akali", "Kassadin", "Gragas", "Zed", "Diana", "Ahri"},
			new String[]{"Amumu", "Jarvan", "Aatrox", "Malphite", "Sejuani"},
			3, 8, 2, 5, 4,
			new String[]{});
	static Champion Zilean = new Support("Zilean",
			new String[]{"Morgana", "Karma", "Soraka", "Pantheon", "Janna", "Blitzcrank", "Kassadin", "Sivir", "Kayle"},
			new String[]{"Aatrox", "Syndra", "Tryndamere", "Jax", "Yorick"},
			1, 4, 6, 3, 6,
			new String[]{"Mid"});
	static Champion Zyra = new Support("Zyra",
			new String[]{"Fizz", "Katarina", "Akali", "Diana", "LB", "Talon", "Kassadin", "Lux", "Ahri"},
			new String[]{"Ashe", "Amumu", "Ezreal", "Yasuo", "MF"},
			1, 6, 3, 7, 2,
			new String[]{"Mid"});

	public static Champion[] pool = new Champion[]{Aatrox, Ahri, Akali, Alistar, Amumu, Anivia, Annie, Ashe, Blitzcrank, Brand, Caitlyn, Cassiopeia, ChoGath, Corki, Darius, Diana, Mundo, Draven, Elise, Evelynn, Ezreal, Fiddlesticks, Fiora, Fizz, Galio, Gangplank, Garen, Gragas, Graves, Hecarim, Heimerdinger, Irelia, Janna, Jarvan, Jax, Jayce, Jinx, Karma, Karthus, Kassadin, Katarina, Kayle, Kennen, KhaZix, KogMaw, LB, LeeSin, Leona, Lissandra, Lucian, Lulu, Lux, Malphite, Malzahar, Maokai, Yi, MF, Mordekaiser, Morgana, Nami, Nasus, Nautilus, Nidalee, Nocturne, Nunu, Olaf, Orianna, Pantheon, Poppy, Quinn, Rammus, Renekton, Rengar, Riven, Rumble, Ryze, Sejuani, Shaco, Shen, Shyvana, Singed, Sion, Sivir, Skarner, Sona, Soraka, Swain, Syndra, Talon, Taric, Teemo, Thresh, Tristana, Trundle, Tryndamere, TF, Twitch, Udyr, Urgot, Varus, Vayne, Veigar, VelKoz, Vi, Viktor, Vladimir, Volibear, Warwick, Wukong, Xerath, XinZhao, Yasuo, Yorick, Zac, Zed, Ziggs, Zilean, Zyra};	


	public static void main(String[] args) throws IOException
	{
		//Input in = new Input();
		//Meta m = Input.getMeta();
		Draft d = new Draft();
		d.draft();
	}
	public static Champion[] getPool()
	{
		return pool;
	}
}
