package _02Ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _05LeerLineasTexto 
{

	public static void main(String[] args) 
	{
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("minombre.txt"));
			
			while (br.ready())
			{
				System.out.println(br.readLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			
		}
	}

}
