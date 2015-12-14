package _03EjerciciosBucles;

import java.util.Scanner;

public class _09CifrasNumero 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int num, cifras = 1;
		
		System.out.print("Introduce un numero: ");
		num = tec.nextInt();
		
		while (num > 9 || num < -9)
		{
			num /= 10;
			cifras++;
		}
		
		System.out.println("El numero introducido tiene " + cifras + " cifras");
	}

}
