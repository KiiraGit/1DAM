package _01PrimeraEvaluacionPractico;

import java.util.Random;

import figuras.Circulo;
import figuras.Figura;
import figuras.Pizarra;
import figuras.Rectangulo;

public class _03Rectangulos 
{
	public static void main(String[] args) 
	{
		Pizarra wnd = new Pizarra("_03Rectangulos", 800, 600);
		Circulo c = crearCirculoAleatorio();
		wnd.anyadir(c);

		Rectangulo recDerecha = new Rectangulo(Rectangulo.ROJO, c.getPosx() + c.getRadio(), c.getPosy() - c.getRadio(), c.getRadio() * 2, c.getRadio() * 2);
		Rectangulo recDebajo = new Rectangulo(Rectangulo.ROJO, c.getPosx() - c.getRadio(), c.getPosy() + c.getRadio(), c.getRadio() * 2, c.getRadio() * 2);
		wnd.anyadir(recDerecha);
		wnd.anyadir(recDebajo);
	}
	
	private static Circulo crearCirculoAleatorio()
	{
		final int RDESDE = 20, RHASTA = 100, XDESDE = 120, XHASTA = 450, YDESDE = 120, YHASTA = 350;
		
		Random r = new Random();
		int radio = RDESDE + r.nextInt(RHASTA - RDESDE + 1);
		int x = XDESDE + r.nextInt(XHASTA - XDESDE + 1);
		int y = YDESDE + r.nextInt(YHASTA - YDESDE + 1);
		
		return new Circulo(Figura.VERDE, x, y, radio);
	}
}
