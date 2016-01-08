package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02CapturarExcepcion 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner tec = new Scanner(System.in);
			System.out.println("DIVISION");
			
			System.out.print("Introduce dividendo: ");
			int a = tec.nextInt();
			
			System.out.print("Introduce divisor: ");
			int b = tec.nextInt();
			
			System.out.println("COCIENTE: " + (a/b));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Tienes que introducir valor enteros");
		}
		System.out.println("FIN DEL PROGRAMA");
	}

}
