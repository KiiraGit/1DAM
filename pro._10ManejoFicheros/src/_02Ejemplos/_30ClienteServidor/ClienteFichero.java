package _02Ejemplos._30ClienteServidor;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class ClienteFichero {

	final static String HOST = "localhost";
	final static int PUERTO = 5000;

	public ClienteFichero() {
		Scanner tec = new Scanner(System.in);
		boolean terminar = false;
		while (!terminar) {
			try {
				System.out.println("Cliente: Esperando conexión con el servidor");
				Socket skCliente = new Socket(HOST, PUERTO);

				InputStreamReader flujoEnt = new InputStreamReader(skCliente.getInputStream());

				// Completar …
				int num;
				while ((num = flujoEnt.read()) != -1)
				{
					System.out.print((char)num);
				}
				
				skCliente.close();
				terminar = true;
			} catch (ConnectException ex) {
				
			} catch (IOException ex) {
				System.out.println(ex);
				terminar = true;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new ClienteFichero();
	}

}
