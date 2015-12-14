package _01PrimeraEvaluacionPractico;

import java.util.Scanner;

public class _05AdivinarNumero 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int secretNum = (int)(Math.random() * 99) + 1;
		int intento, cont = 1;
		
		do
		{
			System.out.print("Intento " + cont + ": ");
			intento = tec.nextInt();
			if (intento > secretNum) System.out.println("Te has pasado");
			else if (intento < secretNum) System.out.println("Te has quedado corto");
			else System.out.println("¡ACERTASTE!");
			cont++;
		}while (intento != secretNum && cont <= 10);
		
		if (intento != secretNum && cont == 10) System.out.println("Intentos agotados");
	}
}
