package jun2;

public class Zadatak2 
{
	public static void Rekurzivna(int broj)
	{
		System.out.println(broj % 10);
		
		if (broj / 10 != 0)
			Rekurzivna(broj / 10);
	}
	
	public static void NeRekurzivna(int broj)
	{
		while (broj != 0)
		{
			System.out.println(broj % 10);
			broj = broj / 10;
		}
	}
}
