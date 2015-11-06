package _03Ejercicios;

import pizarra.Pizarra;
import figuras.*;

public class _05CentrarFiguras 
{
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra();
		Rectangulo r = new Rectangulo(0, p.getAnchura()/2 - 50, p.getAltura()/2 - 50, 100, 100);
		Circulo c = new Circulo(2, p.getAnchura()/2, p.getAltura()/2, 25);
		p.anyadir(r);
		p.anyadir(c);
	}

}
