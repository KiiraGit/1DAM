package _2FiltroConInterface;

import personas.Persona;

public class FiltroEdad implements Filtro
{

	@Override
	public boolean filtrar(Persona p, int maxValue) 
	{
		if (p.getEdad() <= maxValue) return true;
		else return false;
	}
}
