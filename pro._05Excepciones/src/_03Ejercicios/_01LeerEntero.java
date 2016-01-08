package _03Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01LeerEntero 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		boolean acierto = false;
		do
		{
			try
			{
				System.out.println("Introduce un entero: ");
				int num = tec.nextInt();
				acierto = true;
			}catch (InputMismatchException e)
			{
				tec.nextLine();	//Vacio buffer de teclado
				System.out.println("Por favor, introduce un entero. Error: " + e.getMessage());
			}
		}while(!acierto);
	}

}
