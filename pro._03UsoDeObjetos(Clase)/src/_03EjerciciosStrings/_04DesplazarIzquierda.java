package _03EjerciciosStrings;

import java.util.Scanner;

public class _04DesplazarIzquierda 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce una palabra: ");
		String palabra = tec.next();
		System.out.println("Texto desplazado: " + desplazar(palabra));
	}
	
	public static String desplazar(String texto)
	{
		return texto.substring(1) + texto.charAt(0);
	}

}
