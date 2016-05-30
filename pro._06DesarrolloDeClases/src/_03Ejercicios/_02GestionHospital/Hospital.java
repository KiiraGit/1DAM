package _03Ejercicios._02GestionHospital;

import _03Ejercicios._02GestionHospital.ExcepcionesHospital.HospitalLLenoException;

public class Hospital 
{
	public final int MAXC = 200;
	
	private Paciente[] listaCamas;
	private int numLibres;
	
	public Hospital()
	{
		listaCamas = new Paciente[MAXC + 1];
		numLibres = MAXC;
	}
	
	public int getNumLibres()
	{
		return numLibres;
	}
	
	public boolean hayLibres()
	{
		return (numLibres > 0);
	}
	
	public int primeraLibre()
	{
		if (!hayLibres()) return 0;
		else
		{
			int i = 1;
			while (i < listaCamas.length && listaCamas[i] != null)
			{
				i++;
			}
			return i;
		}
	}
	
	public void ingresarPaciente(String n, int e) throws HospitalLLenoException
	{
		int libre = primeraLibre();
		if (libre != 0)
		{
			listaCamas[libre] = new Paciente(n, e);
			numLibres--;
		}
		else throw new HospitalLLenoException();
	}
	
	public void darAltaPaciente(int i)
	{
		listaCamas[i] = null;
		numLibres++;
	}
}
