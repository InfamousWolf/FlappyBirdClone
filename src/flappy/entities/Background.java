package flappy.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import flappy.Handler;
import flappy.gfx.Assets;

public class Background {
	
	private static final int SPEED = 1;
	private int width = 0;
	private int height = 0;
	
	private int x;
	private int y;
	
	private BufferedImage bg;
	
	
	public Background(Handler handler){
		bg = Assets.background;
		
		width = handler.getWidth();
		height = handler.getHeight();
		
		x = 0;
	}
	
	public boolean isOffScreen(){
		return x == 0 - width;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	
	public void update(){
		x -= SPEED;
	}
	
	public void render(Graphics g){
		g.drawImage(bg, x, y, width, height, null);
	}
}
