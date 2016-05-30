package _03Ejercicios._01Varios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Varios 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 3, 5, 2, 4, 6, 1, 2, 3, 4};
		int[] b = {7, 10, 10, 8, 7, 9, 9, 8, 7, 10};
		int[] c = {1, 5, 7, 8, 9, 4, 10};
		
		long t;
		
		t = System.currentTimeMillis();
		System.out.println("Normal:\n" + Arrays.toString(a));
		System.out.println("Tiempo: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		System.out.println("Quitar Dup:\n" + Arrays.toString(quitarDuplicados(a)));
		System.out.println("Tiempo: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		System.out.println("Union 1:\n" + Arrays.toString(union1(a, b)));
		System.out.println("Tiempo: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		System.out.println("Union 2:\n" + Arrays.toString(union2(a, b)));
		System.out.println("Tiempo: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		System.out.println("Interseccion:\n" + Arrays.toString(interseccion(a, c)));
		System.out.println("Tiempo: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		System.out.println("Diferencia 1:\n" + Arrays.toString(diferencia1(a, c)));
		System.out.println("Tiempo: " + (System.currentTimeMillis() - t));
	}
	
	public static int[] quitarDuplicados(int[] v)
	{
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < v.length; i++)
		{
			ts.add(v[i]);
		}
		int[] result = new int[ts.size()];
		int i = 0;
		for (Integer x : ts)
		{
			result[i] = x;
			i++;
		}
		return result;
	}
	
	public static <T> T[] quitarDuplicados2(T[] v)
	{
		TreeSet<T> ts = new TreeSet<>();
		for (int i = 0; i < v.length; i++)
		{
			ts.add(v[i]);
		}
		T[] result = ts.toArray(v);
		return result;
	}
	
	public static int[] union1(int[] v1, int[] v2)
	{
		TreeSet<Integer> ts = new TreeSet<>();
		if (v1.length == v2.length)
		{
			for (int i = 0; i < v1.length; i++)
			{
				ts.add(v1[i]);
				ts.add(v2[i]);
			}
		}
		else
		{
			for (int i = 0; i < v1.length; i++)
			{
				ts.add(v1[i]);
			}
			for (int i = 0; i < v2.length; i++)
			{
				ts.add(v2[i]);
			}
		}
		
		int[] result = new int[ts.size()];
		int i = 0;
		for (Integer x : ts)
		{
			result[i] = x;
			i++;
		}
		return result;
	}
	
	public static int[] union2(int[] v1, int[] v2)
	{
		List<Integer> al = new ArrayList<>();
		if (v1.length == v2.length)
		{
			for (int i = 0; i < v1.length; i++)
			{
				al.add(v1[i]);
				al.add(v2[i]);
			}
		}
		else
		{
			for (int i = 0; i < v1.length; i++)
			{
				al.add(v1[i]);
			}
			for (int i = 0; i < v2.length; i++)
			{
				al.add(v2[i]);
			}
		}
		
		int[] result = new int[al.size()];
		int i = 0;
		for (Integer x : al)
		{
			result[i] = x;
			i++;
		}
		return result;
	}
	
	public static int[] interseccion(int[] v1, int[] v2)
	{
		HashSet<Integer> hs = new HashSet<>();
		for (int x : v1)
		{
			int i = 0;
			for(; i < v2.length && x != v2[i]; i++)	{}
			if (i < v2.length) hs.add(x);
		}
		
		int[] result = new int[hs.size()];
		int i = 0;
		for (Integer x : hs)
		{
			result[i] = x;
			i++;
		}
		return result;
	}
	
	public static int[] diferencia1(int[] v1, int[] v2)
	{
		TreeSet<Integer> ts = new TreeSet<>();
		for (int x : v1)
		{
			int i = 0;
			for(; i < v2.length && x != v2[i]; i++)	{}
			if (i == v2.length) ts.add(x);
		}
		
		int[] result = new int[ts.size()];
		int i = 0;
		for (Integer x : ts)
		{
			result[i] = x;
			i++;
		}
		return result;
	}
}
