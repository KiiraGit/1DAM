package _03Ejercicios._02Biblioteca;

import java.util.Scanner;

public class TestBiblioteca 
{

	public static void main(String[] args) 
	{
		CatalogoLibros catalogo = new CatalogoLibros();
		
		String tit = "";
		Scanner tec = new Scanner(System.in);
		boolean cont = true;
		
		while(cont)
		{
			System.out.println("Escribe el titulo que desees consultar: ");
			tit = tec.nextLine();
			Libro busqueda = new Libro(tit, "", "");
			
			String est = catalogo.buscar(busqueda);
			if (est != null) System.out.println(est);
			else System.out.println("No se encuentra el libro");
			
			System.out.println("Deseas hacer otra busqueda?(Y/N)");
			tit = tec.nextLine();
			if (tit.equals("N")) cont = false;
		}
	}

}
