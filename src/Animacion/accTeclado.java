package Animacion;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class accTeclado implements KeyListener{
	
	Circulo circ;
	JPanel pan;
	
	accTeclado(Circulo circ, JPanel pan){
		this.circ=circ;
		this.pan=pan;	
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//Aqui hice un mame para que se pasen los mismos circulos dibujados
		//Cuando en la ventana presionas y entra al mouse clicked hago que ese circulo tambien se guarde en la clase
		//Ventana, porque commo esta es otra 'mini clase' poder jalar el circulo de ahi y que sea el mismo
		System.out.println("Entro");
		
		//MANEJADO CON WASD
		if(arg0.getExtendedKeyCode() == KeyEvent.VK_A) {
			if(circ.getX()+50>=0)
				circ.setX(circ.getX()-1);
			else
				circ.setY(circ.getY()-1);
		}
		
		if(arg0.getExtendedKeyCode() == KeyEvent.VK_D) {
			if(circ.getX()+50<=pan.getWidth())
				circ.setX(circ.getX()+1);
			else
				circ.setY(circ.getY()-1);
		}
		
		if(arg0.getExtendedKeyCode() == KeyEvent.VK_W) {
			if(circ.getY()>=0)
				circ.setY(circ.getY()-1);
			else
				circ.setX(circ.getX()-1);
		}
		
		if(arg0.getExtendedKeyCode() == KeyEvent.VK_S) {
			if(circ.getY()<=pan.getHeight())
				circ.setY(circ.getY()+1);
			else
				circ.setX(circ.getX()-1);
		}
		
		circ.dibujar();
		
	}

}
