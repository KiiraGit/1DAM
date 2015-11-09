package _03EjerciciosBucles;

import java.util.Scanner;

public class _08SumaSerie 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		double suma = 0.0;
		
		System.out.print("Introduce un numero entero: ");
		n = tec.nextInt();
		
		for (int i = 1; i < n; i++)
		{
			suma += 1.0/i;
		}
		System.out.println(suma);
	}

}
