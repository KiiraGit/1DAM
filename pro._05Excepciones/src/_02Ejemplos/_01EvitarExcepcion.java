package _02Ejemplos;

import java.util.Scanner;

public class _01EvitarExcepcion {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.println("RAIZ CUADRADA");
		System.out.println("Introduce numero: ");
		
		int num = tec.nextInt();
		
		//	Evitando la excepcion
		if (num >= 0)
		{
			System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
		}
		else
		{
			System.out.println("No se puede calcular la raiz cuadrada de un numero negativo");
		}
		
		
		//	Sin evitar la excepcion --> Terminacion abrupta
		System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
	}

}
