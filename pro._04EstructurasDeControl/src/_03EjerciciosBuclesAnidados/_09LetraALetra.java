package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _09LetraALetra 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		String word = "word";
		
		while (word.length() > 0)
		{
			System.out.print("Introduce una palabra: ");
			word = tec.nextLine();
			System.out.println(word.length() > 0);
			for (int i = 0; i < word.length(); i++)
			{
				System.out.println(word.charAt(i));
			}
		}
	}

}
