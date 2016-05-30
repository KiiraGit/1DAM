package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _02Lluvias 
{

	public static void main(String[] args) 
	{
		double[] lluviasEnero = new double[31];
		try
		{
			leerArray(lluviasEnero, "lluviasenero.txt");
//			System.out.println(Arrays.toString(lluviasEnero));
			System.out.println("La suma de lluvias de los dias es " + suma(lluviasEnero));
			
			double busquedaPrimero = 19;
			double busquedaUltimo = 8;
			
			int pos19 = posPrimero(lluviasEnero, busquedaPrimero);
			int pos8 = posUltimo(lluviasEnero, busquedaUltimo);
			System.out.println(pos19 != -1?("El primer dia que llovio " + busquedaPrimero + " litros fue el dia " + (pos19+1)):"Ningun dia llovio " + busquedaPrimero + " litros");
			System.out.println(pos8 != -1?("El ultimo dia que llovio " + busquedaUltimo + " litros fue el dia " + (pos8+1)):"Ningun dia llovio " + busquedaUltimo + " litros");
		} catch (FileNotFoundException ex)
		{
			System.out.println("No se encuentra el archivo");
		} catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static void leerArray(double[] v, String nombreFichero) throws FileNotFoundException
	{
		File fichero = new File(nombreFichero);
		Scanner f = new Scanner(fichero).useLocale(Locale.US);
		for (int i = 0; i < v.length; i++)
		{
			v[i] = f.nextDouble();
		}
		f.close();
	}

	public static double suma(double[] v)
	{
		double suma = 0;
		for (int i = 0; i < v.length; i++)
		{
			suma += v[i];
		}
		return suma;
	}
	
	public static int posPrimero(double[] v, double x)
	{
		int pos = 0;
		
		while (pos < v.length && v[pos] != x)
		{
			pos++;
		}
		
		if (pos == v.length) return -1;
		else return pos;
	}
	
	public static int posUltimo(double[] v, double x)
	{
		int pos = v.length - 1;
		
		while (pos > -1 && v[pos] != x)
		{
			pos--;
		}
		return pos;
	}
}
