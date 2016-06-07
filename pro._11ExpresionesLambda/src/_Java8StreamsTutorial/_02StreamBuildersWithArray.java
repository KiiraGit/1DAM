package _Java8StreamsTutorial;

import java.util.stream.Stream;

public class _02StreamBuildersWithArray 
{

	public static void main(String[] args) 
	{
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Stream<Integer> stream = Stream.of(array);
		stream.forEach(p -> System.out.println(p));
	}

}
