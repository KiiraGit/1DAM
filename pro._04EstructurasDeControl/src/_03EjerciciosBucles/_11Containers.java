package _03EjerciciosBucles;

import java.util.Scanner;

public class _11Containers 
{
	static final int maxTons = 700;
	static final int maxContainers = 100;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int tons = 0, containers = 0, lastCont = 0;
		
		while (tons < maxTons && containers < maxContainers)
		{
			System.out.print("Introduce peso del container " + (containers +1) + ":");
			lastCont = tec.nextInt();
			tons += lastCont;
			containers++;
		}
		if (tons > maxTons)
		{
			tons -= lastCont;
			containers--;
			System.out.println("El ultimo container introducido con un peso de " + lastCont + " toneladas no se puede cargar");
		}
		System.out.println("Se han cargado " + containers + " containers y tienen un peso total de " + tons + " toneladas");
	}
}
