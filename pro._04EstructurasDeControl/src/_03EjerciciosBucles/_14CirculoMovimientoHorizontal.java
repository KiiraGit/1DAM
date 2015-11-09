package _03EjerciciosBucles;

import pizarra.Pizarra;
import figuras.*;

public class _14CirculoMovimientoHorizontal 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Movimiento Horizontal", 300, 200);
		Circulo c = new Circulo(20, 20, 20);
		int x = c.getPosx();
		wnd.anyadir(c);
		
		while (x < wnd.getAnchura() - c.getRadio())
		{
			wnd.esperar(200);
			x += 10;
			c.setPosx(x);
		}
		
	}

}
