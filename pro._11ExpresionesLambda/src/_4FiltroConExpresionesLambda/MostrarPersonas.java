package _4FiltroConExpresionesLambda;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas
{
	//	Expresiones lambda solo funcionan con iterfaces funcionales
	//	Una interfaz funcional es una interfaz que solo contiene un metodo
	//	El metodo no puede llamarse igual que los metodos de la clase Object (Equals, hashCode, etc...)
	public static void main(String[] args) 
	{
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		//	Si la funcion tiene mas de un parametro hay que pasarlo con parentesis
		System.out.println(filtrar(l, (Persona p, int maxValue) -> p.getEdad() > maxValue));
		//	Si la funcion tiene solo un parametro no hace falta pasarlo con parentesis
		System.out.println(filtrar2(l, p -> p.getPeso() > 31));
	}
	
	public static List<Persona> filtrar(List<Persona> l, FiltroConParametroMax f)
	{
		List<Persona> filtrada = new ArrayList<>();
		for (Persona p: l)
		{
			if (f.filtrar(p, 31)) filtrada.add(p);
		}
		return filtrada;
	}
	
	public static List<Persona> filtrar2(List<Persona> l, FiltroSinParametro f)
	{
		List<Persona> filtrada = new ArrayList<>();
		for (Persona p: l)
		{
			if (f.filtrar(p)) filtrada.add(p);
		}
		return filtrada;
	}
}
