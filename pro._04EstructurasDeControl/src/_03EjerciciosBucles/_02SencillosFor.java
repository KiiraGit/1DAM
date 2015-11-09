package _03EjerciciosBucles;

import java.util.Scanner;

public class _02SencillosFor 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero entero: ");
		n = tec.nextInt();
//		imparesHastaN(N);
//		nImpares(N);
//		cuentaAtras(N);
//		sumaNPrimeros(N);
//		mostrarDivisoresN(N);
		sumaDivisoresN(n);
	}

	public static void imparesHastaN(int n)
	{
		for (int i = 1; i <= n; i += 2)
		{
			System.out.println(i);
		}
	}
	
	public static void nImpares(int n)
	{
		for (int i = 1; i <= n*2; i += 2)
		{
			System.out.println(i);
		}
	}
	
	public static void cuentaAtras(int n)
	{
		for (int i = n; i >= 0; i--)
		{
			System.out.println(i);
		}
	}
	
	public static void sumaNPrimeros(int n)
	{
		int suma = 0;
		for (int i = 1; i <= n; i++)
		{
			suma += i;
		}
		System.out.println(suma);
	}
	
	public static void mostrarDivisoresN(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			if (n % i == 0) System.out.println(i);
		}
	}
	
	public static void sumaDivisoresN(int n)
	{
		int suma = 0;
		for (int i = 1; i < n; i++)
		{
			if (n % i == 0) suma += i;
		}
		System.out.println(suma);
	}

}
