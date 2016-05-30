package _02Ejemplos;

public class Perro extends Animal 
{

	public Perro(String n)
	{
		super(n);
	}

	@Override
	public String hacerRuido() 
	{
		return "Guau!";
	}
}
