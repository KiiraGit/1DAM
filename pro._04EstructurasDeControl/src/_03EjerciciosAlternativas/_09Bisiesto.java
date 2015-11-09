package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _09Bisiesto 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce un a�o: ");
		short ano = tec.nextShort();

		if (esBisiesto(ano)) System.out.println("El a�o introducido es bisiesto");
		else System.out.println("El a�o introducido no es bisiesto");
	}

	private static boolean esBisiesto(int ano) 
	{
		if (ano % 4 == 0)
		{
			if (ano % 100 == 0 && ano % 400 == 0)
			{
				return true;
			}
			else if (ano % 100 == 0)
			{
				return false;
			}
			else return true;
		}
		else return false;
	}

}
