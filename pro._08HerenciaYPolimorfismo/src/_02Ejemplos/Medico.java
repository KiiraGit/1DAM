package _02Ejemplos;

public class Medico 
{
	private boolean trabajaEnElHospital;
	
	protected String[] enfermedades = {"Viruela", "Sida", "Cáncer", "Fiebre", "Accidente médico", "Sobredosis",
			"Ataque de gato venenoso", "Vecina inquieta", "Cuñado imbecil", "Aburrimiento"};
	
	int tratarPaciente()
	{
		int success = (int)Math.round(Math.random());
		int sickness = (int)(Math.random() * enfermedades.length);
		System.out.println(success == 0?"El paciente ha muerto de " + enfermedades[sickness] + ".":"El paciente ha sobrevivido.");
		return success;
	}
}
