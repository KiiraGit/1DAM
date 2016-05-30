package _03Ejercicios._04NeveraInteligente;

public class Alimento implements Comparable
{
	private String nombre;
	private int calorias;
	
	public Alimento(String n, int c)
	{
		nombre = n;
		calorias = c;
	}

	@Override
	public int compareTo(Object o) 
	{
		Alimento a = (Alimento)o;
		if (calorias > a.calorias)
		{
			return 1;
		}
		else if (calorias < a.calorias)
		{
			return -1;
		}
		else return 0;
	}

}
