package _02Ejemplos;

import java.util.Scanner;

public class ControlTrayectos 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		Tiempo salida = new Tiempo("00:00:00");
		Tiempo llegada = new Tiempo("00:00:00");

		System.out.println("Salida:");
		System.out.println("Hora:");
		salida.setHora(tec.nextInt());
		System.out.println("Minutos:");
		salida.setMinutos(tec.nextInt());
		System.out.println("Segundos:");
		salida.setSegundos(tec.nextInt());
		
		System.out.println("Llegada:");
		System.out.println("Hora:");
		llegada.setHora(tec.nextInt());
		System.out.println("Minutos:");
		llegada.setMinutos(tec.nextInt());
		System.out.println("Segundos:");
		llegada.setSegundos(tec.nextInt());
		
		System.out.println("Hora de salida: " + salida);
		System.out.println("Hora de llegada: " + llegada);
	}

}
