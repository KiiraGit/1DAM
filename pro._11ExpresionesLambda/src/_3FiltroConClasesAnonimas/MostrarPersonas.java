package _3FiltroConClasesAnonimas;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas
{

	public static void main(String[] args) 
	{
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(filtrar(l, new Filtro() {
			
			@Override
			public boolean filtrar(Persona p, int maxValue) 
			{
				if (p.getEdad() < maxValue) return true;
				else return false;
			}
		}));
	}
	
	public static List<Persona> filtrar(List<Persona> l, Filtro f)
	{
		List<Persona> filtrada = new ArrayList<>();
		for (Persona p: l)
		{
			if (f.filtrar(p, 31)) filtrada.add(p);
		}
		return filtrada;
	}
}
