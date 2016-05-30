package _03Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class _12ContenidoAFichero 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		TreeSet<String> contenidoOrdenado = new TreeSet<>();
		
		System.out.print("Carpeta: ");
		String nomCarpeta = tec.nextLine();
		File file = new File(nomCarpeta);
		if (file.exists() && file.isDirectory())
		{
			File txtFile = new File(file.getName()+".txt");
			File[] contenido = file.listFiles();
			for (int i = 0; i < contenido.length; i++)
			{
				if (contenido[i].isFile())
				{
					contenidoOrdenado.add(contenido[i].getName().toLowerCase());
				}
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(txtFile)))
			{
				for (String nombre : contenidoOrdenado)
				{
					bw.write(nombre);
					bw.newLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error al escribir o cerrar");
			}
		} else System.out.println("No existe o no es una carpeta");
	}

}
