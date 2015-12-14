package _03EjerciciosAlternativas;

import java.util.Scanner;

public class _20Validar 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		char x;
		byte y;
		boolean result;
		
		x = tec.next().charAt(0);
		y = tec.nextByte();
		
		result = ((x == 'a' && y % 2 != 0) || (x == 'b' && y % 2 == 0)) && (y >= 1 && y <= 10);
		
		if (result) System.out.println("VALIDOS");
		else System.out.println("NO VALIDOS");
		
		//	Ternario
//		System.out.println((((x == 'a' && y % 2 != 0) || (x == 'b' && y % 2 == 0)) && (y >= 1 && y <= 10)?"":"NO ") + "VALIDOS");
//		System.out.println(((x == 'a' && y % 2 != 0) || (x == 'b' && y % 2 == 0)) && (y >= 1 && y <= 10)?"VALIDOS":"NO VALIDOS");
	}

}
