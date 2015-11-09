package _03EjerciciosBucles;

import java.util.Scanner;

public class _10Transportes 
{
	static final int maxBultos = 30;
	static final int maxKg = 1000;
	static final int costeBulto = 30;
	static final int extraKg = 300;
	static final double extraCoste = 0.9;
	static final int extraSabado = 60;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int bultos, dia, kg = 0, coste = 0;
		
		System.out.print("Introduce el numero de bultos a transportar: ");
		bultos = tec.nextInt();
		//	Limite de bultos
		if (bultos > maxBultos)
		{
			System.out.println("No se pueden hacer transportes de mas de " + maxBultos + " bultos");
		}
		else 
		{
			System.out.println("Introduce el dia a realizar el transporte (1-7): ");
			dia = tec.nextInt();
			//	Domingo festivo
			if (dia == 7)
			{
				System.out.println("La empresa no realiza transportes los domingos");
			}
			else 
			{
				for (int i = 0; i < bultos; i++)
				{
					System.out.print("Bulto " + (i + 1) + ": ");
					kg += tec.nextInt();
				}
				
				if (kg > maxKg)
				{
					System.out.println("No se pueden realizar transportes de mas de " + maxKg + " kg");
				}
				else
				{
					coste += bultos * costeBulto;
					if (kg > extraKg)
					{
						coste += (kg - extraKg) * extraCoste;
					}
					if (dia == 6)
					{
						coste += extraSabado;
					}
				}
			}
		}
		System.out.println("El coste del transporte es de " + coste + "€");
	}
}
