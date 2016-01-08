package _03Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02LeerDosEnteros {

	public static void main(String[] args) 
	{

		Scanner tec = new Scanner(System.in);
		boolean acierto = false;

		do
		{
			try
			{
				System.out.println("Introduce un entero 1: ");
				int num1 = tec.nextInt();
				acierto = true;
			}catch (InputMismatchException e)
			{
				tec.nextLine();	//Vacio buffer de teclado
				System.out.println("Por favor, introduce un entero. Error: " + e.getMessage());
			}
		}while(!acierto);
		
		acierto = false;
		do
		{
			try
			{
				System.out.println("Introduce un entero 2: ");
				int num2 = tec.nextInt();
				acierto = true;
			}catch (InputMismatchException e)
			{
				tec.nextLine();	//Vacio buffer de teclado
				System.out.println("Por favor, introduce un entero. Error: " + e.getMessage());
			}
		}while(!acierto);
	}

}
