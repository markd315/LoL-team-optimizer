public class Tester
{
	public static void main(String[] args)
	{
		//ad ap cc tank mob
		Champion Aatrox = new Top("Aatrox",
		{"Jax", "Riven", "Teemo", "Fiora", "Renekton", "Tryndamere", "Pantheon", "Nasus", "Lee Sin", "Ahri"},
		{"Yasuo", "Zilean", "Tryndamere", "Lee Sin", "Ahri"},
		7, 2, 6, 5, 4,
		{"Jungle"});
		
		Champion Ahri = new Mid("Ahri",
		{"LB", "Annie", "Talon", "Kassadin", "Swain", "Akali", "Diana", "Fizz", "Ryze", "Malzahar"},
		{"Jax", "Irelia", "Ezreal", "Shen", "Aatrox"},
		2, 7, 3, 4, 7,
		{});
		
		Champion Akali = new Mid("Akali",
		{},
		{},
		7, 2, 6, 5, 7,
		{});
		
		Champion Alistar = new Support("Alistar",
		{},
		{},
		2, 3, 8, 8, 3,
		{"Jungle", "Top"});
		
		Champion Amumu = new Top("Amumu",
		{},
		{},
		1, 4, 6, 8, 4,
		{"Jungle"});
		
		Champion Anivia = new Mid("Anivia",
		{},
		{},
		1, 9, 2, 4, 2,
		{"Support"});
		
		Champion Annie = new Support("Annie",
		{},
		{},
		3, 7, 3, 5, 2,
		{"Mid"});
		
		Champion Ashe = new ADC("Ashe",
		{},
		{},
		8, 2, 2, 6, 1,
		{});
		
		Champion Blitzcrank = new Support("Blitzcrank",
		{},
		{},
		2, 4, 6, 7, 5,
		{});
		
		Champion Brand = new Mid("Brand",
		{},
		{},
		2, 8, 3, 4, 2,
		{});
		
		Champion Caitlyn = new ADC("Caitlyn",
		{},
		{},
		8, 1, 2, 3, 5,
		{});
		
		Champion Cassiopeia = new Mid("Cassiopeia",
		{},
		{},
		1, 8, 2, 5, 4,
		{});
		
		Champion Aatrox = new Top("Aatrox",
		{},
		{},
		7, 2, 6, 5, 4,
		{"Jungle"});
		
		
		Champion Orianna = new Mid("Orianna", 
		{"LB", "Syndra", "Diana", "Ahri", "Gragas", "Zed", "Ziggs", "Akali", "Lux", "Talon", ""},
		{"Malphite", "Jarvan", "Wukong", "Zac", "Amumu"},
		3, 8, 7, 3,
		{"Support"});
		
	}

}
