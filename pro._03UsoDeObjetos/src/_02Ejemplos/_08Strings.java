package _02Ejemplos;

import java.util.Scanner;

public class _08Strings 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		//Inicial del nombre
		char inicial = nombre.charAt(0);
		System.out.println("Inicial: " + inicial);
		
		for (int i = 0; i < nombre.length(); i++)
		{
			System.out.println("Letra ["+i+"]: " + nombre.charAt(i));
		}
		
		int posA = nombre.indexOf('a');
		System.out.println(posA);
		
		String texto = "   Hola que tal   ";
		System.out.println(texto.trim());
		System.out.println(texto.substring(0, 4));
		System.out.println(texto.substring(8));
		System.out.println(texto.length());
	}
}
