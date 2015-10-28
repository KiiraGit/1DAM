package Strings;

import java.util.Locale;
import java.util.Scanner;

public class _01Nombres 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Introduza nombre completo: ");
		String fullName = tec.nextLine();

		System.out.println(inicial(fullName));
		System.out.println(ultima(fullName));
		System.out.println(primeraPalabra(fullName));
		System.out.println(segundaPalabra(fullName));
		System.out.println(terceraPalabra(fullName));
	}

	public static char inicial(String texto)
	{
		return texto.charAt(0);
	}
	
	public static char ultima(String texto)
	{
		return texto.charAt(texto.length() - 1);
	}
	
	public static String primeraPalabra(String texto)
	{
		return texto.substring(0, texto.indexOf(' '));
	}
	
	public static String segundaPalabra(String texto)
	{
		return texto.substring(texto.indexOf(' ') + 1, texto.indexOf(' ', texto.indexOf(' ') + 1));
	}
	
	public static String terceraPalabra(String texto)
	{
		return texto.substring(texto.lastIndexOf(' ') + 1);
	}
}