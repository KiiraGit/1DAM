package _03EjerciciosBucles;

import java.util.Scanner;

public class _06EsPrimoMejorado 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int num, counter = 3;
		boolean esPrimo = true;
		
		System.out.print("Introduce un numero entero: ");
		num = tec.nextInt();
		
		if (num == 1 || num == 2) esPrimo = true;
		else if (num % 2 == 0) esPrimo = false;
		else
		{
			while (esPrimo && counter <= num / 2)
			{
				if (num % counter == 0) esPrimo = false;
				counter += 2;
			}
		}
		
		
		if (esPrimo) System.out.println("El numero introducido es primo");
		else System.out.println("El numero introducido no es primo");
	}

}
