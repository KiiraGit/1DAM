package _02Ejemplos;

import java.util.Scanner;

public class _06DosMetodosCapturarUnaYLanzarOtra 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("DIVIDENDO: ");
		int dividendo = tec.nextInt();
		System.out.println("DIVISOR: ");
		int divisor = tec.nextInt();
		try{

		int cociente = dividir(dividendo, divisor);

		System.out.println("Cociente: " + cociente);
		}catch (IllegalArgumentException ex){
			System.out.println("No se puede dividir");
		}

	}

	public static int dividir(int a, int b)throws IllegalArgumentException 
	{
		int c = 0;
		
		try
		{
			c = a / b;
		} catch (ArithmeticException ex)
		{
			System.out.println("Division por cero en el metodo dividir");
			throw new IllegalArgumentException();
		}
		return c;
	}	

}
