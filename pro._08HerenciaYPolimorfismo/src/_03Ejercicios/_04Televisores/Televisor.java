package _03Ejercicios._04Televisores;

public abstract class Televisor implements Comparable<Televisor>
{
	private String marca;
	private String modelo;
	private double precio;
	private double pulgadas;
	
	public Televisor(String ma, String mo, double pr, double pu)
	{
		marca = ma;
		modelo = mo;
		precio = pr;
		pulgadas = pu;
	}
	
	public boolean equals(Object o)
	{
		if (this == o) return true;
		Televisor t = (Televisor)o;
		if (t.marca.equals(marca) && t.modelo.equals(modelo)) return true;
		else return false;
	}

	@Override
	public int compareTo(Televisor t) 
	{
		if (this == t) return 0;
		else if (t.marca.compareTo(marca) != 0){
			return t.marca.compareTo(marca);
		}
		else return t.modelo.compareTo(modelo);
	}
	
	public abstract String resolucion();
	
	public String toString()
	{
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio + 
				"\nPulgadas: " + pulgadas + "\nResolucion: " + resolucion();
	}
}
