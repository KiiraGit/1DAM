package Practica3;

import java.util.Scanner;

public class _00Menu 
{
	public static void menu(Scanner tec)
	{
		System.out.println("1 - Validar fecha.");
		System.out.println("2 - Calcular diferencia.");
		System.out.println("3 - Sumar dias");
		System.out.println("0 - Salir.");
		System.out.println("--------------");
		System.out.print("Indique la accion a realizar: ");
		
		String choice = tec.nextLine();
		
		checker(choice, tec);	//	Comprobador de eleccion
	}
	
	public static void checker(String choice, Scanner tec)
	{
		try
		{
			switch(Integer.parseInt(choice))
			{
				case 1:
					System.out.println("Validar");
					_01ValidarFecha.validarFecha(tec);
					break;
				case 2:
					System.out.println("Calcular");
					_02CalcularDiferencia.diferenciaFechas(tec);
					break;
				case 3:
					System.out.println("Sumar dias");
					_03SumarDias.sumarDias(tec);
					break;
				case 0:
					System.out.println("Salir");
					Fechas.exit = true;
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
		} catch (NumberFormatException ex)
		{
			System.out.println("Opcion incorrecta");
		}
	}
}
