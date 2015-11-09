package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _12NombreDelMes 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte mes;
		System.out.print("Introduce un mes (1 - 12): ");
		mes = tec.nextByte();
		System.out.println("El nombre del mes " + String.format("%02d", mes) + " es " + nombreMes(mes));
	}

	private static String nombreMes(byte mes) 
	{
		if (mes == 1) return "Enero";
		else if (mes == 2) return "Febrero";
		else if (mes == 3) return "Marzo";
		else if (mes == 4) return "Abril";
		else if (mes == 5) return "Mayo";
		else if (mes == 6) return "Junio";
		else if (mes == 7) return "Julio";
		else if (mes == 8) return "Agosto";
		else if (mes == 9) return "Septiembre";
		else if (mes == 10) return "Octubre";
		else if (mes == 11) return "Noviembre";
		else return "Diciembre";
	}

}
