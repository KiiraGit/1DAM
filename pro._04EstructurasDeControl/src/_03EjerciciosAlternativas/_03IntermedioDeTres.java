package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _03IntermedioDeTres 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		int n3 = tec.nextInt();

		if ((n1 < n2 && n1 > n3) || (n1 > n2 && n1 < n3)) System.out.println("El intermedio es " + n1);
		else if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)) System.out.println("El intermedio es " + n2);
		else if ((n3 < n1 && n3 > n2) || (n3 > n1 && n3 < n2)) System.out.println("El intermedio es " + n3);
		
		if (n1 > n2)
		{
			if (n1 < n3) System.out.println(n1);
			else if (n2 > n3) System.out.println(n2);
			else if (n2 < n3) System.out.println(n3);
		}
		else
		{
			if (n3 < n1) System.out.println(n1);
			else if (n3 > n2) System.out.println(n2);
			else if (n3 > n1) System.out.println(n3);
		}
	}
}
