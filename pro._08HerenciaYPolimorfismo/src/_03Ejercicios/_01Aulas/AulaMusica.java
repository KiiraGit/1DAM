package _03Ejercicios._01Aulas;

public class AulaMusica extends Aula
{

	private boolean piano;
	
	public AulaMusica(int cod, int lon, int alt, boolean hPiano) 
	{
		super(cod, lon, alt);
		piano = hPiano;
	}
	
	public final boolean hasPiano()
	{
		return piano;
	}
	
	public void setPiano(boolean hPiano)
	{
		piano = hPiano;
	}
	
	@Override
	public String toString()
	{
		return ("Aula de Música " + super.toString());
	}
}
