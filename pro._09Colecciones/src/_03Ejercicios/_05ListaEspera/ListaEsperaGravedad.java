package _03Ejercicios._05ListaEspera;

import java.util.SortedSet;
import java.util.TreeSet;

public class ListaEsperaGravedad 
{
	private SortedSet<Paciente> listaEspera;
	
	public ListaEsperaGravedad() 
	{
		listaEspera = new TreeSet<>();
	}
	
	public boolean insertarPaciente(Paciente p)
	{
		if (listaEspera.contains(p)) return false;
		else
		{
			listaEspera.add(p);
			return true;
		}
	}
	
	public Paciente getPrioritario()
	{
		if (listaEspera.size() > 0)
			return listaEspera.first();
		else return null;
	}
	
	public Paciente popPrioritario()
	{
		Paciente prioritario = getPrioritario();
		if (prioritario != null) listaEspera.remove(prioritario);
		return prioritario;
	}
}
