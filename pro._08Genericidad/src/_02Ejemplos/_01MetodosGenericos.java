package _02Ejemplos;

import java.util.Arrays;

import _03Ejercicios._01GestionEmpleados.Empleado;

public class _01MetodosGenericos 
{
	public static void main(String[] args) 
	{
		String nombres[] = {"ana", "miguel", "ana", "isabel", "gema"};
		Empleado empleados[] = {
				new Empleado("Rosa", "1", 2000, 2000), 
				new Empleado("Pedro", "2", 2000, 2000)
		};
		
		Integer[] ints = {2, 3, 4, 5, 6, 2, 3, 2, 2, 1, 1, 2, 3};

		System.out.println("\n ---->  CONTAR  <----");
		System.out.println(_01MetodosGenericos.<String>contar(nombres, "ana"));
		System.out.println(_01MetodosGenericos.<Empleado>contar(empleados, new Empleado("Rosa", "1", 2000, 2000)));
		System.out.println(_01MetodosGenericos.<Integer>contar(ints, 2));
		
		//	Llamadas al metodo generico maximo
		System.out.println("\n ---->  MAXIMOS  <----");
		System.out.println("\n" + maximo("angel", "aurora"));
		System.out.println("\n" + maximo(empleados[0], empleados[1]));
		
		//	Llamamos al metodo generico Arrays.sort
		Arrays.sort(nombres);
		Arrays.sort(empleados);
		Arrays.sort(ints);
		
	}
	
	//	Metodo generico que cuenta las veces que aparece un elemento en un array
	public static <T> int contar(T[] v, T x)
	{
		int cont = 0;
		
		for (int i = 0; i < v.length; i++)
		{
			if(v[i].equals(x)) cont++;
		}
		
		return cont;
	}
	
	//	Metodo generico que nos devuelve el mas grande de dos objetos cualesquiera
//	public static Object maximo(Object o1, Object o2)
//	{
//		if (((Comparable)o1).compareTo(o2) > 0) return o1;
//		else return o2;
//	}
	public static <T extends Comparable> T maximo(T o1, T o2)
	{
		if (o1.compareTo(o2) > 0) return o1;
		else return o2;
	}
}
