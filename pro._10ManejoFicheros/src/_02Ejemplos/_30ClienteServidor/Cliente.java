package _02Ejemplos._30ClienteServidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	final static String HOST = "192.168.4.38";
	final static int PUERTO = 5000;

	public Cliente() {
		Scanner tec = new Scanner(System.in);
		boolean terminar = false;
		while (!terminar) {
			try {
				System.out.println("Cliente: Esperando conexión con el servidor");
				Socket skCliente = new Socket(HOST, PUERTO);
				DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream());
				DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream());
				// Completar
				System.out.println("Numero 1");
				int num1 = tec.nextInt();
				System.out.println("Numero 2");
				int num2 = tec.nextInt();
				
				flujoSal.writeLong(99999999);
				flujoSal.writeInt(num1);
				flujoSal.writeInt(num2);
				
				int result = flujoEnt.readInt();

				skCliente.close();
				terminar = true;
			} catch (ConnectException ex) {
				try {
					Thread.currentThread().sleep(300);
				} catch (InterruptedException ie) {
					System.out.println(ie);
				}
			} catch (IOException ex) {
				System.out.println(ex);
				terminar = true;
			}
		}
	}

	public static void main(String[] args) {
		new Cliente();
	}	
}