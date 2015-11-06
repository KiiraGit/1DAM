package _01Pruebas;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends GUI
{
	private int radius;
	
	public Ellipse(Color color, int posX, int posY, int radius)
	{
		super(color, posX, posY);
		this.radius = radius;
	}
	
	public Ellipse(int posX, int posY, int radius)
	{
		super(posX, posY);
		this.radius = radius;
	}
	
	//	Setter
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	//	Getter
	public int getRadius()
	{
		return radius;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(posX - radius, posY - radius, radius * 2, radius * 2);
	}
}
