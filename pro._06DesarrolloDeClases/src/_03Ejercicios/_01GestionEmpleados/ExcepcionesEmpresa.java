package _03Ejercicios._01GestionEmpleados;

public class ExcepcionesEmpresa
{

	static class PlantillaCompletaException extends Exception
	{
		public PlantillaCompletaException()
		{
			super("Plantilla completa, despida antes de contratar");
		}
	}
	
	static class ElementoNoEncontradoException extends Exception
	{
		public ElementoNoEncontradoException()
		{
			super("No se le puede despedir, no se ha encontrado el empleado");
		}
	}
	
}