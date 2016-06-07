package _Java8StreamsTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _03StreamBuildersByList 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++)
		{
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

}
