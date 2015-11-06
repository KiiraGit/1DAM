package _02Ejemplos;

import pizarra.Pizarra;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import figuras.Rectangulo;

public class _03CrearRectangulo 
{
	public int posX = 50, posY = 450;
	public static void main(String[] args) 
	{
		Pizarra p = new Pizarra("Rectangulo en la esquina", 800, 600);
		boolean exit = false;
		int pX = 50, pY = 450;
		while (!exit)
		{
			Rectangulo r1 = new Rectangulo(0, 0, 800, 400);
			Rectangulo r2 = new Rectangulo(2, 0, 400, 800, 200);
			Rectangulo player = new Rectangulo(0, pX, pY, 50, 100);
			
			p.addKeyListener(new KeyListener()
			{
				public void keyPressed(KeyEvent e)
				{

				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			p.anyadir(r1);
			p.anyadir(r2);
			p.anyadir(player);
			pX = player.getPosx();
			pY = player.getPosy();
			p.esperar(50);
		}
	}
	
	public void moverPlayer(int code)
	{
		
		switch(code)
		{
			case 27:
				//exit = !exit;
				break;
			case 39:
				posX = posX + 10;
				break;
		}
	}
}
