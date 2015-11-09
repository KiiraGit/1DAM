package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _11DiasDelMes 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte mes;
		System.out.print("Introduce un mes (1-12): ");
		mes = tec.nextByte();
		System.out.println(diasDelMes(mes));
	}

	private static byte diasDelMes(byte mes) 
	{
		switch (mes)
		{
			case 1:	case 3:	case 5:	case 7:	case 8: case 10: case 12:
				mes = 31;
				break;
			case 4:	case 6: case 9:	case 11:
				mes =  30;
				break;
			case 2:
				mes =  28;
		}
		return mes;
	}

}
