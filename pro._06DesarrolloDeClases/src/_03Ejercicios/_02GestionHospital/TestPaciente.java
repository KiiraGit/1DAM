package _03Ejercicios._02GestionHospital;

import java.util.Scanner;

public class TestPaciente 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		Paciente[] pacientes = new Paciente[2];
		
		for (int i = 0; i < pacientes.length; i++)
		{
			String nombre = tec.nextLine();
			int edad = tec.nextInt();
			pacientes[i] = new Paciente(nombre, edad);
			tec.nextLine();
		}
		
		Paciente menor, mayor;// = pacientes[0];
//		System.out.println(pacientes[0].compareTo(pacientes[1]));
//		for (int i = 1; i < pacientes.length; i++)
//		{
//			if (pacientes[i].compareTo(menor) < 0)
//			{
//				menor = pacientes[i];
//			}
//		}
//		if (pacientes[0].get)
		
//		while (menor.getEstado() < pacientes[1].getEstado())
//		{
//			menor.mejorar();
//		}
		System.out.println(pacientes[0].getEstado() + ", " + pacientes[1].getEstado());
	}
}
