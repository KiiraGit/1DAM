package _03Ejercicios;

import java.util.Scanner;

public class _04NotasTexto 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce tu nota: ");
		float nota = tec.nextFloat();
		
		if (nota > 0 && nota <= 10)
		{
			if (nota >= 9) System.out.println("Sobresaliente");
			else if (nota >= 7) System.out.println("Notable");
			else if (nota >= 6) System.out.println("Bien");
			else if (nota >= 5) System.out.println("Suficiente");
			else System.out.println("Insuficiente");
		}
	}

}
