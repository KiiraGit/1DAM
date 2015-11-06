package _03Ejercicios;

import java.util.Scanner;

public class _05LetraNif 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce tu nif: ");
		String dni = tec.nextLine();
		int resto;
		char[] letra = new char[2];
		
		if (Character.isAlphabetic(dni.charAt(dni.length() - 1)))
		{
			letra[0] = dni.charAt(dni.length() - 1);
			dni = dni.substring(0, dni.length() - 1);
			System.out.println(Integer.valueOf(dni.substring(0, dni.length())));
			//System.out.println(resto);
		}
		resto = Integer.valueOf(dni.substring(0, dni.length())) % 23;
		System.out.println(resto);
		switch(resto)
		{
		case 0:
			letra[1] = 'T';
			break;
		case 1:
			letra[1] = 'R';
			break;
		case 2:
			letra[1] = 'W';
			break;
		case 3:
			letra[1] = 'A';
			break;
		case 4:
			letra[1] = 'G';
			break;
		case 5:
			letra[1] = 'M';
			break;
		case 6:
			letra[1] = 'Y';
			break;
		case 7:
			letra[1] = 'F';
			break;
		case 8:
			letra[1] = 'P';
			break;
		case 9:
			letra[1] = 'D';
			break;
		case 10:
			letra[1] = 'X';
			break;
		case 11:
			letra[1] = 'B';
			break;
		case 12:
			letra[1] = 'N';
			break;
		case 13:
			letra[1] = 'J';
			break;
		case 14:
			letra[1] = 'Z';
			break;
		case 15:
			letra[1] = 'S';
			break;
		case 16:
			letra[1] = 'Q';
			break;
		case 17:
			letra[1] = 'V';
			break;
		case 18:
			letra[1] = 'H';
			break;
		case 19:
			letra[1] = 'L';
			break;
		case 20:
			letra[1] = 'C';
			break;
		case 21:
			letra[1] = 'K';
			break;
		case 22:
			letra[1] = 'E';
			break;
		}
		
		if (letra[0] == letra[1]) System.out.println("La letra es correcta.");
		else if (String.valueOf(letra[0]) != null) System.out.println("Tu letra es " + letra[1]);
	}

}