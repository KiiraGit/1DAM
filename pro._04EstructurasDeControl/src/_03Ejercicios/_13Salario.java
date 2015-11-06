package _03Ejercicios;

import java.util.Scanner;

public class _13Salario 
{
	static final byte ordinarias = 6;
	static final byte extra = 10;
	static final byte impuestoBajo = 2;
	static final byte impuestoAlto = 10;
	static final short limiteImpuestos = 350;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int horas;
		float salario = 0;
		System.out.print("Introduzca las horas trabajadas: ");
		horas = tec.nextByte();
		if (horas >= 40)
		{
			horas -= 40;
			salario += 40 * ordinarias;
			if (horas > 0) salario += horas * extra;
		}
		else salario = horas * ordinarias;
		
		if (salario <= limiteImpuestos) salario *= 1.0 - (impuestoBajo / 100.0);
		else salario *= 1.0 - (impuestoAlto / 100.0);
		System.out.println(salario);
	}

}
