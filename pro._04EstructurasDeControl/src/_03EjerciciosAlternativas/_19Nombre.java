package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _19Nombre {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		String nombre;
		System.out.print("Introduce tu nombre: ");
		nombre = tec.next();
		if (nombre.charAt(0) == nombre.charAt(nombre.length() - 1))
		{
			System.out.println("La primera letra y la ultima son iguales");
		}
		else System.out.println("La primera letra y la ultima son diferentes");
	}

}
