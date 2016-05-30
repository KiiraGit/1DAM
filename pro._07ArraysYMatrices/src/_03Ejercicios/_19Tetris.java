package _03Ejercicios;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _19Tetris {
	
	public static final byte cols = 8;
	public static final byte rows = 15;
	public static final byte figs = 2;
	
	public static short restTime = 1000;
	
	public static final int pieceScore = 10;
	public static final int rowScore = 40;
	
	public static byte level = 1;
	public static long toNext = 10;
	
	public static class Figura
	{
		byte type;
		
		byte posX;
		byte posY;
		
		byte rightX;
		byte downY;
		
		byte lastPosx;
		byte lastPosy;
		
		byte rot;
		
		public Figura(byte type, byte posX, byte rightX, byte downY)
		{
			this.type = type;
			this.posX = posX;
			this.posY = 0;
			this.lastPosx = posX;
			this.lastPosy = 0;
			this.rot = 0;
			this.downY = downY;
		}
	}
	
	public static byte[][] tablero;
	public static Figura active;
	public static boolean gameOver = false;
	public static int score = 0;

	public static void main(String[] args) 
	{
		tablero = new byte[rows][cols];
		
		active = null;
		Scanner tec = new Scanner(System.in);
		
		while (!gameOver)
		{
			if (active == null)
			{
				cleanAndScore();
				while (score >= toNext)
				{
					level++;
					toNext *= 2;
				}
				drawFigura((byte)((Math.random() * figs) + 1));
//				drawFigura((byte) 2);
			}
			else
			{
				moveFigura();
			}
			System.out.println("------------ " + score + " ------------");
			for (byte[] fila : tablero)
			{
				System.out.println(Arrays.toString(fila));
			}
			System.out.println("-- Level ----------- " + level + " ----");
			try {
				Thread.sleep(restTime);
//				String line = tec.nextLine();
				InputStreamReader key = new InputStreamReader(System.in);
				if (key.ready())
				{
					char keyPress = new Scanner(key).next().charAt(0);
					System.out.println(keyPress);
					switch (keyPress)
					{
						case 'a':
							if (active.posX > 0)
								active.posX--;
							break;
						case 'd':
							if (active.posX < cols - 1)
								active.posX++;
							break;
					}
//					key.reset();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("GAME OVER");
	}
	
	public static void drawFigura (byte type)
	{
		switch (type)
		{
			case 1:
				drawL();
				break;
			case 2:
				drawCube();
				break;
		}
	}
	
	public static void moveFigura()
	{
		switch (active.type)
		{
			case (byte)1:
				moveL();
				break;
			case (byte)2:
				moveCube();
				break;
		}
	}
	
	public static void drawL()
	{
		byte x = (byte)(Math.random() * cols - 1);
		active = new Figura((byte)1, x, (byte)(x + 1), (byte)2);
		moveL();
	}
	
	public static void drawCube()
	{
		byte x = (byte)(Math.random() * cols - 1);
		active = new Figura((byte)2, x, (byte)(x + 1), (byte)1);
		moveCube();
	}
	
	public static void moveL()
	{
		byte x = active.posX;
		byte y = active.posY;
		if (active.downY <= 14 && (tablero[y+2][x] == 0 && tablero[y+2][x+1] == 0))
		{
			if (y > 0 && active.downY < 15)
			{
				byte lastx = active.lastPosx;
				byte lasty = active.lastPosy;
				
				tablero[lasty][lastx] = 0;
				tablero[lasty+1][lastx] = 0;
				tablero[lasty+2][lastx] = 0;
				tablero[lasty+2][lastx+1] = 0;
			}
			
			tablero[y][x] = 1;
			tablero[y+1][x] = 1;
			tablero[y+2][x] = 1;
			tablero[y+2][x+1] = 1;
			active.lastPosy = y;
			active.lastPosx = x;
			active.posY++;
			active.downY++;
		}
		else if (y == 0)
		{
			gameOver = true;
		}
		else 
		{
			active = null;
			score += 5;
		}
	}
	
	public static void moveCube()
	{
		byte x = active.posX;
		byte y = active.posY;
		if (active.downY <= 14 && (tablero[y+1][x] == 0 && tablero[y+1][x+1] == 0))
		{
			if (y > 0 && active.downY < 15)
			{
				byte lastx = active.lastPosx;
				byte lasty = active.lastPosy;
				
				tablero[lasty][lastx] = 0;
				tablero[lasty][lastx + 1] = 0;
				tablero[lasty+1][lastx] = 0;
				tablero[lasty+1][lastx+1] = 0;
			}
			
			tablero[y][x] = 2;
			tablero[y][x+1] = 2;
			tablero[y+1][x] = 2;
			tablero[y+1][x+1] = 2;
			active.lastPosy = y;
			active.lastPosx = x;
			active.posY++;
			active.downY++;
		}
		else 
		{
			active = null;
			score += 5;
		}
	}
	
	public static void cleanAndScore()
	{
		for (int i = rows - 1; i >= 0; i--)
		{
			int j = 0;
			while (j < cols && tablero[i][j] != 0)
			{
				j++;
			}
			
			if (j == cols)
			{
				for (int k = i; k > 0; k--)
				{
					tablero[k] = tablero[k - 1];
				}
				for (int k = 0; k < cols; k++)
				{
					tablero[0][k] = 0;
				}
				score += 30;
			}
		}
	}
}
