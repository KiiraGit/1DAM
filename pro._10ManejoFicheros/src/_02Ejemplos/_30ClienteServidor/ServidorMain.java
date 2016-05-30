package _02Ejemplos._30ClienteServidor;

public class ServidorMain 
{
	public static void main(String[] args) {
		for (int i = 1	; i < 100; i++)
		{
			ServidorListenPorts st = new ServidorListenPorts(i);
			st.start();
		}
	}

}
