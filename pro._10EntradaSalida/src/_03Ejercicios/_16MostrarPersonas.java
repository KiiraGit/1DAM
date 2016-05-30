package _03Ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _16MostrarPersonas {
	public static void main(String[] args) {
		try(DataInputStream f = new DataInputStream(new FileInputStream("personas.dat"))){
			//se producira una exepcion al terminar
			while(true){
				String nombre=f.readUTF();
				int edad = f.readInt();
				double peso=f.readDouble();
				double estatura = f.readDouble();
				
				System.out.println(nombre+" - "+edad+" - "+peso+" - "+estatura);
			}
		}catch (EOFException e){
			
		}catch (FileNotFoundException e){
			System.out.println("No se encuentra el fichero");
		}catch (IOException e){
			System.out.println("error al leer o cerrar fichero");
		
			
		}
		}
}
