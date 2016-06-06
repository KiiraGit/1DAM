package _5FiltroConStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas
{
	//	Java 8 Streams documentacion
	public static void main(String[] args) 
	{
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(l.stream()
		.filter((Persona p) -> p.getEdad() > 31)
		.collect(Collectors.toList()));
	}
}
