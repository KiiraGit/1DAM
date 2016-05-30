package _03Ejercicios;

public class _13Subsecuencia {

	public static void main(String[] args) 
	{
		int[] array = {-3, 2, -1, 3, 1, 5, 3};
		System.out.println(secuencia(array));
	}
	
	public static int secuencia (int[] v)
	{
		int i = 0;
		while (i < v.length - 2 && (v[i] != v[i + 1] - 1 || v[i] != v[i + 2] - 2))
		{
			i++;
		}
		if (i == v.length - 2) return -1;
		else return i;
	}

}
