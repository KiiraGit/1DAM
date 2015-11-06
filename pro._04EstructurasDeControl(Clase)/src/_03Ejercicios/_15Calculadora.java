package _03Ejercicios;

import java.util.Scanner;

public class _15Calculadora 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		double n1, n2;
		String op;
		
		n1 = tec.nextDouble();
		op = tec.next();
		n2 = tec.nextDouble();
		
		switch(op)
		{
			case "+":
				System.out.println(n1 + n2);
				break;
			case "-":
				System.out.println(n1 - n2);
				break;
			case "*":
				System.out.println(n1 * n2);
				break;
			case "/":
				System.out.println(n1 / n2);
				break;
		}
	}

}
