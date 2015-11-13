package _03EjerciciosBuclesAnidados;

import java.util.Scanner;

public class _02NotasPorAlumno 
{
	static final int A = 4;
	static final int S = 7;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i < A; i++)
		{
			System.out.println("Alumno " + (i + 1));
			for (int j = 0; j < S; j++)
			{
				System.out.print("Introduce la nota de la asignatura " + (j + 1) + ": ");
				tec.nextInt();
			}
		}

	}

}
