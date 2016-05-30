package _03Ejercicios._01Aulas;

public class AulaInformatica extends Aula
{
	private int numOrdenadores;
	
	public AulaInformatica(int cod, int lon, int alt, int ordenadores) 
	{
		super(cod, lon, alt);
		numOrdenadores = ordenadores;
	}
	
	public final int getOrdenadores()
	{
		return numOrdenadores;
	}
	
	public void setOrdenadores(int ordenadores)
	{
		numOrdenadores = ordenadores;
	}
	
	@Override
	public int getCapacidad()
	{
		return numOrdenadores * 2;
	}
	
	@Override
	public String toString()
	{
		return ("Aula de Informática " + super.toString());
	}
}
