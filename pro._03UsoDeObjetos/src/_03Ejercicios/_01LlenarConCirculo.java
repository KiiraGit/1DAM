package _03Ejercicios;

import pizarra.Pizarra;
import figuras.Circulo;

public class _01LlenarConCirculo 
{
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra("Llenar con Circulo", 500, 500);
		Circulo c = new Circulo(250, 250, 250);
		p.anyadir(c);
	}

}
