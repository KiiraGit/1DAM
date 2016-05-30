package _03TerceraEvaluacion._05FicherosYColecciones;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class GestionFicheroAlumnos 
{

	public static void main(String[] args) 
	{
		List<Alumno> listaAlumnos = new LinkedList<>();
		
		DataInputStream br = null;
		try {
			br = new DataInputStream(new FileInputStream("alumnos.dat"));
			
			while (true)
			{
				int numExp = br.readInt();
				String nombre = br.readUTF();
				String grupo = br.readUTF();
				
				Alumno a = new Alumno(numExp, nombre, grupo);
				if (!listaAlumnos.contains(a)) listaAlumnos.add(0, a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (EOFException e)
		{
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("alumnos.txt"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		for (Alumno a : listaAlumnos)
		{
			System.out.println(a.getNumExpediente() + ", " + a.getNombre() + ", " + a.getGrupo());
			try {
				bw.write("" + a.getNumExpediente());
				bw.newLine();
				bw.write(a.getNombre());
				bw.newLine();
				bw.write(a.getGrupo());
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
