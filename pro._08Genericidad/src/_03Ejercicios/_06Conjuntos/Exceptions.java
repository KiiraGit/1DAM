package _03Ejercicios._06Conjuntos;

public class Exceptions 
{
	public static class ElementoDuplicado extends Exception 
	{
		public ElementoDuplicado() 
		{
			super("Elemento duplicado");
		}
	}
	public static class ElementoNoEncontrado extends Exception 
	{
		public ElementoNoEncontrado() 
		{
			super("Elemento no encontrado");
		}
	}
}