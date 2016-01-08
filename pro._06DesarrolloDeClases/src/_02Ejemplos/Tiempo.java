package _02Ejemplos;

public class Tiempo 
{
	private int hora;
	private int minutos;
	private int segundos;
	
	//	Constructores
	public Tiempo()
	{
		this(0, 0, 0);
	}

	public Tiempo(int hora)
	{
		this(hora, 0, 0);
	}
	
	public Tiempo(int hora, int minutos)
	{
		this(hora, minutos, 0);
	}
	
	public Tiempo(int hora, int minutos, int segundos)
	{
		setHora(hora);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	public Tiempo(String tiempo)
	{
		setHora(Integer.parseInt(tiempo.substring(0, tiempo.indexOf(':'))));
		setMinutos(Integer.parseInt(tiempo.substring(tiempo.indexOf(':') + 1, tiempo.lastIndexOf(':'))));
		setSegundos(Integer.parseInt(tiempo.substring(tiempo.lastIndexOf(':') + 1)));
	}
	
	//	Getters
	public int getHora()
	{
		return this.hora;
	}
	public int getMinutos()
	{
		return this.minutos;
	}
	public int getSegundos()
	{
		return this.segundos;
	}
	
	//	Setters
	public boolean setHora(int hora)
	{
		if (hora >= 0 && hora < 24)
		{
			this.hora = hora;
			return true;
		}
		else return false;
	}
	public boolean setMinutos(int minutos)
	{
		if (minutos >= 0 && minutos < 60)
		{
			this.minutos = minutos;
			return true;
		}
		else return false;
	}
	public boolean setSegundos(int segundos)
	{
		if (segundos >= 0 && segundos < 60)
		{
			this.segundos = segundos;
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString()
	{
		return String.format("%02d:%02d:%02d" ,hora, minutos, segundos);
	}
}