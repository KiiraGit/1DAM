package _02Ejemplos;

import java.io.IOException;
import java.io.InputStream;

public class _01LecturaOrientadaAByte 
{
	//	Realiza una operacion de lectura usando un Stream orientado a byte,
	//	Se lee directamente de System.in, sin utilizar Scanner
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Escribe: \n");
		
		InputStream datos = System.in;
		boolean stream = true;
		while (stream)
		{
			int next = datos.read();
			System.out.println("Numero: " + next);
			System.out.println("Caracter: " + (char)next);
		}
	}

}
