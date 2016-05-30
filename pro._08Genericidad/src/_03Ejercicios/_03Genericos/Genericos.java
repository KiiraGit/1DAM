package _03Ejercicios._03Genericos;

public class Genericos 
{
	//	A
	public static Object minimo(Object o1, Object o2)
	{
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		if (c1.compareTo(c2) > 0) return c2;
		else return c1;
	}
	//	B
	public static Object maximo(Object o1, Object o2)
	{
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		if (c1.compareTo(c2) > 0) return c1;
		else return c2;
	}
	//	C
	public static Object minimo(Object v[])
	{
		Comparable min = (Comparable)v[0];
		for (int i = 1; i < v.length; i++)
		{
			Comparable actual = (Comparable)v[i];
			if (min.compareTo(actual) < 0) min = actual;
		}
		return min;
	}
	//	D
	public static Object maximo(Object v[])
	{
		Comparable max = (Comparable)v[0];
		for (int i = 1; i < v.length; i++)
		{
			Comparable actual = (Comparable)v[i];
			if (max.compareTo(actual) > 0) max = actual;
		}
		return max;
	}
	//	E
	public static int numVeces(Object v[], Object x)
	{
		int cont = 0;
		
		for (int i = 0; i < v.length; i++)
		{
			if (v[i].equals(x)) cont++;
		}
		
		return cont;
	}
	//	F
	public static int numVecesOrdenado(Object v[], Object x)
	{
		int startCont = 0;

		for (; !v[startCont].equals(x); startCont++)	{}
		
		int endCont = startCont;
		for (; v[endCont].equals(x); endCont++)	{}
		
		return endCont - startCont;
	}
	//	G
	public static <T extends Comparable<T>> int mayores(T[] v, T x)
	{
		int cont = 0;
		for (int i = 0; i < v.length; i++)
		{
			if (((Comparable)v[i]).compareTo(x)>0)
			{
				cont++;
			}
		}
		return cont;
	}
	//	K
	public static boolean estaEn(Object[] v, Object x)
	{
		System.out.println(v.getClass().getSimpleName());
		System.out.println(x.getClass().getSimpleName());
		if (v.getClass().getSimpleName().startsWith(x.getClass().getSimpleName()))
		{
			System.out.println("ENTRO");
			for (Object o : v)
			{
				if (o.equals(x)) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		String nombres[] = {"ana", "miguel", "ana", "isabel", "gema"};
		System.out.println(estaEn(nombres, "10"));
	}
}
