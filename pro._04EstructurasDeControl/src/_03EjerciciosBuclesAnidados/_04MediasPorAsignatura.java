package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _04MediasPorAsignatura 
{
	static final int A = 4;
	static final int S = 7;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		double media = 0;
		
		for (int i = 0; i < S; i++)
		{
			System.out.println("Asignatura " + (i + 1));
			for (int j = 0; j < A; j++)
			{
				System.out.print("Introduce la nota del alumno " + (j + 1) + ": ");
				media += tec.nextInt();
			}
			System.out.println("Media de la asignatura " + (i + 1) + ": " + media / A);
			media = 0;
		}

	}
}
