package _03Ejercicios;

import figuras.Circulo;
import pizarra.Pizarra;

public class _08AgrandarCirculo 
{
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra();
		int rad = (int)(Math.random() * 100) + 100;
		Circulo c = new Circulo(rad, rad, rad);
		p.anyadir(c);
		p.esperar();
		rad+= rad * 0.5;
		c.setRadio(rad);
		c.setPosx(rad);
		c.setPosy(rad);
	}

}
