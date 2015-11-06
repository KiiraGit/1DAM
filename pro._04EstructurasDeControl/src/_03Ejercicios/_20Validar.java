package _03Ejercicios;

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
		
		result = ((x == 'a' && y % 2 != 0) || (x == 'b' && y % 2 == 0));
		
		if (result) System.out.println("VALIDOS");
		else System.out.println("NO VALIDOS");
	}

}
