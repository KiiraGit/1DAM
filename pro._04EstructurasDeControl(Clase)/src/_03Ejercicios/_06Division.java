package _03Ejercicios;

import java.util.Scanner;

public class _06Division 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int n1, n2, result;
		
		n1 = tec.nextInt();
		n2 = tec.nextInt();
		
		try {
			result = n1/n2;
			System.out.println(result);
		} catch (ArithmeticException ex)
		{
			if (ex.toString().substring(ex.toString().lastIndexOf(' ')) == "zero")
			{
				System.out.println("No se puede dividir por cero");
			}
			//System.out.println(ex);
		}
	}

}
