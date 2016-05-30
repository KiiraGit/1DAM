package _02SegundaEvaluacionPractico;

public class Ejercicio1 {

	public static void main(String[] args) 
	{

	}
	
	public static boolean soloHayUnPar(int[] v)
	{
		byte pares = 0;
		for (int i = 0; i < v.length && pares < 2; i++)
		{
			if (v[i] % 2 == 0) pares++;
		}
		
		return pares == 1;
	}
}
