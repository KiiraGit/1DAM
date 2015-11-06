package _03Ejercicios;

import figuras.Rectangulo;
import pizarra.Pizarra;

public class _09CambioColor {

	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		Rectangulo r = new Rectangulo(0, 0, 0, p.getAnchura(), p.getAltura());
		p.anyadir(r);
//		p.esperar(500);
//		r.setColor(1);
//		p.esperar(500);
//		r.setColor(2);
//		p.esperar(500);
//		r.setColor(3);
		int chc = 0;
		while(chc < 4)
		{
			r.setColor(chc);
			p.esperar(50);
			chc++;
			if (chc > 3)
			{
				chc = 0;
			}
		}

	}

}
