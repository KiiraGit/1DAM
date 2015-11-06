package _03Ejercicios;

import java.util.Scanner;

public class _24Calculadora 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		double n1, n2;
		char op;
		
		n1 = tec.nextDouble();
		op = tec.next().charAt(0);
		n2 = tec.nextDouble();
		
		switch(op)
		{
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n1 / n2);
				break;
		}
	}
}
