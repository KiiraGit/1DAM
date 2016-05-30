package _03Ejercicios;

import java.io.File;
import java.io.IOException;

public class _02Temporal {

	public static void main(String[] args) 
	{
		try {
			File file = File.createTempFile("TEMPORAL", "ARCHIVO");
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
