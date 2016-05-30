package _03Ejercicios._01GestionEmpleados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEmpleado 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		//	Paso 1
		Empleado[] empleados = new Empleado[2];
		
		for (int i = 0; i < empleados.length; i++)
		{
			boolean correct = false;
			while (!correct)
			{
				try
				{
					System.out.println("Introduce los datos del empleado " + (i+1));
					System.out.print("Nombre: ");
					String nombre = tec.nextLine();
					System.out.print("DNI: ");
					String dni = tec.nextLine();
					System.out.print("A�o de ingreso: ");
					int anyoIngreso = tec.nextInt();
					System.out.print("Sueldo bruto anual: ");
					double sueldoBrutoAnual = tec.nextDouble();
					empleados[i] = new Empleado(nombre, dni, anyoIngreso, sueldoBrutoAnual);
					tec.nextLine();
					correct = true;
				}
				catch (InputMismatchException e)
				{
					System.err.println("Datos incorretos.\n"
							+ "Nombre (Texto)\n"
							+ "DNI (Texto)\n"
							+ "A�o Ingreso (Entero)\n"
							+ "Sueldo Bruto Anual (Real)");
					tec.nextLine();
				}
			}
		}
		mostrarDatos(empleados);
		
		//	Paso 2
		Empleado empleadoMenorSueldo = empleados[0];
		for (int i = 1; i < empleados.length; i++)
		{
			if (empleados[i].getSueldoBrutoAnual() < empleadoMenorSueldo.getSueldoBrutoAnual())
			{
				empleadoMenorSueldo = empleados[i];
			}
		}
		empleadoMenorSueldo.incrementarSueldo(20);
		mostrarDatos(empleados);
		
		//	Paso 3
		Empleado empleadoAntiguo = empleados[0];
		for (int i = 1; i < empleados.length; i++)
		{
			if (empleados[i].getAnyoIngreso() < empleadoAntiguo.getAnyoIngreso())
			{
				empleadoAntiguo = empleados[i];
			}
		}
		empleadoAntiguo.incrementarSueldo(10);
		mostrarDatos(empleados);
		
		//	Paso 4
		for (int i = 0; i < empleados.length; i++)
		{
			double irpf = Empleado.calcularIRPF(empleados[i].getSueldoBrutoAnual());
			System.out.println(empleados[i].getNombre() + ", IRPF: " + irpf);
		}
		mostrarDatos(empleados);
	}
	
	public static void mostrarDatos(Object[] o)
	{
		for (int i = 0; i < o.length; i++)
			System.out.println(o[i]);
	}

}
