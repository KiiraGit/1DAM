package _01PrimeraEvaluacionPractico;

import java.util.Scanner;

public class _02BonoPiscina 
{
	public static final int bonoNinos = 20;
	public static final int bonoJovenes = 25;
	public static final int bonoAdultos = 70;
	public static final int bonoJubilados = 21;
	
	public static final double descNinos = 2.5;
	public static final double descJovenes = 3;
	public static final double descAdultos = 4.5;
	public static final double descJubilados = 5;
	
	public static final int descFamNum = 10;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		String socio, famNum;
		int edad;
		double precio = 0;
		
		//	Entrada de datos
		System.out.print("Socio (si / no): ");
		socio = tec.next();
		boolean esSocio = socio.equalsIgnoreCase("si");
		
		System.out.print("Familia numerosa (si / no): ");
		famNum = tec.next();
		
		System.out.print("Edad: ");
		edad = tec.nextInt();
		
		if (edad >= 5 && edad <= 80)
		{
			if (edad <=12)
			{
				precio = bonoNinos;
				if (esSocio) precio -= descNinos;
			}
			else if (edad <= 17)
			{
				precio = bonoJovenes;
				if (esSocio) precio -= descJovenes;
			}
			else if (edad <= 64)
			{
				precio = bonoAdultos;
				if (esSocio) precio -= descAdultos;
			}
			else
			{
				precio = bonoJubilados;
				if (esSocio) precio -= descJubilados;
			}
			
			if (famNum.equalsIgnoreCase("si")) precio -= descFamNum;
			
			System.out.println("El precio del bono es de " + precio + "€");
		}
		else
		{
			System.out.println("Edad no permitida");
		}
	}

}