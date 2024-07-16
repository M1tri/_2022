package oktobar;

public class MojaKlasa
{
	public final void MojaMetoda()
	{
		System.out.println("Ne moze me predefinises jer pise final u mojoj deklaraciji");
	}
	
	// a) Da cela klasa ne moze da se nasledi moralo u njenoj deklaraciji da pise final tjst
	// public final class MojaKlasa { ... }
	
	// b) String je jedan primer final klase iz Javine standarne biblioteke
}