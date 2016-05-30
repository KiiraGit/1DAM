package _03Ejercicios;

public class _03Dados 
{
	public static final int LANZAMIENTOS = 100000;
	public static final int FRECUENCIA = 1000;
	
	public static void main(String[] args) 
	{
		int[] veces = new int[7];
		for (int i = 1; i <= LANZAMIENTOS; i++)
		{
			int temp = (int)(Math.random() * 6) + 1;
			veces[temp]++;
			if (i % FRECUENCIA == 0)
			{
				System.out.println("\nNumero de lanzamientos: " + i);
				for (int j = 1; j < veces.length; j++)
				{
					System.out.print(j + ": " + String.format("%.3f", ((float)veces[j] / i) * 100) + "%, ");
				}
				System.out.println();
			}
		}
	}
}