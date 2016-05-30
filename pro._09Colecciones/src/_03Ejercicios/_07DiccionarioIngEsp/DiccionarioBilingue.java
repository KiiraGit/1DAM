package _03Ejercicios._07DiccionarioIngEsp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DiccionarioBilingue 
{
	private Map<String, Set<String>> dictionary;
	
	public DiccionarioBilingue()
	{
		dictionary = new HashMap<>();
	}
	
	public void anyadirTraduccion(String cast, String ing)
	{
		if (dictionary.containsKey(cast))
		{
			Set<String> ingles = dictionary.get(cast);
			ingles.add(ing);
			dictionary.put(cast, ingles);
		}
		else
		{
			Set<String> ingles = new TreeSet<>();
			ingles.add(ing);
			dictionary.put(cast, ingles);
		}
	}
	
	public void quitarTraduccion(String cast, String ing)
	{
		Set<String> ingles = dictionary.get(cast);
		ingles.remove(ing);
		if (ingles.size() > 0)
		{
			dictionary.put(cast, ingles);
		} else
		{
			dictionary.remove(cast);
		}
	}
	
	public Set traduccionesDe(String cast)
	{
		if (dictionary.containsKey(cast))
		{
			return dictionary.get(cast);
		} else return null;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder("Diccionario Bilingüe\n");
		for (String entry : dictionary.keySet())
		{
			string.append(entry+":\n");
			for (String ingEntry : dictionary.get(entry))
			{
				string.append("\t" + ingEntry + "\n");
			}
		}
		return string.toString();
	}
}
