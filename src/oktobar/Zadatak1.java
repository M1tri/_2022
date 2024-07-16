package oktobar;

public class Zadatak1 
{
	public static Inter[] NapraviNiz(int dim)
	{
		Inter[] niz = new Inter[dim];
		
		for (int i = 0; i < dim; i++)
		{
			if (i % 2 == 0)
				niz[i] = new Prva();
			else
				niz[i] = new Druga();
		}
		
		return niz;
	}
}
