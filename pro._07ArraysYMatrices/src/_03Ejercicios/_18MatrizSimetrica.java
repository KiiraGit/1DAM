package _03Ejercicios;

public class _18MatrizSimetrica 
{

	public static void main(String[] args) 
	{
		int[][] m = 
			{{1, 5, 3},
			{5, 8, 7},
			{3, 7, 5}};
		
		System.out.println(esSimetrica(m)?"Simetrica":"No simetrica");
	}

	public static boolean esSimetrica(int[][] m)
	{
		for (int x = 0; x < m.length; x++)
		{
			if (m[x].length != m.length) return false;
			for (int y = 0; y < x; y++)
			{
				if (m[x][y] != m[y][x]) return false;
			}
		}
		return true;
	}
}
