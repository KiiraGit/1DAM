package _03Ejercicios._02GestionHospital;

public class ExcepcionesHospital 
{
	static class HospitalLLenoException extends Exception
	{
		public HospitalLLenoException()
		{
			super("Hospital lleno");
		}
	}
}
