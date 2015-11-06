package _03Ejercicios;

import pizarra.Pizarra;
import figuras.*;

public class _03MitadYMitad 
{
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra();
		Rectangulo rI = new Rectangulo(0, 0, 0, p.getAnchura()/2, p.getAltura());
		Rectangulo rD = new Rectangulo(2, p.getAnchura()/2, 0, p.getAnchura()/2, p.getAltura());
		p.anyadir(rI);
		p.anyadir(rD);
	}

}
