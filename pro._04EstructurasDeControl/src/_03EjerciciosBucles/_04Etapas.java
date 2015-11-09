package _03EjerciciosBucles;

import java.util.Scanner;

public class _04Etapas 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		double perEach;
		int perInf = 0, perPub = 0, perAdo = 0, perAdu = 0, perVej = 0, perAnc = 0;
		
		System.out.print("Personas que participan en la muestra: ");
		n = tec.nextInt();
		int[] personas = new int[n];
		perEach = 100.0 / n;
		System.out.println(perEach);
		
		for (int i = 0; i < personas.length; i++)
		{
			personas[i] = tec.nextInt();
			if (personas[i] <= 10)
			{
				perInf ++;
			}
			else if (personas[i] <= 14)
			{
				perPub ++;
			}
			else if (personas[i] <= 21)
			{
				perAdo ++;
			}
			else if (personas[i] <= 55)
			{
				perAdu ++;
			}
			else if (personas[i] <= 70)
			{
				perVej ++;
			}
			else 
			{
				perAnc ++;
			}
		}
		System.out.println("Infancia: " + String.format("%.1f", perInf * perEach) + "%");
		System.out.println("Pubertad: " + String.format("%.1f", perPub * perEach) + "%");
		System.out.println("Adolescencia: " + String.format("%.1f", perAdo * perEach) + "%");
		System.out.println("Adultez: " + String.format("%.1f", perAdu * perEach) + "%");
		System.out.println("Vejez: " + String.format("%.1f", perVej * perEach) + "%");
		System.out.println("Ancianidad: " + String.format("%.1f", perAnc * perEach) + "%");
//		System.out.format("%f", perPub * perEach);
//		System.out.format("%f", perAdo * perEach);
//		System.out.format("%f", perAdu * perEach);
//		System.out.format("%f", perVej * perEach);
//		System.out.format("%f", perAnc * perEach);
	}

}
