package _01Pruebas;

import java.awt.Color;

public class PruebaClaseWindow 
{
	public static void main(String[] args) 
	{
		Window win = new Window("Ventana de prueba", 600, 600);
		Rect box = new Rect(Color.CYAN, 50, 50, 100, 25);
		Ellipse oval = new Ellipse(win.getWidth() / 2, win.getHeight() / 2, 100);
		
		win.add(box);
		
	}

}
