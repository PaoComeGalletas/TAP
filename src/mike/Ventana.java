package mike;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	
	public static void main(String []args ) {
		Ventana vta=new Ventana();
		vta.setVisible(true);
	}
	
	public Ventana() {
		initComps();
		
		Lienzo n=new Lienzo();
		add(n);
		
	}
	
	public void initComps() {
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
