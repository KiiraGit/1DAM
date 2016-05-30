package _03Ejercicios._06Conjuntos;

import java.util.Arrays;

import _03Ejercicios._06Conjuntos.Exceptions.*;

public class ConjuntoArray <T> implements Conjunto<T> 
{
	private static final int INIT_LENGHT = 10;
	private T[] conjunto;
	private int items;
	
	public ConjuntoArray() 
	{
		conjunto = (T[])new Object[INIT_LENGHT];
		items = 0;
	}
	
	public ConjuntoArray(int lenght)
	{
		conjunto = (T[])new Object[lenght];
		items = 0;
	}
	
	@Override
	public void anyadir(T e) throws ElementoDuplicado 
	{
		for (T el : conjunto)
		{
			if (el.equals(e)) throw new ElementoDuplicado();
		}
		if (items >= conjunto.length)
		{
			T[] aux = (T[])new Object[conjunto.length * 2];
			aux = Arrays.copyOfRange(conjunto, 0, conjunto.length);
			conjunto = aux;
		}
		conjunto[items] = e;
		items++;
	}

	@Override
	public void quitar(T e) throws ElementoNoEncontrado 
	{
		int i;
		for (i = 0; i < items && !conjunto[i].equals(e); i++)
		{
			
		}
		if (i == items) throw new ElementoNoEncontrado();
		for (; i < items - 1; i++)
		{
			conjunto[i] = conjunto[i+1];
		}
		items--;
	}

	@Override
	public Conjunto<T> interseccion(Conjunto<T> c) 
	{
		Conjunto<T> combinado = new ConjuntoArray<T>();
		for (T el : conjunto)
		{
			if (c.pertenece(el))
			{
				try 
				{
					combinado.anyadir(el);
				} catch (ElementoDuplicado e) 
				{
				}
			}
		}
		return combinado;
	}

	@Override
	public boolean pertenece(T e) 
	{
		int i;
		for (i = 0; i < items && !conjunto[i].equals(e); i++)
		{
			
		}
		if (i == items) return false;
		else return true;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder("Conjunto de " + items + " elementos");
		for (int i = 0; i < items; i++)
		{
			string.append("\nElemento " + (i + 1) + ": " + conjunto[i]);
		}
		return string.toString();
	}

}
