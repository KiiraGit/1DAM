package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _03NotasPorAsignatura 
{
	static final int A = 4;
	static final int S = 7;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i < S; i++)
		{
			System.out.println("Asignatura " + (i + 1));
			for (int j = 0; j < A; j++)
			{
				System.out.print("Introduce la nota del alumno " + (j + 1) + ": ");
				tec.nextInt();
			}
		}

	}

}
