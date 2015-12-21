package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _19CirculoCambiaColor 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Cambia Color", 600, 600);
		Circulo c = new Circulo(wnd.getAnchura() / 2, wnd.getAltura() / 2, 300);
		wnd.anyadir(c);
		while (c.getColor() != 5)
		{
			wnd.esperar(100);
			int color = (int)(Math.random() * 4);
			c.setColor(color);
		}
	}

}
