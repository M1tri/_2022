package jun;

// Zadatak 3

public class Buffer 
{
	private int[] data;
	private int curr;
	private final Object lock_obj = new Object();
	
	
	public Buffer(int size)
	{
		data = new int[size];
		curr = 0;
	}
	
	
	public void Add(int value) throws Exception
	{
		synchronized(lock_obj)
		{
			if (curr >= data.length)
				throw new Exception("Nema mesta!");
		
			data[curr++] = value;
		}
	}
	
	public int Remove(int index) throws Exception
	{
		synchronized(lock_obj)
		{
			if (index >= curr)
				throw new Exception("Los pristup!");
			
			int ret = data[index];
			
			for (int i = index; i < curr - 1; i++)
			{
				data[i] = data[i+1];
			}
			curr--;
			
			return ret;
		}
	}
}
