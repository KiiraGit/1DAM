package Practica3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Fechas 
{
	static Scanner tec = new Scanner(System.in);
	static boolean exit = false;
	
	static byte[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) 
	{
		calcularBisiestos(1900, 2015);
		do
		{
			menu();
		} while (!exit);
	}
	
	public static void menu()
	{
		System.out.println("1 - Validar fecha.");
		System.out.println("2 - Calcular diferencia.");
		System.out.println("0 - Salir.");
		System.out.println("--------------");
		System.out.print("Indique la accion a realizar: ");
		
		String choice = tec.nextLine();
		
		checker(choice);
	}
	
	public static void checker(String choice)
	{
		try
		{
			switch(Integer.parseInt(choice))
			{
				case 1:
					System.out.println("Validar");
					validarFecha();
					break;
				case 2:
					System.out.println("Calcular");
					diferenciaFechas();
					break;
				case 0:
					System.out.println("Salir");
					exit = true;
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
		} catch (NumberFormatException ex)
		{
			System.out.println("Opcion incorrecta");
		}
	}
	
	public static void validarFecha()
	{
		System.out.print("Introduce una fecha (dd/mm/aaaa): ");
		String fecha = tec.nextLine();

		try
		{
			System.out.println(validacion(fecha)?"Fecha valida":"Fecha Invalida");
		} catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Formato incorrecto");
		}
	}
	
	public static void diferenciaFechas()
	{
		boolean f1 = false, f2 = false;
		String fecha1, fecha2;
		
		do
		{
			System.out.print("Introduce la primera fecha: ");
			fecha1 = tec.nextLine();
			try
			{
				f1 = validacion(fecha1);
				if (!f1)
				{
					System.out.println("Fecha invalida");
				}
			} catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Formato invalido");
			}
		} while (!f1);
		
		do
		{
			System.out.print("Introduce la segunda fecha: ");
			fecha2 = tec.nextLine();
			try
			{
				f2 = validacion(fecha2);
				if (!f2)
				{
					System.out.println("Fecha invalida");
				}
			} catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Formato invalido");
			}
		} while (!f2);
		
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
		
		int bisiestos = calcularBisiestos(Math.min(anyo1, anyo2), Math.max(anyo1, anyo2));
		//System.out.println("Hay " + bisiestos + " años bisiestos");
		
		int diasTotal = (anyo2 - anyo1) * 365 + bisiestos;

		for (int i = mes1; i > 0; i--)
		{
			if (i == mes1)
			{
				diasTotal -= dia1;
			}
			else
			{
				diasTotal -= diasMeses[i - 1];
			}
		}
		for (int i = 0; i < mes2; i++)
		{
			if (i == mes2 - 1)
			{
				diasTotal += dia2;
			}
			else
			{
				diasTotal += diasMeses[i];
			}
		}
		System.out.println(diasTotal);
	}
	
	public static boolean validacion(String fecha)
	{
			String[] dma = fecha.split("/");
			if (dma.length == 3)
			{
				int anyo = Integer.parseInt(dma[2]);
				byte mes = Byte.parseByte(dma[1]);
				byte dia = Byte.parseByte(dma[0]);

				if (anyo > 0 && mes >= 1 && mes <= 12 && (mes == 2 && esBisiesto(anyo) && dia > 0 && dia <= 29) || dia > 0 && dia <= diasMeses[mes - 1])
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
	
	public static boolean esBisiesto(int ano) 
	{
		return (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0));
	}
	
	public static int calcularBisiestos(int anyo1, int anyo2)
	{
		int cantidad = 0;
		for(anyo1 = anyo1; anyo1 <= anyo2; anyo1++)
		{
			if (esBisiesto(anyo1))
			{
				cantidad++;
			}
		}
		return cantidad;
	}

}
