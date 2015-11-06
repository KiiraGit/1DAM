package _02Ejemplos;

import java.util.Scanner;

public class _07BufferDeTeclado 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		tec.nextLine();
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		System.out.println("Estatura: ");
		double est = tec.nextDouble();
		
		System.out.println(nombre);
		System.out.println("Fin");
	}

}
