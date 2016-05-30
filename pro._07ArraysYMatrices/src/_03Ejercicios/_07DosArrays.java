package _03Ejercicios;

import java.util.Arrays;

public class _07DosArrays 
{
	public static void main(String[] args) 
	{
		double[] a = new double[10];
		double[] b = new double[10];
		double[] c = new double[20];
		
		for (int i = 0; i < 10; i++)
		{
			a[i] = Math.random() * 20;
			b[i] = Math.random() * 20;
		}
		for (int i = 0; i < 20; i++)
		{
			c[i] = Math.random() * 20;
		}

		System.out.println("IGUALES");
		System.out.println(Arrays.toString(sumarArraysIguales(a, b)));
		System.out.println("\nDIFERENTES");
		System.out.println(Arrays.toString(sumarArrays(a, c)));
	}

	public static double[] sumarArraysIguales(double[] a, double[] b)
	{
		double[] c = new double[a.length];
		
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i] + b[i];
		}
		
		return c;
	}
	
	public static double[] sumarArrays(double[] a, double[] b)
	{
		double[] max = a.length >= b.length? a : b;
		double[] min = a.length >= b.length? b : a;
		
		double[] c = new double[max.length];
		
		c = Arrays.copyOfRange(max, 0, max.length);
		
		for (int i = 0; i < min.length; i++)
		{
			c[i] += min[i];
		}
		
		return c;
	}
}
