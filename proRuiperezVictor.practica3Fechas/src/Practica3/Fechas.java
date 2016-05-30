package Practica3;

import java.util.Scanner;

public class Fechas 
{
	static Scanner tec = new Scanner(System.in);
	static boolean exit = false;	//	Condicion para terminar
	
	public static void main(String[] args) 
	{
		do
		{
			_00Menu.menu(tec);
		} while (!exit);
	}
}
