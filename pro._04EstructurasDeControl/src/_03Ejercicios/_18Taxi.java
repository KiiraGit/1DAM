package _03Ejercicios;

import java.util.Scanner;

public class _18Taxi 
{
	final static double diurno = 0.73;
	final static double minDia = 2.95;
	final static double nocturno = 0.84;
	final static double minNoche = 4.0;
	final static double festivo = 0.93;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte hora, minutos, dia;
		int km;
		double coste;
		
		System.out.println("Hora del trayecto:");
		System.out.print("Hora: ");
		hora = tec.nextByte();
		System.out.print("Minutos: ");
		minutos = tec.nextByte();
		
		System.out.print("Dia de la semana (1-7): ");
		dia = tec.nextByte();
		System.out.println("Introduce los kilometros del trayecto: ");
		km = tec.nextInt();
		
		if (dia < 6)
		{
			coste = km * festivo;
		}
		else if (hora > 5 && hora < 23)
		{
			coste = km * diurno;
			if (coste < minDia)
			{
				coste = minDia;
			}
		}
		else 
		{
			coste = km * nocturno;
			if (coste < minNoche)
			{
				coste = minNoche;
			}
		}
		System.out.println("El coste del trayecto es " + coste);
	}

}
