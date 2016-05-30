package _02Ejemplos;

import java.util.Scanner;

public class _01TestMedicos {

	public static void main(String[] args) 
	{
		Cirujano c = new Cirujano();
		c.hacerIncision();
		c.tratarPaciente();
		
		MedicoDeCabecera m = new MedicoDeCabecera();
		
		System.out.print("Cuantos pacientes debe tratar? ");
		int pacientes = new Scanner(System.in).nextInt();
		
		int muertos = 0, vivos = 0;
		for (int i = 0; i < pacientes; i++)
		{
			if (m.tratarPaciente() == 0) muertos++;
			else vivos++;
		}
		
		System.out.println(muertos + " pacientes muertos.");
		System.out.println(vivos + " pacientes vivos");
	}

}
