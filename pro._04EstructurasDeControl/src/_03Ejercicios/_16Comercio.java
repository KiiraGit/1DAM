package _03Ejercicios;

import java.util.Scanner;

public class _16Comercio 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		float importe, descuento;
		
		System.out.print("Introduce el importe de tu compra: ");
		importe = tec.nextFloat();
		
		System.out.println("Importe de la compra: " + importe + "€");
		System.out.println("Porcentaje de descuento aplicado: 8%");
		descuento = (float) (importe * 0.08);
		if (descuento > 12) descuento = 12;
		System.out.println("Descuento aplicado: " + descuento + "€");
		importe -= descuento;
		System.out.println("Cantidad a pagar: " + importe + "€");
	}

}
