import java.util.Scanner;

public class B {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int regs = tec.nextInt();

		int[][] matriz = new int[regs][5];
		for (int i = 0; i < regs; i++){
			for (int j = 0; j < 5; j++)
			{
				matriz[i][j] = tec.nextInt();
			}
		}
		boolean error = false;
		for (int i = 0; i < regs && !error; i++)
		{
			for (int j = i+1; j < regs; j++)
			{
				if (matriz[j][1] == matriz[i][1] && matriz[j][2] == matriz[i][2])
				{
					if (matriz[j][4] >= matriz[i][3] && matriz[j][3] <= matriz[i][4])
					{
						error = true;
					}
				}
			}
		}
		System.out.println(error?"ERROR":"OK");
	}

}
