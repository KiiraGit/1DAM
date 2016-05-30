package _03Ejercicios;

public class _09Tocayos 
{

	public static void main(String[] args) 
	{
		String[] grupo1 = {"miguel","josé","ana","maría"};
		String[] grupo2 = {"ana", "josé", "luján", "juan","josé", "pepa", "ángela", "sofía", "andrés", "bartolo"};
		
		int contTotal = 0;
		for (String persona : grupo1)
		{
			int i = 0;
			while (i < grupo2.length && !grupo2[i].equalsIgnoreCase(persona))
			{
				i++;
			}
			if (i < grupo2.length)
			{
				System.out.println(persona + " tiene un tocayo en el grupo 2");
				contTotal++;
			}
		}
		System.out.println(contTotal + " personas tienen tocayos en el grupo 2");
	}

}
