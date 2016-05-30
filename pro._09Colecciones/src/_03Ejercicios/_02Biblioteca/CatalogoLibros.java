package _03Ejercicios._02Biblioteca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoLibros 
{
	private List<Libro> libros;
	
	public CatalogoLibros()
	{
		libros = new ArrayList<>();
		try 
		{
			File BBDD = new File("src/_03Ejercicios/_02Biblioteca/AlmacenLibros.txt");
			Scanner DataBase = new Scanner(BBDD);
			
			while (DataBase.hasNextLine())
			{
				String T = DataBase.nextLine();
				String A = DataBase.nextLine();
				String E = DataBase.nextLine();
				
				libros.add(new Libro(T, A, E));
				DataBase.nextLine();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String buscar(Libro l)
	{
		if (libros.contains(l))
		{
			return libros.get(libros.indexOf(l)).getEstanteria();
		}
		else return null;
	}
}
