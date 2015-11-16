package _03EjerciciosBucles;

import java.util.Scanner;

public class _03PotenciasDe2 {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero entero: ");
		n = tec.nextInt();
		
//		for (int i = 0; i <= n; i++)
//		{
//			int pow = 1;
//			for (int j = 1; j <= i; j++)
//			{
//				pow *= 2;
//			}
//			System.out.format("2**%d = %d\n", i, pow);
//		}
		int i = 0;
		int pow = 1;
		System.out.format("2**%d = %d\n", i, pow);
		i++;
		while (i <= n)
		{
			pow *= 2;
			System.out.format("2**%d = %d\n", i, pow);
			i++;
		}
	}

}
