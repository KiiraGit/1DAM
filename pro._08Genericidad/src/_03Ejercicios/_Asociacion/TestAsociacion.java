package _03Ejercicios._Asociacion;

import _03Ejercicios._01GestionEmpleados.Empleado;

public class TestAsociacion 
{

	public static void main(String[] args) 
	{
		Empleado e1 = new Empleado("juan", "11111", 1980, 3000);
		Empleado e2 = new Empleado("miguel", "22222", 1983, 2000);
		Empleado e3 = new Empleado("laura", "33333", 1985, 1000);
		
		Asociacion<Empleado, Empleado, Empleado, Empleado> a = new Asociacion<>(e1, e2, e3);
		a.addMiembro(new Empleado("sofia", "44444", 2000, 1500));
		System.out.println(a);
	}

}
