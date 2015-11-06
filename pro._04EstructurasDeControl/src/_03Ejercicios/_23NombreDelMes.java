package _03Ejercicios;

import java.util.Scanner;

public class _23NombreDelMes 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte mes;
		System.out.print("Introduce numero del mes (1-12): ");
		mes = tec.nextByte();
		
		switch(mes)
		{
			case 1:
				System.out.println("El nombre del mes " + mes + " es Enero");
				break;
			case 2:
				System.out.println("El nombre del mes " + mes + " es Febrero");
				break;
			case 3:
				System.out.println("El nombre del mes " + mes + " es Marzo");
				break;
			case 4:
				System.out.println("El nombre del mes " + mes + " es Abril");
				break;
			case 5:
				System.out.println("El nombre del mes " + mes + " es Mayo");
				break;
			case 6:
				System.out.println("El nombre del mes " + mes + " es Junio");
				break;
			case 7:
				System.out.println("El nombre del mes " + mes + " es Julio");
				break;
			case 8:
				System.out.println("El nombre del mes " + mes + " es Agosto");
				break;
			case 9:
				System.out.println("El nombre del mes " + mes + " es Septiembre");
				break;
			case 10:
				System.out.println("El nombre del mes " + mes + " es Octubre");
				break;
			case 11:
				System.out.println("El nombre del mes " + mes + " es Noviembre");
				break;
			case 12:
				System.out.println("El nombre del mes " + mes + " es Diciembre");
		}
	}

}
