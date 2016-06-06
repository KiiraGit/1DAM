package personas;

public class Persona 
{
	private String nombre;
	private int edad;
	private double peso;
	private double estatura;
	
	public Persona(String nombre, int edad, double peso, double estatura)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	@Override
	public String toString()
	{
		StringBuilder string = new StringBuilder();
		string.append("Nombre: " + nombre);
		string.append("\nEdad: " + edad);
		string.append("\nPeso: " + peso);
		string.append("\nEstatura: " + estatura);
		
		return string.toString();
	}
}
