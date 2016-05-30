package _02Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class _05JuegoMap 
{

	public static void main(String[] args) 
	{
		//	Juego: el usuario tiene que introducir una frase sin repetir cualquier palabra mas de dos veces
		Scanner tec = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		boolean norep = true;
		String repWord = "";
		
		System.out.println("Introduce un texto: ");
		String phrase = tec.nextLine();
		StringTokenizer token = new StringTokenizer(phrase, " ");
		while (token.hasMoreElements() && norep)
		{
			String word = token.nextToken();
			if (map.containsKey(word))
			{
				if (map.get(word) == 2)
				{
					norep = false;
					repWord = word;
				}
				else map.put(word, map.get(word)+1);
			}
			else map.put(word, 1);
		}
		
		if (norep) System.out.println("HAS GANADO!");
		else System.out.println("A TU CASA!");
		
		for (String entry : map.keySet())
		{
			System.out.println("La palabra " + entry + " se ha repetido " + map.get(entry) + " veces");
		}
	}

}
