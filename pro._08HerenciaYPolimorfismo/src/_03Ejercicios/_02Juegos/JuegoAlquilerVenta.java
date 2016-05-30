package _03Ejercicios._02Juegos;

public abstract class JuegoAlquilerVenta extends Juego 
{
	protected int ncopias;
	protected double precio;

	public JuegoAlquilerVenta(String t, String f, int a, int ncop, double p) 
	{
		super(t, f, a);
		ncopias = ncop;
		precio = p;
	}
	
	public double getPrecio() 
	{
		return precio;
	}

	public int getNcopias() 
	{
		return ncopias;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder(super.toString());
		string.append("Precio: " + precio + "\n");
		string.append("Copias: " + ncopias + "\n");
		
		return string.toString();
	}
}
