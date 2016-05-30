package _03Ejercicios._Asociacion;

import java.util.Arrays;

public class Asociacion <P, T, S, N>
{
	private final int MAXMIEMBROS = 50;
	private P presidente;
	private T tesorero;
	private S secretario;
	private N[] numMiembros;
	private int numActual;
	
	public Asociacion(P p, T t, S s)
	{
		presidente = p;
		tesorero = t;
		secretario = s;
		numMiembros = (N[])new Object[MAXMIEMBROS];
		numActual = 0;
	}

	public P getPresidente() {
		return presidente;
	}

	public void setPresidente(P presidente) {
		this.presidente = presidente;
	}

	public T getTesorero() {
		return tesorero;
	}

	public void setTesorero(T tesorero) {
		this.tesorero = tesorero;
	}

	public S getSecretario() {
		return secretario;
	}

	public void setSecretario(S secretario) {
		this.secretario = secretario;
	}

	public N[] getNumMiembros() {
		return numMiembros;
	}

	public void setNumMiembros(N[] numMiembros) {
		this.numMiembros = numMiembros;
	}
	
	public void addMiembro(N miembro)
	{
		if (numActual < numMiembros.length)
		{
			numMiembros[numActual] = miembro;
			numActual++;
		}else 
		{
			//	Duplicamos la capacidad del array
			N[] aux = (N[]) new Object[numMiembros.length * 2];
			int i;
			for (i = 0; i < numMiembros.length; i++)
			{
				aux[i] = numMiembros[i];
			}
			numMiembros = aux;
			numMiembros[++i] = miembro;
			numActual++;
		}
	}
	
	public N popMiembro(N miembro) throws Exception
	{
		int i = 0;
		for (;i < numMiembros.length && !numMiembros[i].equals(miembro); i++)
		{
			
		}
		if (i == numMiembros.length) throw new Exception("Elemento no encontrado");
		else
		{
			N toReturn = numMiembros[i];
			for (; i < numMiembros.length - 1; i++)
			{
				numMiembros[i] = numMiembros[i + 1];
			}
			numActual--;
			return toReturn;
		}
	}
	public N popMiembro(int pos) throws Exception
	{
		if (pos > numActual) throw new Exception("Indice fuera del array");
		N toReturn = numMiembros[pos];
		for (; pos < numMiembros.length - 1; pos++)
		{
			numMiembros[pos] = numMiembros[pos + 1];
		}
		numActual--;
		return toReturn;
	}
	
	public N getMiembro(int pos) throws Exception
	{
		if (pos > numActual)
		{
			throw new Exception("Error, actualmente hay " + numActual + " miembros");
		}
		else return numMiembros[pos];
	}
	
	public String toString()
	{
		StringBuilder miembros = new StringBuilder();
		for (int i = 0; i < numMiembros.length && numMiembros[i] != null; i++)
		{
			miembros.append("\nMiembro " + (i + 1) + ": " + numMiembros[i]);
		}
		return "Presidente: " + presidente + "\n" + 
				"Tesorero: " + tesorero + "\n" + 
				"Secretario: " + secretario + "\n\n" + 
				"Miembros: " + numActual + 
				miembros.toString();
	}
}
