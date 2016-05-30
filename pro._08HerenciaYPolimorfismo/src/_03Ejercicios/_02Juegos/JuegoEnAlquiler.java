package _03Ejercicios._02Juegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta 
{
	private int diasAlquiler;

	public JuegoEnAlquiler(String t, String f, int a, int ncop, double p, int dAlq) 
	{
		super(t, f, a, ncop, p);
		diasAlquiler = dAlq;
	}
	
	public int getDiasAlquiler()
	{
		return diasAlquiler;
	}

	public void alquilar() throws Exception
	{
		if (this.ncopias > 0) this.ncopias--;
		else throw new Exception("No quedan copias para alquilar");
	}
	
	public void devolver()
	{
		this.ncopias++;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder(super.toString());
		string.append("Dias alquiler: " + diasAlquiler + "\n");
		
		return string.toString();
	}
}
