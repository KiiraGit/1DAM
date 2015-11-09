package _03EjerciciosBucles;

import java.util.Scanner;

public class _01SencillosWhile 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero entero: ");
		n = tec.nextInt();
		
		//imparesHastaN(N);
		//nImpares(N);
		//cuentaAtras(N);
		//sumaNPrimeros(N);
		//mostrarDivisoresN(N);
		sumaDivisoresN(n);
	}
	
	public static void imparesHastaN(int n)
	{
		int i = 1;
		while (i <= n)
		{
			System.out.println(i);
			i += 2;
		}
	}
	
	public static void nImpares(int n)
	{
		int i = 1;
		while (n > 0)
		{
			System.out.println(i);
			i += 2;
			n--;
		}
	}
	
	public static void cuentaAtras(int n)
	{
		while (n >= 0)
		{
			System.out.println(n--);
		}
	}
	
	public static void sumaNPrimeros(int n)
	{
		int i = 1;
		int suma = 0;
		while (i <= n)
		{
			suma += i++;
		}
		System.out.println(suma);
	}
	
	public static void mostrarDivisoresN(int n)
	{
		int i = 1;
		while (i <= n)
		{
			if (n % i == 0) System.out.println(i);
			i++;
		}
	}
	
	public static void sumaDivisoresN(int n)
	{
		int i = 1;
		int suma = 0;
		while (i < n)
		{
			if (n % i == 0) suma += i;
			i++;
		}
		System.out.println(suma);
	}

}
