package _03Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _07Raiz 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		float num;
		System.out.print("Introduce un número real: ");
		num = tec.nextFloat();
		System.out.println("La raíz cuadrada de " + Math.abs(num) + " es " + Math.sqrt(Math.abs(num)));
	}

}
