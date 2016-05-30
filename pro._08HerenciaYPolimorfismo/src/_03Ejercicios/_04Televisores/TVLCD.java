package _03Ejercicios._04Televisores;

public class TVLCD extends Televisor 
{
	private int pixelsH;
	private int pixelsV;
	
	public TVLCD(String ma, String mo, double pr, double pu, int ph, int pv) {
		super(ma, mo, pr, pu);
		pixelsH = ph;
		pixelsV = pv;
	}

	@Override
	public String resolucion() 
	{
		return pixelsH + " x " + pixelsV;
	}

}
