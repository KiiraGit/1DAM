package Practica3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _02CalcularDiferencia 
{
	public static void diferenciaFechas(Scanner tec)
	{
//		boolean f1 = false, f2 = false;
		String fecha1, fecha2;

		fecha1 = pedirFecha(tec, "Introduce la primera fecha: ");
		fecha2 = pedirFecha(tec, "Introduce la segunda fecha: ");
		
		//	Calculo de los dias
		byte dia1, dia2;
		byte mes1, mes2;
		int anyo1, anyo2;

		StringTokenizer stf1 = new StringTokenizer(fecha1, "/");
		dia1 = Byte.parseByte(stf1.nextToken());
		mes1 = Byte.parseByte(stf1.nextToken());
		anyo1 = Integer.parseInt(stf1.nextToken());
		
		StringTokenizer stf2 = new StringTokenizer(fecha2, "/");
		dia2 = Byte.parseByte(stf2.nextToken());
		mes2 = Byte.parseByte(stf2.nextToken());
		anyo2 = Integer.parseInt(stf2.nextToken());
		
		int diasTotal = (anyo2 - anyo1) * 365;

		if (diasTotal + (mes2 - mes1) > 0 || (diasTotal + (mes2 - mes1) == 0 && dia2 - dia1 > 0))
		{
			diasTotal += Util.calcularBisiestos(anyo1, anyo2);
			diasTotal -= descontar(dia1, mes1, anyo1);
			diasTotal += contar(dia2, mes2, anyo2) - 1;
		}
		else if (diasTotal + (mes2 - mes1) < 0 || (diasTotal + (mes2 - mes1) == 0 && dia2 - dia1 < 0))
		{
			diasTotal -= Util.calcularBisiestos(anyo2, anyo1);
			diasTotal += descontar(dia2, mes2, anyo2) - 1;
			diasTotal -= contar(dia1, mes1, anyo1);
		}
		else
		{
			diasTotal = 0;
		}
		
		System.out.println("La diferencia de fechas es de " + diasTotal + " dias\n");
	}
	
	public static String pedirFecha(Scanner tec, String text)
	{
		String temp;
		boolean valido = false;
		do
		{
			System.out.print(text);
			temp = tec.nextLine();
			try
			{
				valido = _01ValidarFecha.validacion(temp);
				if (!valido)
				{
					System.out.println("Fecha incorrecta");
				}
			} catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Formato incorrecto\n");
			}
		} while (!valido);
		
		return temp;
	}
	
	public static short descontar(byte dia, byte mes, int anyo)
	{
		short cuenta = 0;
		cuenta += dia - 1;
		mes--;
		for (int i = mes; i > 0; i--)
		{
			cuenta += Util.diasMeses[i - 1];
			if (i == 2 && Util.esBisiesto(anyo))
			{
				cuenta++;
			}
		}
		return cuenta;
	}
	
	public static short contar(byte dia, byte mes, int anyo)
	{
		short cuenta = 0;
		for (int i = 1; i < mes; i++)
		{
			if (i == 2 && Util.esBisiesto(anyo))
			{
				cuenta++;
			}
			cuenta += Util.diasMeses[i - 1];
		}
		cuenta += dia;
		return cuenta;
	}
}
