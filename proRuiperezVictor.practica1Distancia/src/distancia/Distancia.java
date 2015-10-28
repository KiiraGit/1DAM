package distancia;

import coordenadas.Coordenadas;
import java.util.*;

public class Distancia 
{
	public static void main(String[] args) 
	{
//		System.out.println(Coordenadas.toDecimal(12, 15, 23.5));
//		System.out.println(Coordenadas.harvesine(10.16944444, 10.16944444, 11.18638889, 11.18638889));
//		System.out.println(Coordenadas.pitagoras(10, 11, 158.5382769));
//		System.out.println(Coordenadas.gpsDist(10.16944444, 10.16944444, 10, 11.18638889, 11.18638889, 11));
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		//	Datos de la coordenada 1
		System.out.println("Coordenada 1:");
		
		//	Latitud
		System.out.println("  Latitud:");
		System.out.print("    Horas: ");
		short latHora1 = tec.nextShort();
		System.out.print("    Minutos: ");
		byte latMin1 = tec.nextByte();
		System.out.print("    Segundos: ");
		float latSeg1 = tec.nextFloat();
		
		//	Longitud
		System.out.println("  Longitud:");
		System.out.print("    Horas: ");
		short lonHora1 = tec.nextShort();
		System.out.print("    Minutos: ");
		byte lonMin1 = tec.nextByte();
		System.out.print("    Segundos: ");
		float lonSeg1 = tec.nextFloat();
		
		//	Altitud
		System.out.print("  Altitud: ");
		float alt1 = tec.nextFloat();
		
		//	Datos de la coordenada 2
		System.out.println("Coordenada 2:");
		
		//	Latitud
		System.out.println("  Latitud:");
		System.out.print("    Horas: ");
		short latHora2 = tec.nextShort();
		System.out.print("    Minutos: ");
		byte latMin2 = tec.nextByte();
		System.out.print("    Segundos: ");
		float latSeg2 = tec.nextFloat();
		
		//	Longitud
		System.out.println("  Longitud:");
		System.out.print("    Horas: ");
		short lonHora2 = tec.nextShort();
		System.out.print("    Minutos: ");
		byte lonMin2 = tec.nextByte();
		System.out.print("    Segundos: ");
		float lonSeg2 = tec.nextFloat();
		
		//	Altitud
		System.out.print("  Altitud: ");
		float alt2 = tec.nextFloat();
		
		//	Transformación de los datos
		double lat1 = Coordenadas.toDecimal(latHora1, latMin1, latSeg1);
		double lon1 = Coordenadas.toDecimal(lonHora1, lonMin1, lonSeg1);
		
		double lat2 = Coordenadas.toDecimal(latHora2, latMin2, latSeg2);
		double lon2 = Coordenadas.toDecimal(lonHora2, lonMin2, lonSeg2);
		
		// Inicio de los cálculos
		System.out.println("Distancia sin tener en cuenta la altitud (m): " + Coordenadas.harvesine(lat1, lon1, lat2, lon2) * 1000);
		System.out.println("Distancia teniendo en cuenta la altitud (m): " + Coordenadas.gpsDist(lat1, lon1, alt1, lat2, lon2, alt2) * 1000);
		System.out.println("Diferencia de altitud entre los puntos (m): " + Math.abs(alt1 - alt2) * 1000);
	}
}
