package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _16CirculoMovimientoDiagonal 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Movimiento Diagonal", 200, 200);
		Circulo c = new Circulo(20, 20, 20);
		int x = c.getPosx(), y = c.getPosy();
		wnd.anyadir(c);
		
		while (x < wnd.getAnchura() - c.getRadio() && y < wnd.getAltura() - c.getRadio())
		{
			wnd.esperar(200);
			x += 10;
			y += 10;
			c.setPosx(x);
			c.setPosy(y);
			if (c.getColor() + 1 < 4) c.setColor(c.getColor() + 1);
			else c.setColor(0);
		}
	}

}
