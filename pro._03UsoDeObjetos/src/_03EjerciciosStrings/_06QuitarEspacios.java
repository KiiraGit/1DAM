package _03EjerciciosStrings;

import java.util.Scanner;

public class _06QuitarEspacios 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce dos palabras separadas por varios espacios: ");
		String dosPalabras = tec.nextLine();
		dosPalabras = dosPalabras.trim();
		String palabra1 = dosPalabras.substring(0, dosPalabras.indexOf(' ') + 1);
		dosPalabras = dosPalabras.substring(dosPalabras.indexOf(' ') + 1).trim();
		dosPalabras = palabra1 + dosPalabras;
		System.out.println("Quitando espacios sobrantes: " + dosPalabras);
	}

}
