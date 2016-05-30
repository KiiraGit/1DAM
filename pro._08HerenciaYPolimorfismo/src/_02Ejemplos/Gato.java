package _02Ejemplos;

public class Gato extends Animal 
{

	public Gato(String n)
	{
		super(n);
	}

	@Override
	public String hacerRuido() 
	{
		return "Miau";
	}
}
