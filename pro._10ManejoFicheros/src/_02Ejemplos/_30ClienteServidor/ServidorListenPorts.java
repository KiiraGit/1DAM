package _02Ejemplos._30ClienteServidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorListenPorts extends Thread{
	private int PUERTO;
	ServerSocket skServidor;
	String logFile;

	public ServidorListenPorts(int puerto) {
		try {
			PUERTO = puerto;
			skServidor = new ServerSocket(puerto);
			System.out.println("Servidor: escuchando en el puerto " + puerto);
			
//			DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream());
//			DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream());

//			BufferedReader br = new BufferedReader(new InputStreamReader(skCliente.getInputStream()));
//			
//			while (br.ready())
//			{
//				System.out.println(br.readLine());
//			}
			
			// Completar …
			
//			int num1 = flujoEnt.readInt();
//			int num2 = flujoEnt.readInt();
//			
//			flujoSal.writeInt(num1 + num2);
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
	
	public void run()
	{
		try {
			Socket skCliente = skServidor.accept();
			System.out.println("Hola en el puerto " + PUERTO);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}