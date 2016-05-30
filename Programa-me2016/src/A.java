import java.util.Scanner;

public class A 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int propuestas = tec.nextInt();
		
		int apro = 0;
		int unanim = 0;
		
		for (int i = 0; i < propuestas; i++)
		{
			int cont = 0;
			for (int j = 0; j < 5; j++)
			{
				if (tec.nextInt() == 1) cont++;
			}
			if (cont >= 3) apro++;
			if (cont == 5) unanim++;
		}
		
		System.out.println(apro);
		System.out.println(unanim);
	}

}
