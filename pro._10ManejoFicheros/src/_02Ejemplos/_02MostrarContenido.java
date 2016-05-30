package _02Ejemplos;

import java.io.File;

import javax.swing.JFileChooser;

public class _02MostrarContenido 
{

	public static void main(String[] args) 
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);
		
		File file = chooser.getSelectedFile();

		mostrarContenido(file, "");
	}
	
	public static void mostrarContenido(File root, String level)
	{
		for (File file : root.listFiles())
		{
			if (file.canRead() && file.canWrite())
			{
				if (file.isFile()) System.out.println(level + file.getName());
				else
				{
					System.out.println(level + "***" + file.getName().toUpperCase());
					mostrarContenido(file, level + "\t");
				}
			}
		}
	}
}
