package _1FiltroConMetodos;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas 
{

	public static void main(String[] args) 
	{
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(filtrarEdad(l, 31));
	}

	public static List<Persona> filtrarEdad(List<Persona> l, int edadMax)
	{
		List<Persona> filtrada = new ArrayList<>();
		
		for (Persona p : l)
		{
			if (p.getEdad() < edadMax)
			{
				filtrada.add(p);
			}
		}
		
		return filtrada;
	}
}
