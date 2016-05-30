package _03Ejercicios._03MonedaYTimbre;

public class Billete extends Dinero 
{
	private double anchura, altura;
	
	public Billete(double val, int anyo, double ancho, double alto) 
	{
		super(val, anyo);
		anchura = ancho;
		altura = alto;
	}

	public String toString()
	{
		return "BILLETE\n" + super.toString() + "\nAnchura: " + anchura + "\nAltura: " + altura;
	}
}
