package _01PrimeraEvaluacionPractico;

import java.util.Scanner;

public class _01TarifaTelefonica 
{
	public static final byte consumoMin = 9;
	public static final double costeMinuto = 0.18;
	public static final double costeEstablecimiento = 0.15;
	public static final double costeSMS = 0.08;
	public static final byte ivaAplicado = 21;
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int numLlamadas, tiempoTotal, numSMS;
		double importe = 0;
		
		//	Entrada de datos
		System.out.print("Numero llamadas: ");
		numLlamadas = tec.nextInt();
		
		System.out.print("Tiempo: ");
		tiempoTotal = tec.nextInt();
		
		System.out.print("SMS: ");
		numSMS = tec.nextInt();
		
		//	Importe
		importe += numLlamadas * costeEstablecimiento;
		importe += tiempoTotal * costeMinuto;
		importe += numSMS * costeSMS;
		
		if (importe < consumoMin)
		{
			importe = consumoMin;
		}
		
		importe = calcularIVA(importe, ivaAplicado);
		
		System.out.println("Importe factura (" + ivaAplicado + "% iva incl.): " + importe);
	}
	
	public static double calcularIVA(double importe, byte iva)
	{
		importe *= 1 + (iva / 100.0);
		return importe;
	}

}
