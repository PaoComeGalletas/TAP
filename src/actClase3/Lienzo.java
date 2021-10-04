package actClase3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Lienzo extends JPanel {
	
	
	public void paint(Graphics g) {
		
		Graphics2D g2d=(Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(15));
		
		//rombo negro
		int []romboX= {250, 0, 250, 500};
		int []romboY= {500, 250, 0, 250};
		g.setColor(Color.BLACK);
		g.fillPolygon(romboX, romboY, 4);
		
		//rombo amarillo
		int []rombo2X= {250, 20, 250, 480};
		int []rombo2Y= {480, 250, 20, 250};
		g.setColor(Color.YELLOW);
		g.fillPolygon(rombo2X, rombo2Y, 4);
		
		
		//linea centro
		g.setColor(Color.BLACK);
		g.drawLine(250, 400, 250, 100);
		
		//linea interseccion
		g2d.setStroke(new BasicStroke(10));
		g.drawLine(250, 250, 350, 350);
		
		
		g2d.setStroke(new BasicStroke(20));
		//lineas flecha
		g.drawLine(250, 100, 150, 200);
		g.drawLine(250, 100, 350, 200);
		
		
		//g.fillPolygon(romboX, romboY, 4);
		//g2d.drawLine(30, 70, 770, 70);
		
		//g2d.setColor(Color.PINK);
		//g2d.fillRect(30, 100, 350, 60);            
	}

}
