package jun;

public class Zadatak2 
{
	// nmg smislim vise od ova 2 al dosta je i to
	
	public static void PrvoResenje(int[] niz, IntWrapper i1, IntWrapper i2,IntWrapper i3)
	{
		i1.SetValue(niz[0]);
		i2.SetValue(niz[niz.length/2]);
		i3.SetValue(niz[niz.length - 1]);
	}
	
	public static void DrugoResenje(int[] niz, int[] out)
	{
		out[0] = niz[0];
		out[1] = niz[niz.length / 2];
		out[2] = niz[niz.length - 1];
	}
}
