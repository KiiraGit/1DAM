package _02SegundaEvaluacionPractico;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		int[] v = {10, 20, 25, 28, 10, 5, 5, -1, 1};
		System.out.println(contarElementos(v));
	}

	public static int contarElementos(int[] v)
	{
		int suma = 0;
		int cont = 0;
		for (int i = v.length - 1; i >= 0; i--)
		{
			if (v[i] == suma) cont++;
			suma += v[i];
		}
		return cont;
	}
}
