package _03TerceraEvaluacion._05FicherosYColecciones;

public class Alumno
{
	private int numExpediente;
	private String nombre;
	private String grupo;
	
	public Alumno(int num, String nom, String gr)
	{
		numExpediente = num;
		nombre = nom;
		grupo = gr;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public boolean equals(Alumno a)
	{
		if (this == a) return true;
		else if (numExpediente == a.numExpediente) return true;
		else return false;
	}
}
