package _03Ejercicios._02Biblioteca;

public class Libro 
{
	private String Titulo;
	private String Autor;
	private String Estanteria;
	
	public Libro(String titulo, String autor, String estanteria)
	{
		this.Titulo = titulo;
		this.Autor = autor;
		this.Estanteria = estanteria;
	}

	public String getTitutlo() 
	{
		return Titulo;
	}

	public String getAutor() 
	{
		return Autor;
	}

	public String getEstanteria() 
	{
		return Estanteria;
	}
	
	public boolean equals(Object o)
	{
		Libro l = (Libro)o;
		if (this.Titulo.equals(l.Titulo)) return true;
		else return false;
	}
}
