package coordenadas;

public class Coordenadas 
{
	//	Practica 1
	public static double toDecimal(int deg, int min, double sec)
	{
		return deg + (min * (1/60.0)) + (sec * (1/3600.0));
	}
	
	public static double harvesine(double lat1, double lon1, double lat2, double lon2)
	{
		final int r = 6371;
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);
		double d = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin(((lat2 - lat1)/2.0)), 2.0) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin((lon2-lon1) / 2.0), 2.0)));
		/*double d = Math.sin((lon2-lon1)/2.0);
		d = Math.pow(d, 2.0);
		d*= Math.cos(lat2);
		d*= Math.cos(lat1);
		d+= Math.pow(Math.sin((lat2 - lat1) / 2.0), 2.0);
		d = Math.sqrt(d);
		d = Math.asin(d);
		d = 2 * r * d;*/
		return d;
	}
	
	public static double pitagoras(double alt1, double alt2, double dist)
	{
		return Math.sqrt(Math.pow(alt1-alt2, 2.0) + Math.pow(dist, 2.0));
	}
	
	public static double gpsDist(double lat1, double lon1, double alt1, double lat2, double lon2, double alt2)
	{
		return pitagoras(alt1, alt2, harvesine(lat1, lon1, lat2, lon2));
	}
	
	//	Practica 2
	public static float sexagesimalToDecimal(String coordenada)
	{
		int gg, mm;
		double ss;
		float decimal = 0;
		
		int gPos, mPos, sPos;
		gPos = coordenada.indexOf('º');
		mPos = coordenada.indexOf('\'');
		sPos = coordenada.indexOf('"');
		
		gg = Integer.valueOf(coordenada.substring(0, gPos));
		mm = Integer.valueOf(coordenada.substring(gPos + 1, mPos));
		ss = Double.valueOf(coordenada.substring(mPos + 1, sPos));
		
		switch (coordenada.charAt(coordenada.length() - 1))
		{
			case 'N':
			case 'E':
				decimal = (float) toDecimal(gg, mm, ss);
				break;
			case 'S':
			case 'O':
				decimal = (float) -toDecimal(gg, mm, ss);
				break;
		}
		return decimal;
	}
}
