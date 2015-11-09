package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _18CirculoCentradoCambiaTamanyo 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Centrado Cambio Tamaño", 200, 200);
		int r = 20;
		Circulo c = new Circulo(wnd.getAnchura() / 2, wnd.getAltura() / 2, r);
		wnd.anyadir(c);
		
		while (r < wnd.getAltura() / 2)
		{
			wnd.esperar(200);
			r+=10;
			c.setRadio(r);
		}

	}

}
