package _03Ejercicios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _15AnadirPersonas {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int edad;
		String nombre;
		double estatura,peso;
		System.out.println("sobreescribir fichero S/N?");
		boolean over=tec.nextLine().toUpperCase().charAt(0)=='N';
		try(DataOutputStream f = new DataOutputStream(new FileOutputStream("personas.dat",over))){
				
		do{
			System.out.println("Nombre: ");
			nombre=tec.nextLine();
			if(!nombre.equals("")){
				System.out.println("Edad: ");
				edad= tec.nextInt();
				System.out.println("Peso: ");
				peso= tec.nextDouble();	
				System.out.println("Estatura: ");
				estatura= tec.nextDouble();
				tec.nextLine();
				
				//Escribimos datos en fichero
				
				f.writeUTF(nombre);
				f.writeInt(edad);
				f.writeDouble(peso);
				f.writeDouble(estatura);
			}
		}while(!nombre.equals(""));
		}catch (FileNotFoundException e){
			System.out.println("No se encuentra el fichero");
		}catch (IOException e){
			System.out.println("error al leer o cerrar fichero");
		}
			
		}

}
