package _03Ejercicios._03MonedaYTimbre;

public class Moneda extends Dinero 
{
	private double diametro;
	private double peso;

	public Moneda(double val, int anyo, double diam, double p) 
	{
		super(val, anyo);
		diametro = diam;
		peso = p;
	}

	public String toString()
	{
		return "MONEDA\n" + super.toString() + "\nDiametro: " + diametro + "\nPeso: " + peso;
	}
}
