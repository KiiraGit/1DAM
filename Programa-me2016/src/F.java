import java.util.Arrays;
import java.util.Scanner;

public class F 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int M = tec.nextInt();
		int N = tec.nextInt();
		tec.nextLine();
		
		String campo[] = new String[M+2];
		campo[0]="";
		campo[M+1] = "";
		for (int i = 1; i <= N+2; i++)
		{
			campo[0] = campo[0] + "." ;
			campo[M+1] = campo[M+1] + "." ;
		}
		for (int y = 1; y < M + 1; y++)
		{
			campo[y] = "." + tec.nextLine() + ".";
		}
		BuscarAdy(campo);
	}
	
	public static void BuscarAdy(String[] campo)
	{
		for (int i = 1; i < campo.length - 1; i++)
		{
			StringBuilder temp = new StringBuilder();
			for (int j = 1; j < campo[i].length()-1; j++)
			{
				if (campo[i].charAt(j) == '.')
				{
					
					int cont = 0;
					//Arriba
					if (campo[i-1].charAt(j-1) == '*') cont++;
					if (campo[i-1].charAt(j) == '*') cont++;
					if (campo[i-1].charAt(j+1) == '*') cont++;
					//Abajo
					if (campo[i+1].charAt(j-1) == '*') cont++;
					if (campo[i+1].charAt(j) == '*') cont++;
					if (campo[i+1].charAt(j+1) == '*') cont++;
					//Lados
					if (campo[i].charAt(j-1) == '*') cont++;
					if (campo[i].charAt(j+1) == '*') cont++;
					temp.append(cont);
				}
				else
				{
					temp.append("*");
				}
			}
			System.out.println(temp.toString());
		}
	}
	
}
