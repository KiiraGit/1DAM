package _02SegundaEvaluacionPractico;

public class _04CatalogoExcepciones 
{
	public static class CatalogoLlenoException extends Exception
	{
		public CatalogoLlenoException()
		{
			super("Catalogo lleno, no puede añadir mas coches");
		}
	}
}
