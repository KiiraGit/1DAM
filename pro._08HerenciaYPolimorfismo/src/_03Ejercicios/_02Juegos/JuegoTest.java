package _03Ejercicios._02Juegos;

public class JuegoTest {

	public static void main(String[] args) 
	{
		JuegoEnAlquiler ja1=new JuegoEnAlquiler("aaa","bbb", 2000, 6,5, 2);
		JuegoEnAlquiler ja2=new JuegoEnAlquiler("ccc","ddd", 2002, 6,5, 2);
		JuegoEnAlquiler ja3=new JuegoEnAlquiler("ggg","hhh", 2007, 6,5, 2);
		
		JuegoEnVenta jv1=new JuegoEnVenta("eeee", "aaa", 2012, 6, 60);
		JuegoEnVenta jv2=new JuegoEnVenta("hhhh", "aaa", 2013, 6, 60);
		JuegoEnVenta jv3=new JuegoEnVenta("nnnn", "aaa", 2014, 6, 60);
		
		
		//array para almacenar juegos en alquiler
		JuegoEnAlquiler ja[]={ja1,ja2,ja3};
		//array para almacenar juegos en venta
		JuegoEnVenta jv[]={jv1,jv2,jv3};
		//array para almacenar todos los juegos: POLIMORFISMO!!
		Juego j[]={ja1,ja2,ja3,jv1,jv2,jv3};
		
		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
			System.out.println("----------");
		}
	}

}
