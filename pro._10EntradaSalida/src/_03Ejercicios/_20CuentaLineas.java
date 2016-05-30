package _03Ejercicios;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _20CuentaLineas 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce el nombre del fichero: ");
		String fic = tec.nextLine();
		
		int cont = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fic))))
		{
			while (br.readLine() != null) cont++;
		} catch (EOFException ex){
		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("EL FICHERO TIENE " + cont + " LINEAS");
	}

}
