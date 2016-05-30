package Practica3;

public class Util 
{
	public static byte[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
	public static boolean esBisiesto(int anyo) 
	{
		return (anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0));
	}
	
	public static int calcularBisiestos(int anyo1, int anyo2)
	{
		int cantidad = 0;
		for(; anyo1 < anyo2; anyo1++)
		{
			if (esBisiesto(anyo1))
			{
				cantidad++;
			}
		}
		return cantidad;
	}
}
