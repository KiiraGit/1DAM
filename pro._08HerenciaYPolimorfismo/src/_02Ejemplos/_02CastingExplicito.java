package _02Ejemplos;

public class _02CastingExplicito {

	public static void main(String[] args) 
	{
		//	Implicito
		Cirujano c = new Cirujano();
		Medico m = c;
		
		//	Explicito
//		Medico m2 = new Medico();
//		Cirujano c2 = (Cirujano)m2; //	No funciona
		
		//	Explicito
		Medico m3 = new Cirujano();
		Cirujano c3 = (Cirujano)m3;
	}

}
