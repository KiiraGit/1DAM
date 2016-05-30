package _03Ejercicios._05ListaEspera;

public class Paciente implements Comparable<Paciente>
{
	private String nombre;
	private int gravedad;

	public Paciente(String n) 
	{
		nombre = n;
		gravedad = (int)(Math.random() * 5) + 1;
	}

	@Override
	public int compareTo(Paciente p) 
	{
		if(p.gravedad >= this.gravedad) return 1;
		else return -1;
	}
	
	public boolean equals(Paciente p)
	{
		if(p == this) return true;
		else
		{
			if (p.nombre.equals(p.nombre)) return true;
			else return false;
		}
	}

}
