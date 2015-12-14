package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _05LetraNif 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce tu nif: ");
		String dni = tec.nextLine();
		int resto;
		char[] letra = new char[2];
		
		final String tablaNif = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		if (Character.isAlphabetic(dni.charAt(dni.length() - 1)))
		{
			letra[0] = dni.charAt(dni.length() - 1);
			dni = dni.substring(0, dni.length() - 1);
		}
		resto = Integer.valueOf(dni) % 23;
		
		letra[1] = tablaNif.charAt(resto);
		
		if (letra[0] == letra[1]) System.out.println("La letra es correcta.");
		else if (String.valueOf(letra[0]) != null) System.out.println("Tu letra es " + letra[1]);
	}

}