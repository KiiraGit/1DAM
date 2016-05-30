package Practica3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _01ValidarFecha 
{
	
	public static void validarFecha(Scanner tec)
	{
		boolean correct = false;
		do
		{
			System.out.print("Introduce una fecha (dd/mm/aaaa): ");
			String fecha = tec.nextLine();
	
			try
			{
				StringTokenizer fechaTokens = new StringTokenizer(fecha, "/");
				System.out.println(validacion(fecha)?fechaCorrecta(fechaTokens):fechaIncorrecta(fechaTokens));
				correct = true;
			} catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Formato incorrecto");
			}
		} while(!correct);
	}
	
	public static boolean validacion(String fecha)
	{
			String[] dma = fecha.split("/");
			if (dma.length == 3)
			{
				int anyo = Integer.parseInt(dma[2]);
				byte mes = Byte.parseByte(dma[1]);
				byte dia = Byte.parseByte(dma[0]);

				if (anyo > 0 && mes > 0 && mes < 13 && (dia > 0 && dia <= Util.diasMeses[mes - 1] || mes == 2 && Util.esBisiesto(anyo) && dia > 0 && dia < 30))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else throw new ArrayIndexOutOfBoundsException();
	}
	
	public static String fechaCorrecta(StringTokenizer fecha)
	{
		String formato = String.format("%d de %s de %d: Fecha correcta\n",  Integer.valueOf(fecha.nextToken()), Util.nombresMeses[Integer.valueOf(fecha.nextToken()) - 1],  Integer.valueOf(fecha.nextToken()));
		return formato;
	}
	
	public static String fechaIncorrecta(StringTokenizer fecha)
	{
		String formato = String.format("D�a: %d, Mes: %d A�o: %d. Fecha incorrecta\n", Integer.valueOf(fecha.nextToken()),  Integer.valueOf(fecha.nextToken()),  Integer.valueOf(fecha.nextToken()));
		return formato;
	}
}
