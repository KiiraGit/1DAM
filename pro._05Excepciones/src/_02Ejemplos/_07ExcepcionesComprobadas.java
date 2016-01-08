package _02Ejemplos;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _07ExcepcionesComprobadas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Scanner f = null;
		try{
			f = new Scanner(new File("datos.txt"));
			int a = f.nextInt();
			int b = f.nextInt();
			int c = f.nextInt();
			
			System.out.println("Media: " + (a+b+c) / 3.0 );
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("El fichero no existe");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}finally{
			if (f != null) f.close();
		}
		System.out.println("Fin");
		
	
	}

}
