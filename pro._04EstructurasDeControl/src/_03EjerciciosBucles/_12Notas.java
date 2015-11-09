package _03EjerciciosBucles;

import java.util.Scanner;

public class _12Notas 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int totalNotas = 0, aprobados = 0;
		double media = 0;
		
		int nota = 0;
		
		while (nota >= 0)
		{
			nota = tec.nextInt();
			if (nota >= 0)
			{
				totalNotas++;
				if (nota >= 5)
				{
					aprobados++;
				}
				media += nota;
			}
		}
		media /= totalNotas;
		System.out.println("Total de notas introducidas: " + totalNotas);
		System.out.println("Total de aprobados introducidos: " + aprobados);
		System.out.println("Nota media: " + media);
	}

}
