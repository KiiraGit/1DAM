package _02Ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _01CrearObjetos 
{
	public static void main(String[] args) 
	{
		Scanner tecPunto = new Scanner(System.in).useLocale(Locale.US);
		Scanner tecComa = new Scanner(System.in);
		
		System.out.println("Introduce tu estatura:");
		double estatura = tecComa.nextDouble();
		
		System.out.println("Introduce tu perímetro craneal");
		double perimetro = tecPunto.nextDouble();
	}

}
