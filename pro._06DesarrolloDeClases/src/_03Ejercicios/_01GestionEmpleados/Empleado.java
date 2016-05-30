package _03Ejercicios._01GestionEmpleados;

import java.util.Calendar;

import org.omg.CORBA.Any;

public class Empleado implements Comparable
{
	private String Nombre;
	private String DNI;
	private int AnyoIngreso;
	private double BrutoAnual;
	
	public Empleado(String Nombre, String DNI, int AnyoIngreso, double SueldoBrutoAnual)
	{
		this.Nombre = Nombre;
		this.DNI = DNI;
		this.AnyoIngreso = AnyoIngreso;
		this.BrutoAnual = SueldoBrutoAnual;
	}
	
	//	Getters
	public String getNombre()
	{
		return Nombre;
	}
	public String getDNI()
	{
		return DNI;
	}
	public int getAnyoIngreso()
	{
		return AnyoIngreso;
	}
	public double getSueldoBrutoAnual()
	{
		return BrutoAnual;
	}
	
	public int antiguedad()
	{
		return Math.max(0, Calendar.getInstance().get(Calendar.YEAR) - AnyoIngreso);
	}
	
	public void incrementarSueldo(double porcentaje)
	{
		BrutoAnual *= 1 + (porcentaje / 100);
	}
	
	public String toString()
	{
		String info = "Nombre: " + this.Nombre + "\n";
		info += "Dni: " + this.DNI + "\n";
		info += "Año de Ingreso: " + this.AnyoIngreso + "\n";
		info += "Sueldo bruto anual: " + this.BrutoAnual + " €";
		
		return info;
	}
	
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (!(o instanceof Empleado)) return false;
		
		return this.DNI.equals(((Empleado)o).DNI); // Se puede acceder a la variable privada DNI porque estoy dentro de la
													//	clase Empleado, aunque haga referencia a otro empleado
	}
	
	@Override
	public int compareTo(Object o)
	{
		return this.DNI.compareTo(((Empleado)o).DNI);
	}
	
	public static double calcularIRPF(double salario)
	{
		if (salario < 800)
		{
			return 3;
		}
		else if (salario < 1000)
		{
			return 10;
		}
		else if (salario < 1500)
		{
			return 15;
		}
		else if (salario < 2100)
		{
			return 20;
		}
		else
		{
			return 30;
		}
	}
}
