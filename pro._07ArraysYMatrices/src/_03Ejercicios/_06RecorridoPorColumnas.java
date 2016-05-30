package _03Ejercicios;

public class _06RecorridoPorColumnas 
{

	public static void main(String[] args) 
	{
		int[][] m = {{1, 2, 3, 4, 5}
					,{2, 4, 6, 8, 10}
					,{4, 3, 2, 1, 9}
		};
		recoAsc(m);
		recoDesc(m);
		suma(m);
		media(m);
	}

	//Recorrido ascendente
	public static void recoAsc(int[][] m)
	{
		System.out.println("Recorrido ascendente");
		for (int j = 0; j < m[0].length; j++)
		{
			for (int i = 0; i < m.length; i++)
			{
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//Recorrido descendente
	public static void recoDesc(int[][] m)
	{
		System.out.println("Recorrido descendente");
		for (int j = m[0].length - 1; j >= 0; j--)
		{
			for (int i = m.length - 1; i >= 0; i--)
			{
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//Suma
	public static void suma(int[][] m)
	{
		System.out.println("Suma");
		for (int j = 0; j < m[0].length; j++)
		{
			int suma = 0;
			for (int i = 0; i < m.length; i++)
			{
				suma += m[i][j];
			}
			System.out.println(suma);
		}
	}
	
	
	//Media
	public static void media(int[][] m)
	{
		System.out.println("Media");
		for (int j = 0; j < m[0].length; j++)
		{
			int suma = 0;
			for (int i = 0; i < m.length; i++)
			{
				suma += m[i][j];
			}
			System.out.println(suma / m[0].length);
		}
	}
	
}
