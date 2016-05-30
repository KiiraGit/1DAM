package _02Ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _04LeerTexto 
{

	public static void main(String[] args) 
	{
		FileReader fr = null;
		
		try 
		{
			fr = new FileReader("minombre.txt");
			
			while (fr.ready())
			{
				System.out.print((char)fr.read());
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
