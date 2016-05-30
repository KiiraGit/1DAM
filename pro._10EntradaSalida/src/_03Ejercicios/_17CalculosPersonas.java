package _03Ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _17CalculosPersonas 
{

	public static void main(String[] args) 
	{
		int personas = 0;
		double estatura = 0;
		try(DataInputStream dis = new DataInputStream(new FileInputStream("personas.dat")))
		{
			while (true)
			{
				String nombre = dis.readUTF();
				int edad = dis.readInt();
				double peso = dis.readDouble();
				double est = dis.readDouble();
				if (edad > 19 && edad < 31)
				{
					personas++;
					estatura += est;
				}
			}
		} catch (EOFException ex)	{
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PERSONAS " + personas);
		System.out.println("LA ESTATURA MEDIA DE LAS PERSONAS DE ENTRE 20 Y 30 AÑOS ES: " + (estatura / personas));
	}

}
