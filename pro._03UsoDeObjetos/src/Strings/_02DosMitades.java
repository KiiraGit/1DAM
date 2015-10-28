package Strings;

import java.util.Scanner;

public class _02DosMitades 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto = tec.nextLine();
		System.out.println("Primera mitad: " + texto.substring(0, texto.length()/2));
		System.out.println("Segunda mitad: " + texto.substring(texto.length()/2));
	}
}
