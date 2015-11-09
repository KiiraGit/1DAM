package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _19CirculoCambiaColor 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Cambia Color", 200, 200);
		Circulo c = new Circulo(wnd.getAnchura() / 2, wnd.getAltura() / 2, 20);
		wnd.anyadir(c);
		while (c.getColor() != c.ROJO)
		{
			wnd.esperar(200);
			int color = (int)(Math.random() * 4);
			c.setColor(color);
		}
	}

}
