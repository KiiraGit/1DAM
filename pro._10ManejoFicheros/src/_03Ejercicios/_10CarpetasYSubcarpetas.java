package _03Ejercicios;

import java.io.File;

import javax.swing.JFileChooser;

public class _10CarpetasYSubcarpetas 
{

	public static void main(String[] args) 
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);
		
		File file = chooser.getSelectedFile();
		
		long total = getTamanyoTotal(file);
		System.out.println("EL TAMAÑO TOTAL ES: " + total);
	}

	public static long getTamanyoTotal(File root)
	{
		long total = 0;
		int fallos = 0;
		
		for (File file : root.listFiles())
		{
			if (file.canRead() && file.canWrite())
			{
				if (file.isFile()) total += file.length();
				else
				{
					total += getTamanyoTotal(file);
				}
			}
			else fallos++;
		}
		System.out.println(fallos + " errores de archivos y/o carpetas");
		return total;
	}
}
