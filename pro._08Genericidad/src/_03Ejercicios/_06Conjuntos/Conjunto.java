package _03Ejercicios._06Conjuntos;

import _03Ejercicios._06Conjuntos.Exceptions.*;

public interface Conjunto <T>
{
	void anyadir(T e) throws ElementoDuplicado;
	void quitar(T e) throws ElementoNoEncontrado;
	Conjunto<T> interseccion(Conjunto<T> c);
	boolean pertenece(T e);
}
