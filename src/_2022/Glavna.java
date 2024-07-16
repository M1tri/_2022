package _2022;

import jun.*;
import oktobar.*;


public class Glavna 
{
	public static void main(String[] args)
	{
		// Jun
		
		int[][] mat = jun.Zadatak1.NapraviMatricu(4);
		
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] niz = {1, 2, 3, 4, 5};
		int[] out = new int[3];
		IntWrapper i1 = new IntWrapper();
		IntWrapper i2 = new IntWrapper();
		IntWrapper i3 = new IntWrapper();
		
		jun.Zadatak2.PrvoResenje(niz, i1, i2, i3);
		jun.Zadatak2.DrugoResenje(niz, out);
		
		System.out.println("Resenje 1: " + i1.GetValue() + " " + i2.GetValue() + " " + i3.GetValue());
		System.out.println("Resenje 2: " + out[0] + " " + out[1] + " " + out[2]);
		
		// Jun
		
		
		
		// Oktobar
		
		Inter[] arr = oktobar.Zadatak1.NapraviNiz(5);
		for (int i = 0; i < arr.length; i++)
			arr[i].Stampaj();
		
		
			// Ovo pitanje davao vise puta pa cu ga samo ovde pastujem
			// uvek imas dva warninga, vezano za raw type (sirov tip, linija 44, 47)
			// i unchecked conversion (linija 45)
			// to objasnjava pred kraj od poslednji klip pred onaj de radi kolokvijum tkd to prodji samo
		
		Klasa k1= new Klasa();
		Klasa <Float> k2 = k1;
		Klasa <Double> k3= new Klasa<>(1.1); 
		Klasa k4 = k3;
		System.out.println(k4.getArg());
				
		// Oktobar
		
		
		
		
		// Jun2
		
		jun2.Zadatak2.Rekurzivna(123);
		System.out.println();
		jun2.Zadatak2.NeRekurzivna(123);
		
		jun2.FizickeVelicine f1 = jun2.FizickeVelicine.Energija;
		jun2.FizickeVelicine f2 = jun2.FizickeVelicine.Snaga;
		
		System.out.println(f1.jedinicaMere() + "  " + f2.jedinicaMere());
		
		// Jun2
		
		
	}
}
