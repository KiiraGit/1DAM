package _03EjerciciosStrings;

import java.util.Scanner;

public class _07LongitudEntero {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce un entero largo: ");
		long num = tec.nextLong();
		String numLong = String.valueOf(num);
		System.out.println("Longitud: " + numLong.length());
	}

}
