import java.util.Scanner;

public class D {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int M = tec.nextInt();
		int N = tec.nextInt();
		tec.nextLine();
		
		String[] tela = new String[M];
		for (int x = 0; x < N; x++)
		{
			tela[N] = tec.nextLine();
			System.out.println(tela[N]);
		}
	}

}
