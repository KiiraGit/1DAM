package distancia;

import coordenadas.Coordenadas;
import java.util.*;

public class Distancia 
{
	public static void main(String[] args) 
	{
		if (args.length == 0 || args.length == 6)
		{
			String latStr1, lonStr1, latStr2, lonStr2;
			double alt1, alt2;
			
			if (args.length == 0)
			{
				Scanner tec = new Scanner(System.in).useLocale(Locale.US);
				
				//	Datos de la coordenada 1
				System.out.println("Coordenada 1:");
				//	Latitud
				System.out.println("  Latitud:");
				latStr1 = tec.next();
				//	Longitud
				System.out.println("  Longitud:");
				lonStr1 = tec.next();
				//	Altitud
				System.out.print("  Altitud: ");
				alt1 = tec.nextDouble();
				
				//	Datos de la coordenada 2
				System.out.println("Coordenada 2:");
				//	Latitud
				System.out.println("  Latitud:");
				latStr2 = tec.next();
				//	Longitud
				System.out.println("  Longitud:");
				lonStr2 = tec.next();
				//	Altitud
				System.out.print("  Altitud: ");
				alt2 = tec.nextDouble();
			}
			else
			{
				latStr1 = args[0];
				lonStr1 = args[1];
				alt1 = Double.valueOf(args[2]);
				
				latStr2 = args[3];
				lonStr2 = args[4];
				alt2 = Double.valueOf(args[5]);
			}
			
			//	Transformacion de los datos
			float lat1 = Coordenadas.sexagesimalToDecimal(latStr1);
			float lon1 = Coordenadas.sexagesimalToDecimal(lonStr1);
			
			float lat2 = Coordenadas.sexagesimalToDecimal(latStr2);
			float lon2 = Coordenadas.sexagesimalToDecimal(lonStr2);
			
			// Inicio de los calculos
			System.out.println("Distancia sin tener en cuenta la altitud (m): " + Coordenadas.harvesine(lat1, lon1, lat2, lon2) * 1000);
			System.out.println("Distancia teniendo en cuenta la altitud (m): " + Coordenadas.gpsDist(lat1, lon1, alt1, lat2, lon2, alt2) * 1000);
			System.out.println("Diferencia de altitud entre los puntos (m): " + Math.abs(alt1 - alt2) * 1000);
			System.out.println("Diferencia de latitud (m): " + Coordenadas.harvesine(lat1, 1, lat2, 1) * 1000);
			System.out.println("Diferencia de longitud (m): " + Coordenadas.harvesine(1, lon1, 1, lon2) * 1000);
		}
		else 
		{
			System.out.println("Los datos proporcionados al programa son incorrectos");
			System.out.println("Uso: Distancia lat1 long1 alt1 lat2 long2 alt2");
		}
		
	}
}
