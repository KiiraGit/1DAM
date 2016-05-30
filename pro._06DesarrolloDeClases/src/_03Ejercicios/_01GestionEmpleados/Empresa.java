package _03Ejercicios._01GestionEmpleados;

import _03Ejercicios._01GestionEmpleados.ExcepcionesEmpresa.ElementoNoEncontradoException;
import _03Ejercicios._01GestionEmpleados.ExcepcionesEmpresa.PlantillaCompletaException;

public class Empresa 
{
	public static final int MAX_EMPLEADOS = 100;
	
	private String nombre;
	
	private Empleado[] plantilla;
	private int numEmpleados;
	
	public Empresa (String nombre)
	{
		this.nombre = nombre;
		plantilla = new Empleado[MAX_EMPLEADOS];
		numEmpleados = 0;
	}
	
	public void contratar(Empleado e) throws PlantillaCompletaException
	{
		if (numEmpleados == MAX_EMPLEADOS) throw new PlantillaCompletaException();
		
		plantilla[numEmpleados] = e;
		numEmpleados++;
	}
	
	public void despedir(Empleado e) throws ElementoNoEncontradoException
	{
		int pos = 0;
		
		while (pos < numEmpleados && !plantilla[pos].equals(e))
		{
			pos++;
		}
		
		if (pos == numEmpleados) throw new ElementoNoEncontradoException();
		else
		{
			for (int i = pos; i < numEmpleados - 1; i++)
			{
				plantilla[i] = plantilla[i + 1];
			}
			plantilla[numEmpleados - 1] = null;
			numEmpleados--;
		}
	}
	
	public void subirTrienio(double porcentaje)
	{
		for (int i = 0; i < numEmpleados; i++)
		{
			if (plantilla[i].antiguedad() % 3 == 0) 
			{
				plantilla[i].incrementarSueldo(porcentaje);
			}
		}
	}
	
	@Override
	public String toString()
	{
		StringBuilder string = new StringBuilder("Nombre : " + nombre + "\n");
		
		for (int i = 0; i < numEmpleados; i++)
		{
			string.append(plantilla[i].toString() + "\n");
		}
		
		return string.toString();
	}
}