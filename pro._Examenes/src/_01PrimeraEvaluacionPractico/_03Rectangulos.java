package _01PrimeraEvaluacionPractico;

import figuras.*;

public class _03Rectangulos 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("_03Rectangulos", 400, 400);
		Circulo c = new Circulo(Circulo.VERDE, 200, 200, 50);
		wnd.anyadir(c);

		Rectangulo recDerecha = new Rectangulo(Rectangulo.ROJO, c.getPosx() + c.getRadio(), c.getPosy() - c.getRadio(), c.getRadio() * 2, c.getRadio() * 2);
		Rectangulo recDebajo = new Rectangulo(Rectangulo.ROJO, c.getPosx() - c.getRadio(), c.getPosy() + c.getRadio(), c.getRadio() * 2, c.getRadio() * 2);
		wnd.anyadir(recDerecha);
		wnd.anyadir(recDebajo);
	}
}
