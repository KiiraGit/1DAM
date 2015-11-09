package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _10Fechas {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte dia1, mes1;
		int ano1;
		byte dia2, mes2;
		int ano2;
		
		System.out.println("Introduce una fecha: ");
		System.out.print("\tDía: "); dia1 = tec.nextByte();
		System.out.print("\tMes: "); mes1 = tec.nextByte();
		System.out.print("\tAño: "); ano1 = tec.nextInt();
		System.out.println();
		
		System.out.println("Introduce otra fecha: ");
		System.out.print("\tDía: "); dia2 = tec.nextByte();
		System.out.print("\tMes: "); mes2 = tec.nextByte();
		System.out.print("\tAño: "); ano2 = tec.nextInt();
		System.out.println();
		
		if (ano1 < ano2) mostrarFecha(dia1, mes1, ano1);
		else if (ano2 < ano1) mostrarFecha(dia2, mes2, ano2);
		else
		{
			if (mes1 < mes2) mostrarFecha(dia1, mes1, ano1);
			else if (mes2 < mes1) mostrarFecha(dia2, mes2, ano2);
			else
			{
				if (dia1 < dia2) mostrarFecha(dia1, mes1, ano1);
				else if (dia2 < dia1) mostrarFecha(dia2, mes2, ano2);
				else System.out.println("Las dos fechas son iguales");
			}
		}
		
	}
	
	public static void mostrarFecha(byte dia, byte mes, int ano)
	{
		System.out.println(String.format("%02d", dia) + "/" + String.format("%02d", mes) + "/" + String.format("%04d", ano));
	}

}
