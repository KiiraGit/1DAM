package _03Ejercicios;

public class _10PrimerImpar {

	public static void main(String[] args) 
	{
		int[] array = {2, 6, 8, 3, 5, 4, 3, 2, 9, 10};
		
		System.out.println("La suma es: " + sumaPrimerImpar(array));
	}
	
	public static int sumaPrimerImpar(int[] v)
	{
		int suma = 0;
		
		int i = 0;
		while (v[i] % 2 == 0)
		{
			i++;
		}
		
		for (++i; i < v.length; i++)
		{
			suma += v[i];
		}
		
		return suma;
	}

}
