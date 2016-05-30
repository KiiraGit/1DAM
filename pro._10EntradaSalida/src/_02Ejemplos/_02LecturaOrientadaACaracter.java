package _02Ejemplos;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _02LecturaOrientadaACaracter 
{
	//	Realiza una operacion de lectura usando un Stream orientado a byte,
	//	Se lee directamente de System.in, sin utilizar Scanner
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Escribe: \n");
		
		InputStreamReader datos = new InputStreamReader(System.in);
		boolean stream = true;
		int cont = 0;
		while (stream)
		{
			int next = datos.read();
			System.out.println("Numero: " + next);
			System.out.println("Caracter: " + (char)next);
		}
	}

}
