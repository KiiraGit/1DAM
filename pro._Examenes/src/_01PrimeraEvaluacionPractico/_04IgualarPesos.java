package _01PrimeraEvaluacionPractico;

import java.util.Scanner;

public class _04IgualarPesos 
{
	public static final int cucharada = 20;
	public static final int diferencia = 50;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int recip1, recip2, cucharadas = 0;
		
		System.out.print("Peso del recipiente 1: ");
		recip1 = tec.nextInt();
		
		System.out.print("Peso del recipiente 2: ");
		recip2 = tec.nextInt();
		
		while (Math.abs(recip1 - recip2) > diferencia)
		{
			if (recip1 > recip2)
			{
				recip1 -= cucharada;
				recip2 += cucharada;
			}
			else
			{
				recip1 += cucharada;
				recip2 -= cucharada;
			}
			cucharadas++;
			System.out.println("Recipiente 1: " + recip1 + " - Recipiente 2: " + recip2);
		}
		System.out.println("IGUALADOS. Cucharadas movidas: " + cucharadas);
	}

}
