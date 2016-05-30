package _03Ejercicios._04JuegoCartas;

public class Carta 
{
	public static final int OROS = 0, COPAS = 1, ESPADAS = 2, BASTOS = 3;
	
	private int palo;
	private int valor;
	
	public Carta(int palo, int valor)
	{
		if (palo < 0 || palo > 3 || valor < 1 || valor > 12)
			throw new IllegalArgumentException();
		else
		{
			this.setPalo(palo);
			this.setValor(valor);
		}
	}
	
	public Carta()
	{
		this((int)Math.random() * 4, (int)(Math.random() * 12)+ 1);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}
	
	public int compareTo(Object o)
	{
		Carta c = (Carta)o;
		
		if (this.palo > c.palo)
			return 1;
		else if (this.palo < c.palo)
			return -1;
		else
		{
			if (this.valor > c.valor) return 1;
			else if (this.valor < c.valor) return -1;
			else return 0;
		}
	}
	
	public boolean equals(Object o)
	{
		if (o instanceof Carta)
		{
			Carta c = (Carta)o;
			return (this.palo == c.palo && this.valor == c.valor);
		}
		else return false;
	}
	
	public Carta sigPalo ()
	{
		int palo = this.palo + 1;
		if (palo > 3) palo = 0;
		Carta c = new Carta(palo, this.valor);
		return c;
	}
	
	public String toString()
	{
		String nombrePalo;
		
		switch (this.palo)
		{
			case 0:
				nombrePalo = "oros";
				break;
			case 1:
				nombrePalo = "copas";
				break;
			case 2:
				nombrePalo = "espadas";
				break;
			case 3:
				nombrePalo = "bastos";
				break;
			default:
				nombrePalo = "error";
		}
		
		return this.valor + " de " + nombrePalo;
	}
}
