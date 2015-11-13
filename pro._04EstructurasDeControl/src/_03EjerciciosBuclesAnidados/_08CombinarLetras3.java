package _03EjerciciosBuclesAnidados;

public class _08CombinarLetras3 
{
	public static void main(String[] args) 
	{
		char[] letras = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < letras.length; i++)
		{
			for (int j = 0; j < letras.length; j++)
			{
				for (int k = 0; k < letras.length; k++)
				{
					System.out.println(letras[i] + "" + letras[j] + "" + letras[k]);
				}
			}
		}
	}

}
