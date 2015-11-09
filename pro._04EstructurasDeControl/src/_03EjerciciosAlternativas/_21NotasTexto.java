package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _21NotasTexto 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		byte nota;
		System.out.print("Introduce tu nota: ");
		nota = tec.nextByte();
		
		switch (nota)
		{
			case 1: case 2: case 3: case 4:
				System.out.println("INSUFICIENTE");
				break;
			case 5:
				System.out.println("SUFICIENTE");
				break;
			case 6:
				System.out.println("BIEN");
				break;
			case 7: case 8:
				System.out.println("NOTABLE");
			case 9: case 10:
				System.out.println("SOBRESALIENTE");
		}
	}
}
