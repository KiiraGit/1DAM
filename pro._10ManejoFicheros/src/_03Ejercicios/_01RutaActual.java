package _03Ejercicios;

import java.io.File;

public class _01RutaActual {

	public static void main(String[] args) 
	{
		File actual = new File(".");
		System.out.println(actual.getAbsolutePath());
	}

}
