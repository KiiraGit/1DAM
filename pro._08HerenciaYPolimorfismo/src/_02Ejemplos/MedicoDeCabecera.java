package _02Ejemplos;

public class MedicoDeCabecera extends Medico
{
	boolean visitaLasCasas;

	private String[] consejos = {"Suicidate", "Dale tiempo", "Vete de campamento", "Medico privado"
			, "Paracetamol y agua", "Drogas blandas", "Drogas duras", "DROGAS!"};
	
	
	String aconsejaPacientes()
	{
		int hint = (int)(Math.random() * consejos.length);
		return consejos[hint];
	}
	
	int tratarPaciente()
	{
		int success = (int)Math.round(Math.random());
		int sickness = (int)(Math.random() * enfermedades.length);
		if (success == 0)
		{
			System.out.println("El paciente ha muerto de " + enfermedades[sickness] + ".");
		}
		else
		{
			System.out.println("El paciente ha sobrevivido. Consejo del medico: " + aconsejaPacientes());
		}
		return success;
	}
}
