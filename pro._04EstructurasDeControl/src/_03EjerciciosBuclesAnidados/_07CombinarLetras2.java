package _03EjerciciosBuclesAnidados;

public class _07CombinarLetras2 
{
	public static void main(String[] args) 
	{
		char[] letras = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < letras.length; i++)
		{
			for (int j = 0; j < letras.length; j++)
			{
				System.out.println(letras[i] + "" + letras[j]);
			}
		}
	}

}
