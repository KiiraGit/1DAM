package _01Pruebas;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends GUI
{
	private int width, height;
	
	public Rect(Color color, int posX, int posY, int width, int height)
	{
		super(color, posX, posY);
		this.width = width;
		this.height = height;
	}
	
	public Rect(int posX, int posY, int width, int height)
	{
		super(posX, posY);
		this.width = width;
		this.height = height;
	}
	
	//	Setters
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	//	Getters
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillRect(posX, posY, width, height);
	}
}
