package _02Ejemplos.clasegenerica;

public class TestPareja 
{

	public static void main(String[] args) 
	{
		Pareja<String> p1 = new Pareja<String>("vaca", "baca");
		System.out.println(p1.toString());
		
		//	Error de compilacion
//		Pareja<String> p2 = new Pareja<>("vaca", new Integer(2));
//		System.out.println(p2);
		
	}

}
