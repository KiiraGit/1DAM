package _03Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class _24Concatenar2 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		System.out.print("Fichero 1: ");
		String f1 = tec.nextLine();
		File file1 = new File(f1);
		System.out.print("Fichero 2: ");
		String f2 = tec.nextLine();
		File file2 = new File(f2);
		
		try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));)
		{
			while(br2.ready())
			{
				bw.write(br2.readLine());
			}
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		} finally {
			
		}
	}

}
