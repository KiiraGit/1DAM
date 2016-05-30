package _03Ejercicios._04Televisores;

public class TVTubo extends Televisor 
{
	private int lineas;
	
	public TVTubo(String ma, String mo, double pr, double pu, int li) 
	{
		super(ma, mo, pr, pu);
		lineas = li;
	}

	@Override
	public String resolucion() 
	{
		return lineas + " lineas";
	}
}
