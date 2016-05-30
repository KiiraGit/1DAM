package _01Pruebas;

import java.util.HashMap;
import java.util.Map;

public class _01PruebaHash 
{

	public static void main(String[] args) 
	{
		Map<String, String> map = new HashMap<>();
		map.put("1", "Hola");
		map.put("2", "H");
		map.put("3", "o");
		map.put(String.valueOf(map.hashCode()), "l");
		System.out.println(map.get(String.valueOf(map.hashCode())));
		System.out.println(map.get("2").hashCode());
		System.out.println(map.get("3").hashCode());
	}

}
