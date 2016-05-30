package _03Ejercicios._05ListaEspera;

import java.util.LinkedList;
import java.util.List;

public class ListaEspera 
{
	private List<Paciente> listaEspera;
	
	public ListaEspera() 
	{
		listaEspera = new LinkedList<>();
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
			return listaEspera.get(0);
		else return null;
	}
	
	public Paciente popPrioritario()
	{
		Paciente prioritario = getPrioritario();
		if (prioritario != null) listaEspera.remove(0);
		return prioritario;
	}
}
