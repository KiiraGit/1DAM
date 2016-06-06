package _2FiltroConInterface;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas
{

	public static void main(String[] args) 
	{
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
//		System.out.println(filtrarEdad(l, 31));
	}

	public static List<Persona> filtrar(List<Persona> l, Filtro f, int maxValue)
	{
		List<Persona> filtrada = new ArrayList<>();
		
		for (Persona p : l)
		{
			if (f.filtrar(p, maxValue))
			{
				filtrada.add(p);
			}
		}
		
		return filtrada;
	}
}
