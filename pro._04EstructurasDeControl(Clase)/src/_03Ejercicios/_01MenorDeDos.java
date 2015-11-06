package _03Ejercicios;

import java.util.Scanner;

public class _01MenorDeDos 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		
		if (n1 < n2) System.out.println(n1);
		else System.out.println(n2);
	}

}
