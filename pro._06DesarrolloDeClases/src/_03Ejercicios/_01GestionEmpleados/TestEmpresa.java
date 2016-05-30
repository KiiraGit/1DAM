package _03Ejercicios._01GestionEmpleados;

import java.util.Scanner;

import _03Ejercicios._01GestionEmpleados.ExcepcionesEmpresa.ElementoNoEncontradoException;
import _03Ejercicios._01GestionEmpleados.ExcepcionesEmpresa.PlantillaCompletaException;

public class TestEmpresa {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce el nombre de la empresa: ");
		Empresa empresa = new Empresa(tec.nextLine());
		
		System.out.println("Fase de contratacion");
		System.out.print("Cuantos empleados quieres contratar? ");
		int num = tec.nextInt();
		boolean contratable = true;
		
		for (int i = 0; i < num && contratable; i++)
		{
			tec.nextLine();
			System.out.println();
			System.out.print("Nombre del empleado: ");
			String nombreEmp = tec.nextLine();

			System.out.print("DNI del empleado: ");
			String dni = tec.nextLine();

			System.out.print("Año de ingreso del empleado: ");
			int anyo  = tec.nextInt();
			
			System.out.print("Sueldo del empleado: ");
			double sueldo = tec.nextDouble();
			
			Empleado temp = new Empleado(nombreEmp, dni, anyo, sueldo);
			
			try 
			{
				empresa.contratar(temp);
				System.out.println(temp.getNombre().toUpperCase() + " CONTRATADO!");
			} catch (PlantillaCompletaException e) 
			{
				e.getMessage();
				contratable = false;
				System.out.println("NO CONTRATADO");
				System.out.println("PLANTILLA LLENA, SALTANDO LA FASE DE CONTRATACION");
			}
		}
		
		empresa.subirTrienio(10);
		
		System.out.println(empresa.toString());
		
		System.out.println("Hora de despedir");
		System.out.println("A cuantos quieres despedir?");
		int despidos = tec.nextInt();
		tec.nextLine();
		
		for (int i = 0; i < despidos; i++)
		{
			boolean exit = false;
			while (!exit)
			{
				System.out.println("Introduce el DNI del empleado a despedir");
				String dniDesp = tec.nextLine();
				if (dniDesp != "0")
				{
					try
					{
						empresa.despedir(new Empleado("", dniDesp, 0, 0));
						exit = true;
						System.out.println(dniDesp + " Despedido!");
					} catch (ElementoNoEncontradoException ex)
					{
						System.out.println(ex.getMessage());
					}
				}
				else 
				{
					System.out.println("Saliendo de la fase de despido");
					exit = true;
				}
			}
		}
	}

}
