package _02Ejemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _01ImplementacionesDeSet 
{

	public static void main(String[] args) 
	{
		Set<Integer> ts = new TreeSet<>();
		Set<Integer> hs = new HashSet<>();
		Set<Integer> lhs = new LinkedHashSet<>();
		
		for (int i = 10; i > 0; i--)
		{
			ts.add(new Integer(i));
			hs.add(i);
			lhs.add(i);
		}
		
		System.out.println("TreeSet: \n" + ts);
		System.out.println("HashSet: \n" + hs);
		System.out.println("LinkedHashSet: \n" + lhs);
	}

}
