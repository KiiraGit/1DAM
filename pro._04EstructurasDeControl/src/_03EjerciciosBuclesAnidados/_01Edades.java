package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _01Edades 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int sumaEdades;
		do
		{
			System.out.println("Introduce 5 edades: ");
			sumaEdades = 0;
			for (int i = 0; i < 5; i++)
			{
				sumaEdades += tec.nextInt();
			}
		}
		while (sumaEdades < 200);
	}

}
