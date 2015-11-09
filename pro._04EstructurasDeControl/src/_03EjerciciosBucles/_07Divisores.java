package _03EjerciciosBucles;

import java.util.Scanner;

public class _07Divisores 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n, counter = 1, divs = 0;
		
		System.out.print("Introduce un numero entero: ");
		n = tec.nextInt();
		
		while (counter < n && divs < 3)
		{
			if (n % counter == 0) 
			{
				divs++;
				System.out.println(counter);
			}
			counter++;
		}
		if (divs < 3)
		{
			System.out.println("El numero introducido solo tiene " + divs + " divisor/es");
		}
	}

}
