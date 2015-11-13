package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _05TablaMult 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero: ");
		n = tec.nextInt();
		for (int i = 1; i <= n; i++)
		{
			System.out.println("Tabla del " + i + ": ");
			for (int j = 0; j <= 10; j++)
			{
				System.out.println(i + " por " + j + ", " + (i * j));
			}
			System.out.println();
		}
	}

}
