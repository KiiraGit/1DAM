import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int N = tec.nextInt();
		tec.nextLine();
		List<String> coches = new ArrayList<>();
		
		for (int i = 0; i < N; i++)
		{
			StringBuilder coche = new StringBuilder();
//			coche.append("-" + tec.nextLine());
			String name = tec.nextLine();
//			coche.append(tec.nextLine());
			int x1 = tec.nextInt();
			int x2 = tec.nextInt();
			int y1 = tec.nextInt();
			int y2 = tec.nextInt();
			tec.nextLine();
			int distancia = (int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			coche.append(distancia);
			coche.append("-");
			coche.append(name);
			coches.add(coche.toString());
		}
		Collections.reverse(coches);
		for (String coche : coches)
		{
			System.out.println(coche.substring(coche.lastIndexOf("-")+1));
		}
	}

}
