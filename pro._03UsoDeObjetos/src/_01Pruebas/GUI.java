package _01Pruebas;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GUI 
{
	protected Color color;
	protected int posX, posY;
	
	public GUI(Color color, int posX, int posY)
	{
		this.color = color;
		this.posX = posX;
		this.posY = posY;
	}
	
	public GUI(int posX, int posY)
	{
		this(Color.BLACK, posX, posY);
	}
	
	//	Setters
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public void setPosX(int posX)
	{
		this.posX = posX;
	}
	
	public void setPosY(int posY)
	{
		this.posY = posY;
	}
	
	//	Getters
	public Color getColor()
	{
		return color;
	}
	
	public int getPosX()
	{
		return posX;
	}
	
	public int getPosY()
	{
		return posY;
	}
	
	public abstract void draw(Graphics g);
}
