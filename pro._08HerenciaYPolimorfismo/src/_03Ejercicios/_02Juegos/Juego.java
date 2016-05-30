package _03Ejercicios._02Juegos;

public class Juego 
{
	protected String titulo, fabricante;
	protected int anyo;
	
	public Juego(String t, String f, int a)
	{
		titulo = t;
		fabricante = f;
		anyo = a;
	}
	
	public String getTitulo() 
	{
		return titulo;
	}

	public String getFabricante() 
	{
		return fabricante;
	}

	public int getAnyo() 
	{
		return anyo;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder();
		string.append("Título: " + titulo + "\n");
		string.append("Fabricante: " + fabricante + "\n");
		string.append("Año: " + anyo + "\n");
		
		return string.toString();
	}
	
	public boolean equals(Object o)
	{
		if (o instanceof Juego)
		{
			Juego j = (Juego)o;
			if (!this.titulo.equals(j.titulo)) return false;
			else if (!this.fabricante.equals(j.fabricante)) return false;
			else if (this.anyo != j.anyo) return false;
			else return true;
		}
		else return false;
	}
	
	public int compareTo(Object o)
	{
		Juego j = (Juego)o;
		int compare = this.titulo.compareTo(j.titulo);
		if (compare != 0) return compare;
		else
		{
			compare = this.fabricante.compareTo(j.fabricante);
			if (compare != 0) return compare;
			else
			{
				if (this.anyo < j.anyo) return -1;
				else if (this.anyo > j.anyo) return 1;
				else return 0;
			}
		}
	}
}
