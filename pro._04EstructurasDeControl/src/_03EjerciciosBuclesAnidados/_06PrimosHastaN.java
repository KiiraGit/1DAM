package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _06PrimosHastaN 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero: ");
		n = tec.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			boolean esPrimo = true;
			int j = 1;
			while (esPrimo && j <= i/2)
			{
				if (i % j == 0 && j != 1)
				{
					esPrimo = false;
				}
				j++;
			}
			if (esPrimo)
			{
				System.out.println(i);
			}
		}
	}
}
