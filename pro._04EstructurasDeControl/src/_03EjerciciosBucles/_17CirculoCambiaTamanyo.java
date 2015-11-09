package _03EjerciciosBucles;

import figuras.Circulo;
import pizarra.Pizarra;

public class _17CirculoCambiaTamanyo 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("Circulo Cambio Tamaño", 200, 200);
		Circulo c = new Circulo(20, 20, 20);
		int r = c.getRadio();
		wnd.anyadir(c);
		
		while (r < wnd.getAltura() / 2)
		{
			wnd.esperar(200);
			r+=10;
			c.setPosx(r);
			c.setPosy(r);
			c.setRadio(r);
		}
	}

}
