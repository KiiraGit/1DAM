package _02Ejemplos._30ClienteServidor;

import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorFichero 
{
	final static int PUERTO = 5000;
	
	public ServidorFichero() 
	{
		try {
			ServerSocket skServidor = new ServerSocket(PUERTO);
			System.out.println("Servidor: escuchando en el puerto " + PUERTO);
			Socket skCliente = skServidor.accept();
			System.out.println("Servidor: Sirviendo a un cliente");
			
			OutputStreamWriter flujoSal = new OutputStreamWriter(skCliente.getOutputStream());

			// Completar …
			
			try (FileReader f = new FileReader("minombre.txt"))
			{
				int caracter;
				while ((caracter = f.read()) != -1)
				{
					flujoSal.write(caracter);
					flujoSal.flush();
				}
			}
			
			skCliente.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args) 
	{
		new ServidorFichero();
	}

}
