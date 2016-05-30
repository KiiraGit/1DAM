package _03Ejercicios;

import java.io.File;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFileChooser;

public class _04MostrarTamanyoArchivos 
{

	public static void main(String[] args) 
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);
		
		File file = chooser.getSelectedFile();
		HashMap<String, Long> files = new HashMap<>();
		long totalSize = 0;
		
		for (File actual : file.listFiles())
		{
			if (actual.isFile())
			{
				files.put(actual.getName(), actual.length());
				totalSize += actual.length();
			}
		}
		
		System.out.println("NOMBRE\t\tTAMANYO");
		for (Entry<String, Long> actual : files.entrySet())
		{
			System.out.println(actual.getKey() + "\t" + actual.getValue());
		}
		System.out.println("TOTAL: " + totalSize);
	}

}
