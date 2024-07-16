package jun2;

public enum FizickeVelicine 
{
	Snaga
	{
		public String jedinicaMere()
		{
			return "W (vat)";
		}
	},
	
	Energija
	{
		public String jedinicaMere()
		{
			return "J (dzul)";
		}
		
	};
	
	public abstract String jedinicaMere();
}
