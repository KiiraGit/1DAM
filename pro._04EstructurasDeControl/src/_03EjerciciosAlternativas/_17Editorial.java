package _03EjerciciosAlternativas;

import java.util.Locale;
import java.util.Scanner;

public class _17Editorial 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		int numRevistas, numLibros;
		double precioRevistas, precioLibros;
		System.out.print("Revistas para el pedido: ");
		numRevistas = tec.nextInt();
		System.out.print("Precio revistas: ");
		precioRevistas = tec.nextDouble();
		System.out.print("Libros para el pedido: ");
		numLibros = tec.nextInt();
		System.out.print("Precio libros: ");
		precioLibros= tec.nextDouble();
		
		System.out.println("Coste Revistas: " +  calcularCoste("revista", precioRevistas, numRevistas) + ", Coste Libros: " + calcularCoste("libro", precioLibros, numLibros));
		
	}
	
	public static double calcularCoste(String tipo, double precio, int num)
	{
		precio *= num;
		if (tipo == "libro")
		{
			if (num > 20) precio *= 0.8;
			else if (num >= 11) precio *= 0.85;
			else if (num > 5) precio *= 0.9;
		}
		else if (tipo == "revista")
		{
			if (num > 20) precio *= 0.75;
			else if (num > 11) precio *= 0.8;
			else if (num > 5) precio *= 0.85;
		}
		return precio;
	}

}
