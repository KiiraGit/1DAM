package _02Ejemplos;

import java.util.Scanner;

public class _02Edades 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.println("¿Cuantos alumnos han venido?");
		int numAlumnos = tec.nextInt();
		
		int[] edades = new int[numAlumnos];
		int suma = 0;
		
		for (int i = 0; i < edades.length; i++)
		{
			edades[i] = tec.nextInt();
			suma += edades[i];
		}
		double media = (double)suma / edades.length;
		System.out.println("La media es " + media);
		
		int count = 0;
		for (int i = 0; i < edades.length; i++)
		{
			if (edades[i] > media) count++;
		}
		System.out.println(count + " alumnos tienen mas edad que la media");
	}

}
