package _03Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _23Concatenar1 {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		System.out.print("Fichero 1: ");
		String f1 = tec.nextLine();
		File file1 = new File(f1);
		System.out.print("Fichero 2: ");
		String f2 = tec.nextLine();
		File file2 = new File(f2);

		System.out.print("Fichero 3: ");
		String f3 = tec.nextLine();
		File file3 = new File(f3);
		if (!file3.exists())
		{
			try {
				file3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
				BufferedReader br2 = new BufferedReader(new FileReader(file2));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file3));)
		{
			while (br1.ready())
			{
				bw.write(br1.readLine());
				bw.newLine();
			}
			while (br2.ready())
			{
				bw.write(br2.readLine());
				bw.newLine();
			}
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		} finally {
			
		}
	}

}
