package _03Ejercicios._03MonedaYTimbre;

public abstract class Dinero implements Comparable<Dinero>
{
	private double valor;
	private int anyoEmision;
	
	public Dinero(double val, int anyo)
	{
		valor = val;
		anyoEmision = anyo;
	}
	
	public boolean equals(Object o)
	{
		if (this == o) return true;
		Dinero d = (Dinero)o;
		if (this.valor == d.valor && this.anyoEmision == d.anyoEmision) return true;
		else return false;
	}
	
	public int compareTo(Dinero d)
	{
		if (anyoEmision < d.anyoEmision) return -1;
		else if (anyoEmision > d.anyoEmision) return 1;
		else if (valor < d.valor) return -1;
		else if (valor > d.valor) return 1;
		else return 0;
	}
	
	public String toString()
	{
		return "Valor: " + valor + "\nAño: " + anyoEmision;
	}
}
