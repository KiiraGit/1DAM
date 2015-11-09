package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _20CirculoCambiaColor 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Cambia Color", 200, 200);
		Circulo c = new Circulo(wnd.getAnchura() / 2, wnd.getAltura() / 2, 20);
		wnd.anyadir(c);
		boolean rojo = false, azul = false, verde = false, amarillo = false;
		
		while (!rojo && !azul && !verde && !amarillo)
		{
			wnd.esperar(200);
			int color = (int)(Math.random() * 4);
			switch (color)
			{
			case 0:
				verde = true;
				break;
			case 1:
				rojo = true;
				break;
			case 2:
				azul = true;
				break;
			case 3:
				amarillo = true;
				break;
			}
			c.setColor(color);
		}
	}

}
