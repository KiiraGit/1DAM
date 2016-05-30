package _02SegundaEvaluacionPractico;

public class _04Modelo 
{
	private String nombre;
	private int anyo;
	private int emisiones;
	
	public _04Modelo(String nombre, int anyo, int emisiones)
	{
		this.nombre = nombre;
		this.anyo = anyo;
		this.emisiones = emisiones;
	}
	
	public boolean equals(Object o)
	{
		if (o instanceof _04Modelo)
		{
			return this.nombre.equals(((_04Modelo) o).nombre) && this.anyo == ((_04Modelo)o).anyo;
		} else return false;
	}
	
	public int getEmisiones()
	{
		return emisiones;
	}
	
	public int getAnyo()
	{
		return anyo;
	}
	
	public String toString()
	{
		return String.format("Nombre: %s Anyo: %d Emisiones: %d", nombre, anyo, emisiones);
	}
	
	public boolean aptoPlanPIVE()
	{
		return anyo >= 2012 && !(emisiones > 160);
	}
	
	public static double tasaPorEmisiones(int emisiones)
	{
		if (emisiones <= 100) return 10;
		else if (emisiones <= 200) return 15;
		else return 20;
	}
}
