package _03Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _28Notas 
{
	private static final int MAX_NOTAS = 20;
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		//	Averiguar cuantas notas tiene el fichero
		int contNotas = 0;
		try(DataInputStream dis = new DataInputStream(new FileInputStream("notas.dat")))
		{
			//	Bucle infinito para leer hasta excepcion
			while (true)
			{
				dis.readDouble();
				contNotas++;
			}
		} catch (EOFException ex){
			
		} catch (FileNotFoundException e){
			
		} catch (IOException ex){
			System.out.println("Problema al leer o cerrar el fichero.");
		}
		
		//	Otra forma de averiguar el nume ro de notas del fichero
		File file = new File("notas.dat");
		if (file.exists() && file.isFile())
		{
			contNotas = (int) (file.length() / Double.BYTES);
		}
		
		if (contNotas < MAX_NOTAS)
		{
			System.out.println("EL FICHERO YA CONTIENE " + contNotas + " NOTAS");
			grabarNotas(contNotas);
			
		} else if (contNotas == MAX_NOTAS)
		{
			System.out.println("EL FICHERO YA CONTIENE " + MAX_NOTAS + " NOTAS, DESEAS SOBREESCRIBIRLAS? (S/N)");
			String decision = tec.nextLine();
			if (decision.equals("S"))
			{
				grabarNotas(0);
			}
		}
	}
	
	public static void grabarNotas(int start)
	{
		Scanner tec = new Scanner(System.in);
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("notas.dat", start != 0)))
		{
			for (; start != MAX_NOTAS; start++)
			{
				System.out.println("Introduce la nota " + start);
				double next = tec.nextDouble();
				if (next >= 0 && next <= 10)
				{
					dos.writeDouble(next);
				} else 
				{
					System.out.println("Introduce una nota entre 0 y 10");
					start--;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
