package _02Ejemplos;

public abstract class Animal 
{
	private String nombre;
	
	public Animal(String n)
	{
		nombre = n;
	}
	
	public abstract String hacerRuido();
	public void saludar()
	{
		String raza = this.getClass().toString().substring(this.getClass().toString().indexOf(".") + 1);
		System.out.println("Hola me llamo " + nombre + ", soy un " + raza + " y hago " + hacerRuido());
	}
}
