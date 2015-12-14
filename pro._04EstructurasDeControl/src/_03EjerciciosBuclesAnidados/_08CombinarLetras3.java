package _03EjerciciosBuclesAnidados;

public class _08CombinarLetras3 
{
	public static void main(String[] args) 
	{
//		char[] letras = {'a', 'b', 'c', 'd'};
//		
//		for (int i = 0; i < letras.length; i++)
//		{
//			for (int j = 0; j < letras.length; j++)
//			{
//				for (int k = 0; k < letras.length; k++)
//				{
//					System.out.println(letras[i] + "" + letras[j] + "" + letras[k]);
//				}
//			}
//		}
		for (char i = 'a'; i <= 'd'; i++)
		{
			for (char j = 'a'; j <= 'd'; j++)
			{
				for (char k = 'a'; k <= 'd'; k++)
				{
					System.out.println((char)i + "" + (char)j + "" + (char)k);
				}
			}
		}
	}

}
