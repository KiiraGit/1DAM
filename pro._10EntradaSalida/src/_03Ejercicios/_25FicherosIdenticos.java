package _03Ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _25FicherosIdenticos 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce el nombre del fichero 1");
		String fic1 = tec.nextLine();
		System.out.println("Introduce el nombre del fichero 2");
		String fic2 = tec.nextLine();

		boolean equals = true;
		try(DataInputStream dis1 = new DataInputStream(new FileInputStream(fic1));
				DataInputStream dis2 = new DataInputStream(new FileInputStream(fic2)))
		{
			if (new File(fic1).length() != new File(fic2).length()) equals = false;
			while (equals)
			{
				byte byte1 = dis1.readByte();
				byte byte2 = dis2.readByte();
				equals = (byte1 == byte2);
			}
		} catch (EOFException ex){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("LOS FICHEROS " + (equals?"":"NO ") + "SON IGUALES" );
		}
	}

}
