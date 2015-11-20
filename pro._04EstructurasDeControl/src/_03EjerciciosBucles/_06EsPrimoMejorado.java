package _03EjerciciosBucles;

import java.util.Scanner;

public class _06EsPrimoMejorado 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int num, counter = 2;
		boolean esPrimo = true;
		
		System.out.print("Introduce un numero entero: ");
		num = tec.nextInt();
		
		while (esPrimo && counter < num / 2)
		{
			if (num % counter == 0) esPrimo = false;
			counter++;
		}
		
		if (esPrimo) System.out.println("El numero introducido es primo");
		else System.out.println("El numero introducido no es primo");
	}

}
