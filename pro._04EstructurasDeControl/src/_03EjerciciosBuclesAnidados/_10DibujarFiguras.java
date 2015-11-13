package _03EjerciciosBuclesAnidados;

public class _10DibujarFiguras 
{
	public static void main(String[] args) 
	{
		dibRecAsteriscos(7, 3);
		System.out.println();
		dibRecNumeros(7, 3);
		System.out.println();
		dibRecNumeros2(7, 3);
		System.out.println();
		dibRecNumeros3(7, 3);
		System.out.println();
		dibDiagonal(7, 3);
		System.out.println();
		dibRecLetras(7, 3);
		System.out.println();
		dibRecLetras2(7, 3);
		System.out.println();
		dibRecLetras3(7, 3);
		System.out.println();
	}
	
	public static void dibRecAsteriscos(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = 0; columna < ancho; columna++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void dibRecNumeros(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = 1; columna <= ancho; columna++)
			{
				System.out.print(columna + " ");
			}
			System.out.println();
		}
	}
	
	public static void dibRecNumeros2(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = ancho; columna > 0; columna--)
			{
				System.out.print(columna + " ");
			}
			System.out.println();
		}
	}
	
	public static void dibRecNumeros3(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = 1; columna <= ancho; columna++)
			{
				System.out.print(String.format("%02d", columna + (fila * ancho)) + " ");
			}
			System.out.println();
		}
	}
	
	public static void dibDiagonal(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = 0; columna < ancho; columna++)
			{
				if (fila == columna)
				{
					System.out.print("1 ");
				}
				else System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	public static void dibRecLetras(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = 0; columna < ancho; columna++)
			{
				System.out.print((char)('a' + fila) + " ");
			}
			System.out.println();
		}
	}
	
	public static void dibRecLetras2(int ancho, int alto)
	{
		for (int fila = alto - 1; fila >= 0; fila--)
		{
			for (int columna = 0; columna < ancho; columna++)
			{
				System.out.print((char)('a' + fila) + " ");
			}
			System.out.println();
		}
	}
	
	public static void dibRecLetras3(int ancho, int alto)
	{
		for (int fila = 0; fila < alto; fila++)
		{
			for (int columna = 0; columna < ancho; columna++)
			{
				System.out.print((char)('a' + columna + (fila * ancho)) + " ");
			}
			System.out.println();
		}
	}

}
