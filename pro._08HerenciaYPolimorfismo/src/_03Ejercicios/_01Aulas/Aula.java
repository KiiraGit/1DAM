package _03Ejercicios._01Aulas;

public class Aula 
{
	private static double supAlumno = 1.4;
	
	private int codigo;
	private int longitud, altura;
	
	Aula(int cod, int lon, int alt)
	{
		codigo = cod;
		longitud = lon;
		altura = alt;
	}
	
	public void setCodigo(int cod)
	{
		codigo = cod;
	}
	
	public void setLongitud(int lon)
	{
		longitud = lon;
	}
	
	public void setAltura(int alt)
	{
		altura = alt;
	}
	
	public final int getCodigo()
	{
		return codigo;
	}
	
	public final int getAltura()
	{
		return altura;
	}
	
	public final int getLongitud()
	{
		return longitud;
	}
	
	public final double getSuperficie()
	{
		return altura * longitud;
	}
	
	public int getCapacidad()
	{
		double sup = getSuperficie();
		int cap = (int)(sup / supAlumno);
		
		return cap;
	}
	
	public String toString()
	{
		return ("Codigo: " + codigo + ", Superficie: " + getSuperficie() + ", Capacidad: " + getCapacidad());
	}
}
