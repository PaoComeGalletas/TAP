package ActClase2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class AccionBtn implements ActionListener {

	
	JButton btnInicio;
	JButton btnPag1;
	JButton btnPag2;
	JButton btnPag3;
	JButton btnFinal;
	VtaPPal frame;
	
	
	public AccionBtn(JButton btnInicio, JButton btnPag1, JButton btnPag2, JButton btnPag3, JButton btnFinal, VtaPPal frame) {
		
		this.btnInicio=btnInicio;
		this.btnPag1=btnPag1;
		this.btnPag2=btnPag2;
		this.btnPag3=btnPag3;
		this.btnFinal=btnFinal;
		this.frame=frame;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() instanceof JButton) {
			
			if(arg0.getSource()== btnInicio) {
				frame.clayout.first(frame.panTxt);
			}
			
			if(arg0.getSource()== btnPag1) {
				frame.clayout.show(frame.panTxt, "pag 1");
			}
			
			if(arg0.getSource()== btnPag2) {
				frame.clayout.show(frame.panTxt, "pag 2");
			}
			
			if(arg0.getSource()== btnPag3) {
				frame.clayout.show(frame.panTxt, "pag 3");
			}
			
			if(arg0.getSource()== btnFinal) {
				frame.clayout.show(frame.panTxt, "final");
			}
			
			
		}
		
	}


	
	
	
}
