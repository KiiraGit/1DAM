package _03Ejercicios._02GestionHospital;

public class Paciente 
{
	String nombre;
	int edad;
	int estado;
	
	public Paciente(String n, int e)
	{
		nombre = n;
		edad = e;
		estado = (int)(Math.random() * 5) + 1;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public int getEstado()
	{
		return estado;
	}
	
	public void mejorar()
	{
		if (estado < 6) estado++;
	}
	
	public void empeorar()
	{
		if (estado > 0) estado--;
	}
	
	public String toString()
	{
		return nombre + " " + edad + " " + estado;
	}
	
	public int compareTo(Object o)
	{
		Paciente p = (Paciente)o;
		if (this.estado < p.estado) return 1;
		else if (this.estado > p.estado) return -1;
		else if (this.edad < p.edad) return -1;
		else if (this.edad > p.edad) return 1;
		else return 0;
	}
}
