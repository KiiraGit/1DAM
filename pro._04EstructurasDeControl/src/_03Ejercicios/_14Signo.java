package _03Ejercicios;

import java.util.Scanner;

public class _14Signo 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Introduce dos numeros enteros:");
		num1 = tec.nextInt();
		num2 = tec.nextInt();
		if ((num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0))
		{
			System.out.println("El producto de los dos números es positivo o nulo");
		}
		else System.out.println("El producto de los dos números es negativo");
	}

}
