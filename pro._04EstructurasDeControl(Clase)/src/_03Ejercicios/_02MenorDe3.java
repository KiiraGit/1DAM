package _03Ejercicios;

import java.util.Scanner;

public class _02MenorDe3 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce 3 números: ");
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		int n3 = tec.nextInt();

		if (n1 < n2 && n1 < n3) System.out.println(n1);
		else if (n2 < n1 && n2 < n3) System.out.println(n2);
		else System.out.println(n3);
//		if (n3 < n1 && n3 < n2) System.out.println(n3);
		
		if(n1 < n2)
		{
			if(n1 < n3) System.out.println(n1 + " es menor que "+n2 + " y "+n3);
			else System.out.println(n3 + " es menor que "+n1 + " y "+n2);
		}
		else if(n2 < n3) System.out.println(n2 + " es menor que "+n1 + " y "+n3);
		else if(n3 < n1)
			if(n3<n2) System.out.println(n3 + " es menor que "+n1 + " y "+n2);
		
	}

}
