package _02Ejemplos;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _05DibujarCirculos 
{
	public static void main(String[] args) 
	{
		boolean dir = true;
		Pizarra p = new Pizarra("Circulos", 600, 400);
		int rad = 50;
		Circulo c = new Circulo(0, 300, 200, rad);
		boolean exit = false;
		while (!exit)
		{
			if (dir)
			{
				if (c.getRadio() > 160)
				{
					dir = false;
				}
				c.setRadio(c.getRadio() + 1);;
			}
			else
			{
				if (c.getRadio() < 50)
				{
					dir = true;
				}
				c.setRadio(c.getRadio() - 1);;
			}
			p.anyadir(c);
			p.esperar(20);
		}
	}

}
