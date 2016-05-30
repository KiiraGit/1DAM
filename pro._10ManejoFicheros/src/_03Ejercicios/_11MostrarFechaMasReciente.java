package _03Ejercicios;

import java.io.File;
import java.util.Date;

import javax.swing.JFileChooser;

public class _11MostrarFechaMasReciente {

	public static void main(String[] args) 
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);
		
		File file = chooser.getSelectedFile();
		
		System.out.println(new Date(fechaReciente(file)));
	}

	public static long fechaReciente(File root)
	{
		long lastTime = 0;
		
		for (File file : root.listFiles())
		{
			try
			{
				if (file.canRead() && file.canWrite())
				{
					if (file.isFile()) 
					{
						if (file.lastModified() > lastTime) lastTime = file.lastModified();
					}
					else if (file.isDirectory())
					{
						long subTime = fechaReciente(file);
						if (subTime > lastTime) lastTime = subTime;
					}
				}
			} catch (Exception ex)
			{
				
			}
		}
		return lastTime;
	}
}
