package _02SegundaEvaluacionPractico;

import _02SegundaEvaluacionPractico._04CatalogoExcepciones.CatalogoLlenoException;

public class _04Catalogo 
{
	private final int MAXC = 50;
	private _04Modelo[] lista;
	private int numModelos;
	
	public _04Catalogo()
	{
		lista = new _04Modelo[MAXC];
		numModelos = 0;
	}
	
	public void anyadir(_04Modelo m) throws CatalogoLlenoException
	{
		if (numModelos == lista.length) throw new CatalogoLlenoException();
		int i;
		for (i = 0; i < numModelos && !lista[i].equals(m); i++)
		{
		}
		lista[i] = m;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder();
		
		for (int i = 0; i < numModelos; i++)
		{
			string.append(lista[i].toString());
			string.append(lista[i].aptoPlanPIVE()?"APTO":"NO APTO");
			string.append("Tasa " + _04Modelo.tasaPorEmisiones(lista[i].getEmisiones()) + " €");
			string.append("\n");
		}
		
		return string.toString();
	}
	
	public int numModelosDelAnyo(int x)
	{
		int cont = 0;
		for (int i = 0; i < numModelos; i++)
		{
			if (lista[i].getAnyo() == x) cont++;
		}
		return cont;
	}
}
