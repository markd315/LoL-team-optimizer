public class Tester
{
	public static void main(String[] args)
	{
		//ad ap cc tank mob
		Champion Aatrox = new Top("Aatrox",
				new Champion[] {Jax, Riven, Teemo, Fiora, Renekton, Tryndamere, Pantheon, Nasus, LeeSin, Ahri},
				new Champion[]{Yasuo, Zilean, Tryndamere, LeeSin, Ahri},
				7, 2, 6, 5, 4,
				new String[] {"Jungle"});

		Champion Ahri = new Mid("Ahri",
				new Champion[]{LB, Annie, Talon, Kassadin, Swain, Akali, Diana, Fizz, Ryze, Malzahar},
				new Champion[]{Jax, Irelia, Ezreal, Shen, Aatrox},
				2, 7, 3, 4, 7,
				new String[]{});

		Champion Akali = new Mid("Akali",
				new Champion[]{},
				new Champion[]{},
				7, 2, 6, 5, 7,
				new String[]{});

		Champion Alistar = new Support("Alistar",
				new Champion[]{},
				new Champion[]{},
				2, 3, 8, 8, 3,
				new String[]{"Jungle", "Top"});

		Champion Amumu = new Top("Amumu",
				new Champion[]{},
				new Champion[]{},
				1, 4, 6, 8, 4,
				new String[]{"Jungle"});

		Champion Anivia = new Mid("Anivia",
				new Champion[]{},
				new Champion[]{},
				1, 9, 2, 4, 2,
				new String[]{"Support"});

		Champion Annie = new Support("Annie",
				new Champion[]{},
				new Champion[]{},
				3, 7, 3, 5, 2,
				new String[]{"Mid"});

		Champion Ashe = new ADC("Ashe",
				new Champion[]{},
				new Champion[]{},
				8, 2, 2, 6, 1,
				new String[]{});

		Champion Blitzcrank = new Support("Blitzcrank",
				new Champion[]{},
				new Champion[]{},
				2, 4, 6, 7, 5,
				new String[]{});

		Champion Brand = new Mid("Brand",
				new Champion[]{},
				new Champion[]{},
				2, 8, 3, 4, 2,
				new String[]{});

		Champion Caitlyn = new ADC("Caitlyn",
				new Champion[]{},
				new Champion[]{},
				8, 1, 2, 3, 5,
				new String[]{});

		Champion Cassiopeia = new Mid("Cassiopeia",
				new Champion[]{},
				new Champion[]{},
				1, 8, 2, 5, 4,
				new String[]{});

		Champion ChoGath = new Top("ChoGath",
				new Champion[]{},
				new Champion[]{},
				2, 4, 7, 5, 2,
				new String[]{"Jungle", "Mid"});

		Champion Corki = new ADC("Corki",
				new Champion[]{},
				new Champion[]{},
				7, 3, 2, 1, 5,
				new String[]{});

		Champion Darius = new Top("Darius",
				new Champion[]{},
				new Champion[]{},
				6, 1, 6, 4, 2,
				new String[]{"Jungle"});

		Champion Diana = new Mid("Diana",
				new Champion[]{},
				new Champion[]{},
				3, 6, 2, 5, 5,
				new String[]{"Jungle"});

		Champion Mundo = new Top("Dr Mundo",
				new Champion[]{},
				new Champion[]{},
				2, 3, 10, 2, 5,
				new String[]{"Jungle"});

		Champion Draven = new ADC("Draven",
				new Champion[]{},
				new Champion[]{},
				10, 0, 1, 2, 5,
				new String[]{});

		Champion Elise= new Mid("Elise",
				new Champion[]{},
				new Champion[]{},
				2, 6, 5, 4, 5,
				new String[]{"Jungle"});

		Champion Evelynn = new Jungle("Evelynn",
				new Champion[]{},
				new Champion[]{},
				5, 5, 3, 5, 5,
				new String[]{});

		Champion Ezreal = new ADC("Ezreal",
				new Champion[]{},
				new Champion[]{},
				8, 3, 2, 0, 6,
				new String[]{});

		Champion Fiddlesticks = new Jungle("Fiddlesticks",
				new Champion[]{},
				new Champion[]{},
				2, 7, 3, 6, 3,
				new String[]{"Mid"});

		Champion Fiora = new Top("Fiora",
				new Champion[]{},
				new Champion[]{},
				7, 0, 2, 0, 6,
				new String[]{});

		Champion Fizz = new Mid("Fizz",
				new Champion[]{},
				new Champion[]{},
				3, 8, 1, 2, 7,
				new String[]{"Jungle"});

		Champion Galio = new Mid("Galio",
				new Champion[]{},
				new Champion[]{},
				1, 6, 6, 7, 2,
				new String[]{"Support"});

		Champion Gangplank = new Top("Gangplank",
				new Champion[]{},
				new Champion[]{},
				5, 2, 5, 4, 5,
				new String[]{"Jungle"});

		Champion Garen = new Top("Garen",
				new Champion[]{},
				new Champion[]{},
				2, 2, 10, 4, 5,
				new String[]{});

		Champion Gragas = new Mid("Gragas",
				new Champion[]{},
				new Champion[]{},
				2, 7, 6, 5, 4,
				new String[]{});

		Champion Graves = new ADC("Graves",
				new Champion[]{},
				new Champion[]{},
				8, 1, 4, 2, 5,
				new String[]{});

		Champion Hecarim = new Jungle("Hecarim",
				new Champion[]{},
				new Champion[]{},
				6, 2, 7, 6, 7,
				new String[]{});

		Champion Heimerdinger = new Mid("Heimerdinger",
				new Champion[]{},
				new Champion[]{},
				1, 7, 4, 5, 5,
				new String[]{});

		Champion Irelia = new Top("Irelia",
				new Champion[]{},
				new Champion[]{},
				6, 2, 7, 4, 5,
				new String[]{});

		Champion Janna = new Support("Janna",
				new Champion[]{},
				new Champion[]{},
				3, 5, 4, 8, 4,
				new String[]{"Mid"});

		Champion Jarvan = new Jungle("Jarvan",
				new Champion[]{},
				new Champion[]{},
				5, 2, 5, 7, 7,
				new String[]{"Top"});

		Champion Jax = new Top("Jax",
				new Champion[]{},
				new Champion[]{},
				7, 5, 6, 4, 6,
				new String[]{"Jungle"});

		Champion Jayce = new Top("Jayce",
				new Champion[]{},
				new Champion[]{},
				7, 0, 6, 4, 5,
				new String[]{"Mid"});

		Champion Jinx = new ADC("Jinx",
				new Champion[]{},
				new Champion[]{},
				9, 0, 2, 5, 2,
				new String[]{});

		Champion Karma = new Support("Karma",
				new Champion[]{},
				new Champion[]{},
				2, 6, 2, 5, 6,
				new String[]{"Mid"});

		Champion Karthus = new Mid("Karthus",
				new Champion[]{},
				new Champion[]{},
				1, 8, 6, 3, 2,
				new String[]{});

		Champion Kassadin = new Mid("Kassadin",
				new Champion[]{},
				new Champion[]{},
				2, 7, 3, 4, 6,
				new String[]{});

		Champion Katarina = new Mid("Katarina",
				new Champion[]{},
				new Champion[]{},
				2, 10, 3, 0, 7,
				new String[]{});

		Champion Kayle = new Mid("Kayle",
				new Champion[]{},
				new Champion[]{},
				4, 7, 4, 4, 6,
				new String[]{"Top", "ADC", "Support", "Jungle"});

		Champion Kennen = new Mid("Kennen",
				new Champion[]{},
				new Champion[]{},
				3, 7, 3, 5, 6,
				new String[]{"Mid"});

		Champion KhaZix = new Jungle("KhaZix",
				new Champion[]{},
				new Champion[]{},
				8, 0, 2, 2, 6,
				new String[]{"Mid"});

		Champion KogMaw = new ADC("KogMaw",
				new Champion[]{},
				new Champion[]{},
				4, 5, 1, 4, 3,
				new String[]{"Mid"});

		Champion LB = new Mid("LeBlanc",
				new Champion[]{},
				new Champion[]{},
				0, 10, 2, 5, 7,
				new String[]{"Mid"});

		Champion LeeSin = new Jungle("lee Sin",
				new Champion[]{},
				new Champion[]{},
				6, 1, 4, 4, 8,
				new String[]{"Mid", "Top"});

		Champion Leona = new Support("Leona",
				new Champion[]{},
				new Champion[]{},
				1, 3, 6, 10, 3,
				new String[]{});

		Champion Lissandra = new Mid("Lissandra",
				new Champion[]{},
				new Champion[]{},
				1, 7, 4, 7, 6,
				new String[]{"Support"});

		Champion Lucian = new ADC("Lucian",
				new Champion[]{},
				new Champion[]{},
				8, 1, 2, 0, 6,
				new String[]{});

		Champion Lulu = new Support("Lulu",
				new Champion[]{},
				new Champion[]{},
				2, 4, 3, 5, 5,
				new String[]{"Mid"});

		Champion Lux = new Mid("Lux",
				new Champion[]{},
				new Champion[]{},
				2, 8, 2, 5, 2,
				new String[]{"Support"});

		Champion Malphite = new Top("Malphite",
				new Champion[]{},
				new Champion[]{},
				1, 5, 8, 7, 6,
				new String[]{"Jungle"});

		Champion Malzahar = new Mid("Malzahar",
				new Champion[]{},
				new Champion[]{},
				2, 8, 3, 6, 3,
				new String[]{});

		Champion Maokai = new Jungle("Maokai",
				new Champion[]{},
				new Champion[]{},
				2, 5, 7, 6, 5,
				new String[]{});

		Champion Yi = new Jungle("Master Yi",
				new Champion[]{},
				new Champion[]{},
				8, 0, 2, 0, 8,
				new String[]{"Top"});

		Champion MF = new ADC("Miss Fortune",
				new Champion[]{},
				new Champion[]{},
				7, 3, 2, 3, 5,
				new String[]{});

		Champion Mordekaiser = new Mid("Mordekaiser",
				new Champion[]{},
				new Champion[]{},
				2, 7, 8, 0, 4,
				new String[]{"Top"});

		Champion Morgana = new Support("Morgana",
				new Champion[]{},
				new Champion[]{},
				1, 6, 3, 6, 3,
				new String[]{"Mid"});

		Champion Nami = new Support("Nami",
				new Champion[]{},
				new Champion[]{},
				3, 5, 2, 7, 5,
				new String[]{});

		Champion Nasus = new Top("Nasus",
				new Champion[]{},
				new Champion[]{},
				4, 4, 7, 4, 2,
				new String[]{"Jungle"});

		Champion Nautilus = new Jungle("Nautilus",
				new Champion[]{},
				new Champion[]{},
				1, 3, 8, 10, 5,
				new String[]{"Support"});

		Champion Nidalee = new Mid("Nidalee",
				new Champion[]{},
				new Champion[]{},
				2, 6, 4, 0, 6,
				new String[]{"Support"});

		Champion Nocturne = new Jungle("Nocturne",
				new Champion[]{},
				new Champion[]{},
				6, 1, 6, 6, 5,
				new String[]{});

		Champion Nunu = new Jungle("Nunu",
				new Champion[]{},
				new Champion[]{},
				2, 5, 6, 5, 5,
				new String[]{"Support"});

		Champion Olaf = new Top("Olaf",
				new Champion[]{},
				new Champion[]{},
				6, 0, 6, 4, 3,
				new String[]{"Jungle"});

		Champion Orianna = new Mid("Orianna", 
				new Champion[]{LB, Syndra, Diana, Ahri, Gragas, Zed, Ziggs, Akali, Lux, Talon},
				new Champion[]{Malphite, Jarvan, Wukong, Zac, Amumu},
				3, 8, 7, 3, 6,
				new String[]{"Support"});

		Champion Pantheon = new Jungle("Pantheon",
				new Champion[]{},
				new Champion[]{},
				6, 3, 5, 4, 5,
				new String[]{"Top"});

		Champion Poppy = new Top("Poppy",
				new Champion[]{},
				new Champion[]{},
				6, 0, 9, 4, 5,
				new String[]{});

		Champion Quinn = new ADC("Quinn",
				new Champion[]{},
				new Champion[]{},
				8, 0, 2, 4, 7,
				{"Top"});

		Champion Rammus = new Jungle("Rammus",
				new Champion[]{},
				new Champion[]{},
				2, 3, 6, 5, 7,
				new String[]{});

		Champion Renekton = new Top("Renekton",
				new Champion[]{},
				new Champion[]{},
				6, 0, 7, 4, 6,
				new String[]{});

		Champion Rengar = new Jungle("Rengar",
				new Champion[]{},
				new Champion[]{},
				7, 0, 4, 5, 6,
				new String[]{"Top"});

		Champion Riven = new Top("Riven",
				new Champion[]{},
				new Champion[]{},
				9, 0, 4, 5, 9,
				new String[]{});

		Champion Rumble = new Top("Rumble",
				new Champion[]{},
				new Champion[]{},
				2, 5, 6, 5, 5,
				new String[]{});

		Champion Ryze = new Top("Ryze",
				new Champion[]{},
				new Champion[]{},
				2, 8, 6, 3, 4,
				new String[]{"Mid"});

		Champion Sejuani = new Jungle("Sejuani",
				new Champion[]{},
				new Champion[]{},
				2, 6, 6, 6, 4,
				new String[]{});
	}
}
