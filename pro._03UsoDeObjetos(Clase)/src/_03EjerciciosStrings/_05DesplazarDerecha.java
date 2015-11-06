package _03EjerciciosStrings;

import java.util.Scanner;

public class _05DesplazarDerecha 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce una palabra: ");
		String palabra = tec.next();
		System.out.println("Texto rotado: " + desplazar(palabra));
	}
	
	public static String desplazar(String texto)
	{
		String desplazado = texto.charAt(texto.length() - 1) + texto.substring(0, texto.length() - 1);
		return desplazado;
	}

}
