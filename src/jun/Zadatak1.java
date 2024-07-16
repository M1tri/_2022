package jun;

import java.util.Random;

public class Zadatak1 
{
	public static int[][] NapraviMatricu(int dim)
	{
		int[][] mat = new int[dim][];
		Random ran = new Random();
		
		for (int i = 0; i < dim; i++)
		{
			mat[i] = new int[dim];
			
			if (i % 2 == 0)
			{
				for (int j = 0; j < dim; j++)
				{
					mat[i][j] = ran.nextInt();
				}
			}
			else
			{
				for (int j = 0; j < dim / 2; j++)
				{
					mat[i][j] = ran.nextInt();
				}				
			}
		}
		
		return mat;
	}
	
}
