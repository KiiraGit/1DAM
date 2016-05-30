package _03Ejercicios._08RepeticionPalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;

public class RepeticionPalabras 
{

	public static void main(String[] args) 
	{
		File fichero = new File("src/_03Ejercicios/_08RepeticionPalabras/palabras.txt");
		Map<String, Integer> map = new HashMap<>();
		Scanner file = null;
		try {
			file = new Scanner(fichero);

			while (file.hasNext())
			{
				String word = file.next();
				if (map.containsKey(word)) map.put(word, map.get(word)+1);
				else map.put(word, 1);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} finally {
			file.close();
		}
		
		for (String entry : map.keySet())
		{
			System.out.println(entry + ": " + map.get(entry));
		}
		
	}

}
