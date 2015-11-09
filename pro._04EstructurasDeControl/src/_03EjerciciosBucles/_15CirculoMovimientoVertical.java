package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _15CirculoMovimientoVertical 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Movimiento Vertical", 300, 200);
		Circulo c = new Circulo(20, 20, 20);
		int y = c.getPosy();
		wnd.anyadir(c);
		
		while (y < wnd.getAltura() - c.getRadio())
		{
			wnd.esperar(200);
			y += 10;
			c.setPosy(y);
			if (c.getColor() + 1 < 4) c.setColor(c.getColor() + 1);
			else c.setColor(0);
		}
	}

}
