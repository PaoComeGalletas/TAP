package Animacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Circulo  extends Thread{
	
	private int x, y;
	private Graphics g;
	private JRadioButton select;
	private JPanel pan;
	private boolean bX=true, bY=true;
	KeyEvent arg0;
	
	public Circulo(int x, int y, JPanel p) {
		//super();
		this.x = x;
		this.y = y;
		this.pan=p;
		this.g = p.getGraphics();
	}
	
	
	
	public void initKeyEvent(KeyEvent arg0) {
		this.arg0=arg0;
	}

	

	public void setSelect(JRadioButton select) {
		this.select = select;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public void dibujar() {
		g.drawOval(x, y, 50, 50);
	}



	public void run() 
	{
		while(true)
		{
			if(!select.isSelected())
			{
				if(x+50>=pan.getWidth())
				{
					bX=false;
					g.setColor(new Color((int)(Math.random()*256), 
							(int)(Math.random()*256), (int)(Math.random()*256)));
				}
				if(x<=0)
				{
					bX=true;
					g.setColor(new Color((int)(Math.random()*256), 
							(int)(Math.random()*256), (int)(Math.random()*256)));
				}
				if(y+50>=pan.getHeight());
				{
					bY=false;
					g.setColor(new Color((int)(Math.random()*256), 
							(int)(Math.random()*256), (int)(Math.random()*256)));
				}
				if(y<=0)
				{	
					bY=true;
					g.setColor(new Color((int)(Math.random()*256), 
							(int)(Math.random()*256), (int)(Math.random()*256)));
				}
				
				
				if(bX)
					x++;
				else
					x--;
				
				if(bY)
					y++;
				else
					y--;
				
			}
			
			
			if(select.isSelected()) {
				accTeclado acc=new accTeclado(this, pan);
				pan.addKeyListener(acc);
				
			}
			
			
			dibujar();
			try {
				sleep(50);
			} catch (InterruptedException e) {}
		}
	}
	
	

}
