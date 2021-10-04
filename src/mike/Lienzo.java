package mike;
import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Lienzo extends JPanel{
	
	
	public void paint(Graphics g) {
		super.paint(g);
		
		
		Graphics2D g2d=(Graphics2D)g;
		
		g2d.setColor(new Color(162, 166, 141));//cafecito cuerno
		g2d.fillArc(150, 85, 70, 120, 110, 180);
	    g2d.fillArc(380, 70, 70, 150, 320, 90);
	    
	    g2d.setColor(new Color(202, 211, 160));//cremita cuerno
	    g2d.fillArc(159, 95, 50, 100, 110, 180);
	    g2d.fillArc(382, 87, 60, 130, 320, 90);
	    
	    g2d.setColor(new Color(150,170,49));
	    g2d.fillOval(150, 400, 70, 50);//piecito 1
		g2d.fillOval(375, 400, 70, 50);//piecito 2
		g2d.setColor(new Color(173,190,105));
		g2d.setStroke(new BasicStroke(5));
		g2d.drawOval(150, 400, 70, 50);//aro pie 1
		g2d.drawOval(375, 400, 70, 50);//aro pie 2
		
		g2d.setColor(new Color(186,210,81));//verde lima
		g2d.fillOval(100, 100, 400, 350);
		
		g2d.setColor(Color.WHITE);
		g2d.fillOval(170, 130, 260, 260);
		
		g2d.setColor(new Color(173,190,105));
		g2d.setStroke(new BasicStroke(5));
		g2d.drawOval(170, 130, 260, 260);//aro ojo
		g2d.drawOval(100, 100, 400, 350);//aro cuerpo
		
		g2d.setColor(Color.BLACK);
		g2d.fillOval(225, 180, 150, 150);
		
		
		g2d.setColor(new Color(231,231,230,255));
		g2d.fillOval(260, 200, 20, 20);
		
		
		
		
	}

}
