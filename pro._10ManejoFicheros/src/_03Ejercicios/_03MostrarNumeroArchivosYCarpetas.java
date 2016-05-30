package _03Ejercicios;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

public class _03MostrarNumeroArchivosYCarpetas 
{

	public static void main(String[] args) 
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);
		
		File file = chooser.getSelectedFile();
		List<String> files = new ArrayList<>();
		List<String> dirs = new ArrayList<>();
		int contTotal = 0;
		
		for (File child : file.listFiles())
		{
			contTotal++;
			if (child.isDirectory()) dirs.add(child.getName());
			else files.add(child.getName());
		}
		System.out.println("TOTAL: " + contTotal);
		System.out.println("ARCHIVOS: " + files.size());
		for (String actual : files)
		{
			System.out.println("\t" + actual);
		}
		System.out.println("DIRECTORIOS: " + dirs.size());
		for (String actual : dirs)
		{
			System.out.println("\t" + actual);
		}
	}

}
