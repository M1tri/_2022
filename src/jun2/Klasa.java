package jun2;

public class Klasa implements Comparable<Klasa>
{
	private int broj;
	
	public Klasa(int broj)
	{
		this.broj = broj;
	}
	
	public int Kvadrat()
	{
		return broj * broj;
	}
	
	// Dopuna
	@Override
	public int compareTo(Klasa o)
	{
		if (o.broj < broj)
			return 1;
		else if (o.broj == broj)
			return 0;
		
		return -1;
	}
	// Dopuna
}
