package _03Ejercicios._10ListaAdmitidos;

public class Inscripcion implements Comparable<Inscripcion>{
	private String nif;
	private String nombre;
	private String nivel;
	
	public Inscripcion(String nif,String nombre, String nivel){
		this.nif = nif;
		this.nombre = nombre;
		this.nivel = nivel;
	}
	
	public int compareTo(Inscripcion ins){
		if(this.nif.compareTo(ins.nif)< 0) return -1;
		else if(this.nif.compareTo(ins.nif)> 0) return 1;
		else return 0;
	}
	
	public String toString(){
		return "NIF: " + nif 
				+" Nombre: " + nombre 
				+" Nivel: " + nivel  + "\n"
				+"------------------------\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Inscripcion)) return false;
		Inscripcion ins = (Inscripcion) o;
		return this.nif.equals(ins.nif);
	}
}
