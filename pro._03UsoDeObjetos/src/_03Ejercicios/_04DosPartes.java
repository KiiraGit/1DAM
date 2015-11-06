package _03Ejercicios;

import pizarra.Pizarra;
import figuras.Rectangulo;

public class _04DosPartes 
{
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra();
		Rectangulo r1 = new Rectangulo(0, 0, 0, p.getAnchura(), (int)(p.getAltura()*0.25));
		Rectangulo r2 = new Rectangulo(2, 0, (int)(p.getAltura()*0.25), p.getAnchura(), (int)(p.getAltura()*0.75));
		p.anyadir(r1);
		p.anyadir(r2);
	}
}
