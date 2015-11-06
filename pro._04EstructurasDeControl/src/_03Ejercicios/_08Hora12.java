package _03Ejercicios;

import java.util.Scanner;

public class _08Hora12 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte hora, minutos;
		String horaConvertida;
		
		System.out.print("Introduce una hora: ");
		hora = tec.nextByte();
		System.out.print("Introduce los minutos: ");
		minutos = tec.nextByte();
		
		if (hora > 11)
		{
			if (hora != 12)
			{
				hora -= 12;
			}
			horaConvertida = "PM";
		}
		else
		{
			if (hora == 0) hora = 12;
			horaConvertida = "AM";
		}
		horaConvertida = String.format("%02d", hora) + ":" + String.format("%02d", minutos) + horaConvertida;
		System.out.println(horaConvertida);
	}

}
