package _02Ejemplos;

public class Cirujano extends Medico
{
	@Override
	int tratarPaciente()
	{
		System.out.println("Puto jefe, puto amo.");
		return 1;
	}
	
	void hacerIncision()
	{
		System.out.println("Cirujano indice, cirujano aplasta.");
	}
}
