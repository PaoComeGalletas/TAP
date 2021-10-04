//Paola Beltran, Marian Murrieta, Diana Madrid, Sergio Flores

package actClase3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class vta extends JFrame {

	

   public static void main(String[] args) {
		vta vta=new vta();
		vta.setVisible(true);
		vta.setLocationRelativeTo(null);
	}

	
	public vta() {
		
		initComps();
		
		Lienzo n=new Lienzo();
		add(n);
		setSize(600, 600);
		
		n.repaint();
		
	}
	
	public void initComps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 541);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		
	}
}
