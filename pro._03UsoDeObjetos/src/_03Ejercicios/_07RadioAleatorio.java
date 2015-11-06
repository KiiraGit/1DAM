package _03Ejercicios;


import pizarra.Pizarra;
import figuras.*;

public class _07RadioAleatorio 
{
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra();
		int rad = (int)(Math.random() * 150) + 50;
		Circulo c = new Circulo(rad, rad, rad);
		p.anyadir(c);
	}

}
