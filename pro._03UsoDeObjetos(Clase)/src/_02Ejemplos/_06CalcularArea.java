package _02Ejemplos;

import java.util.Scanner;
import figuras.Circulo;

public class _06CalcularArea 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce radio del circulo: ");
		double radio = tec.nextDouble();
		double area = Circulo.area(radio);
		System.out.println("El area es: " + area);
	}
}
