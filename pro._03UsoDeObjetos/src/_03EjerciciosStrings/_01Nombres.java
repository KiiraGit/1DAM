package _03EjerciciosStrings;

import java.util.Scanner;

public class _01Nombres 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce tu nombre completo: ");
		String nomCompleto = tec.nextLine();
		System.out.println("Primera letra: " + inicial(nomCompleto));
		System.out.println("Última letra: " + ultima(nomCompleto));
		System.out.println("Nombre: " + primeraPalabra(nomCompleto));
		System.out.println("Primer apellido: " + segundaPalabra(nomCompleto));
		System.out.println("Segundo apellido: " + terceraPalabra(nomCompleto));
	}

	public static char inicial(String texto)
	{
		texto = texto.toUpperCase();
		return texto.charAt(0);
	}
	
	public static char ultima(String texto)
	{
		texto = texto.toUpperCase();
		return texto.charAt(texto.length() - 1);
	}
	
	public static String primeraPalabra(String texto)
	{
		return texto.substring(0, texto.indexOf(' '));
	}
	
	public static String segundaPalabra(String texto)
	{
		return texto.substring(texto.indexOf(' ') + 1, texto.lastIndexOf(' '));
	}
	
	public static String terceraPalabra(String texto)
	{
		return texto.substring(texto.lastIndexOf(' ') + 1);
	}
}
