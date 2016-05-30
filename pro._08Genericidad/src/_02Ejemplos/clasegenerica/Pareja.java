package _02Ejemplos.clasegenerica;

public class Pareja <T>
{
	private T miembro1;
	private T miembro2;
	
	public Pareja(T m1, T m2)
	{
		miembro1 = m1;
		miembro2 = m2;
	}
	
	public T getMiembro(int m) throws Exception
	{
		if (m == 1) return miembro1;
		else if (m == 2) return miembro2;
		else throw new Exception("Error, introduce miembro 1 o 2");
	}
	public void setMiembro(int pos, T m) throws Exception
	{
		if (pos == 1) miembro1 = m;
		else if (pos == 2) miembro2 = m;
		else throw new Exception("Error, introduce miembro 1 o 2");
	}
	@Override
	public String toString()
	{
		return "1: " + miembro1 + "\n" +
				"2: " + miembro2;
	}
}
