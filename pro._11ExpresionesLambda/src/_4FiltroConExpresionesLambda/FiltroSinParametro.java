package _4FiltroConExpresionesLambda;

import personas.Persona;

public interface FiltroSinParametro
{
	/**
	 * Devuelve true si la persona cumple el filtro deseado y false en caso contrario
	 * @param p La persona que se va a evaluar
	 * @return
	 */
	boolean filtrar(Persona p);
}
