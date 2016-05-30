package Practica3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03SumarDias 
{
	public static void sumarDias(Scanner tec)
	{
		String fecha1 = _02CalcularDiferencia.pedirFecha(tec, "Introduce una fecha : ");
		
		int dias = 0;
		boolean correct = false;
		do
		{
			System.out.print("Introduce el numero de dias a sumar: ");
			try
			{
				dias = tec.nextInt();
				if (dias < 0) throw new Exception("Negativo");
				correct = true;
			} catch (InputMismatchException ex)
			{
				System.out.println("Error. Introduce un numero de dias a sumar");
				tec.nextLine();
			} catch (Exception ex) 
			{
				tec.nextLine();
				if (ex.getMessage().equalsIgnoreCase("Negativo"))
				{
					System.out.println("El numero debe ser positivo");
					correct = false;
				}
			}
		} while (!correct);
		tec.nextLine();

		String[] dma = fecha1.split("/");
		
		int anyo = Integer.parseInt(dma[2]);
		byte mes = Byte.parseByte(dma[1]);
		long dia = Byte.parseByte(dma[0]);
		
		dia += dias;
		
//		while ((dia >= 365 && !Util.esBisiesto(anyo)) || (dia >= 366 && Util.esBisiesto(anyo)))
//		while (Util.esBisiesto(anyo)?dia >= 365 : dia >= 366)
		while (mes != 2?dia > Util.diasMeses[mes - 1]:Util.esBisiesto(anyo)?dia > 29: dia > 28)
		{
			if (mes == 2 && Util.esBisiesto(anyo))
			{
				dia--;
			}
			dia -= Util.diasMeses[mes - 1];
			if (mes != 12)
			{
				mes++;
			}
			else
			{
				mes = 1;
				anyo++;
			}
		}
		System.out.println(dia + ", " + mes + ", " + anyo);
	}
}
