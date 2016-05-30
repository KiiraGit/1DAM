package _03Ejercicios._02Juegos;

public class JuegoEnVenta extends JuegoAlquilerVenta 
{

	public JuegoEnVenta(String t, String f, int a, int ncop, double p) 
	{
		super(t, f, a, ncop, p);
	}

	public void vender() throws Exception
	{
		if (this.ncopias > 0) this.ncopias--;
		else throw new Exception("No quedan copias para vender");
	}
}
