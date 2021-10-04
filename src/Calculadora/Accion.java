package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Accion implements ActionListener {
	
	JButton btnMC;
	JButton btnMR;
	JButton btnMS;
	JButton btnMplus;
	JButton btnC;
	JButton btnCE;
	JButton btnDiv;
	JButton btnComparador;
	JButton btnMulti;
	JButton btnFrac;
	JButton btnRes;
	JButton btnSuma;
	JButton btnIgual;
	JButton btnGuardar;
	JButton btnCancel;
	JButton[] btnDigits;
	JButton btnInv;
	JButton btnPunto;
	JLabel lblNumeros;
	JLabel lblOperacion;
	
	Operaciones op;
	
	float memoria;
	
	public Accion(JButton btnMC, JButton btnMR, JButton btnMS, JButton btnMplus, JButton btnC, JButton btnCE, JButton btnDiv, JButton btnComparador,
			JButton btnMulti, JButton btnFrac, JButton btnRes, JButton btnSuma, JButton btnIgual, JButton btnGuardar, JButton btnCancel, JButton btnDigits[],
			JButton btnInv, JButton btnPunto, JLabel lblNumeros, JLabel lblOperacion) {
		
		this.btnMC=btnMC;
		this.btnMR=btnMR;
		this.btnMS=btnMS;
		this.btnMplus=btnMplus;
		this.btnC=btnC;
		this.btnCE=btnCE;
		this.btnDiv=btnDiv;
		this.btnComparador=btnComparador;
		this.btnMulti=btnMulti;
		this.btnFrac=btnFrac;
		this.btnRes=btnRes;
		this.btnSuma=btnSuma;
		this.btnIgual=btnIgual;
		this.btnGuardar=btnGuardar;
		this.btnCancel=btnCancel;
		this.btnDigits=btnDigits;
		this.btnInv=btnInv;
		this.btnPunto=btnPunto;
		this.lblNumeros=lblNumeros;
		this.lblOperacion=lblOperacion;
		
		op=new Operaciones();
		
		memoria=0;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		if(arg0.getSource() instanceof JButton)
		{
			
			
			for (int i = 0; i < btnDigits.length; i++) 
				{
					if(arg0.getSource() == btnDigits[i])
						lblNumeros.setText(lblNumeros.getText()+i+"");
				}
			
			
			if(arg0.getSource() == btnSuma) {
				if(op.getOperador() != ' ') {
					op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
					op.setPrimerNum(op.operaciones());
					op.setOperador('+');
				}else {
					op.setPrimerNum(Float.parseFloat(lblNumeros.getText()));
					op.setOperador('+');
				}
				lblOperacion.setText(lblOperacion.getText()+lblNumeros.getText()+"+");
				lblNumeros.setText("");
			}
			
			if(arg0.getSource()==btnRes) {
				if(op.getOperador() != ' ') {
					op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
					op.setPrimerNum(op.operaciones());
					op.setOperador('-');
				}else {
					op.setPrimerNum(Float.parseFloat(lblNumeros.getText()));
					op.setOperador('-');
				}
				lblOperacion.setText(lblOperacion.getText()+lblNumeros.getText()+"-");
				lblNumeros.setText("");
				
			}
			
			if(arg0.getSource()==btnMulti) {
				if(op.getOperador() != ' ') {
					op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
					op.setPrimerNum(op.operaciones());
					op.setOperador('*');
				}else {
					op.setPrimerNum(Float.parseFloat(lblNumeros.getText()));
					op.setOperador('*');
				}
				lblOperacion.setText(lblOperacion.getText()+lblNumeros.getText()+"*");
				lblNumeros.setText("");
				
			}
			
			if(arg0.getSource()==btnDiv) {
				if(op.getOperador() != ' ') {
					op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
					op.setPrimerNum(op.operaciones());
					op.setOperador('/');
				}else {
					op.setPrimerNum(Float.parseFloat(lblNumeros.getText()));
					op.setOperador('/');
				}
				lblOperacion.setText(lblOperacion.getText()+lblNumeros.getText()+"/");
				lblNumeros.setText("");
				
			}
			
			if(arg0.getSource() == btnPunto) {
				if(lblNumeros.getText().contains(".")) {
					JOptionPane.showMessageDialog(null, "Entrada invalida");
				}else {
					if(lblNumeros.getText() == "")
						lblNumeros.setText(lblNumeros.getText()+"0.");
					else
						lblNumeros.setText(lblNumeros.getText()+".");
				}
				
			}
			
			if(arg0.getSource() == btnComparador) {
				if(lblNumeros.getText() != "") {
					op.setOperador('>');
					op.setPrimerNum(Float.parseFloat(lblNumeros.getText()));
					lblOperacion.setText(lblOperacion.getText()+lblNumeros.getText()+">");
					lblNumeros.setText("");
				}else
					JOptionPane.showMessageDialog(null, "No hay valores que comparar");
			}
			
			if(arg0.getSource() == btnFrac) {
				if(lblNumeros.getText() == "") {
					//if(lblNumeros.getText().contains("1/")) {
						//JOptionPane.showMessageDialog(null, "Entrada invalida");
					//}else {
						op.setOperador('/');
						op.setPrimerNum(1);
						lblOperacion.setText("1/");
					//}
					
				}else {
					op.setOperador('/');
					op.setPrimerNum(1);
					op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
					lblNumeros.setText(op.operaciones()+"");
				}
			}
			
			if(arg0.getSource()==btnInv) {
				if(lblNumeros.getText() != "") {
					op.setOperador('*');
					op.setPrimerNum(-1);
					op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
					lblNumeros.setText(op.operaciones()+"");
					op.setOperador(' ');
				}else
					JOptionPane.showMessageDialog(null, "No hay ninguna entrada");
			}
			
			if(arg0.getSource() == btnIgual) {
				op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
				lblOperacion.setText(lblOperacion.getText()+lblNumeros.getText()+"=");
				if(op.getOperador() == '>') {
					float x=op.operaciones();
					if(x == 1) 
						lblNumeros.setText("CIERTO");
					else 
						lblNumeros.setText("FALSO");
					
				}else {
					lblNumeros.setText(op.operaciones()+"");
					op.setOperador(' ');
				}
				
			}
			
			//BOTONES DE RESTABLECIMIENTO
			if(arg0.getSource() == btnC || arg0.getSource() == btnCancel) {
				op.setOperador(' ');
				op.setPrimerNum(0);
				op.setSegundoNum(0);
				lblOperacion.setText("");
				lblNumeros.setText("");
			}
			
			if(arg0.getSource() ==  btnCE ) {
				lblNumeros.setText(lblNumeros.getText().substring(0, lblNumeros.getText().length()-1));
			}
			
			
			//BOTONES DE MEMORIA
			if(arg0.getSource() == btnMS || arg0.getSource() == btnGuardar) { //Guardar
				if(lblNumeros.getText() != "") {
					if(lblNumeros.getText().contains("CIERTO") || lblNumeros.getText().contains("FALSO"))
						JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN GUARDAR VALORES NUMERICOS");
					else {
						if(memoria == 0) {
							memoria=Float.parseFloat(lblNumeros.getText());
							lblNumeros.setText("");
							lblOperacion.setText("");
							JOptionPane.showMessageDialog(null, "Valor guardado!");
						}
						else {
							int opt= JOptionPane.showConfirmDialog(null, "Ya hay un valor en memoria, desea cambiarlo?");
							if(opt == JOptionPane.OK_OPTION) {
								memoria=Float.parseFloat(lblNumeros.getText());	
								lblNumeros.setText("");
								lblOperacion.setText("");
							}
						}
					}
					
				}
				else
					JOptionPane.showMessageDialog(null, "No hay ninguna entrada para guardar");
			}
			
			if(arg0.getSource() == btnMC) {// Limpiar memoria
				memoria=0;
				lblNumeros.setText("");
				JOptionPane.showMessageDialog(null, "Memoria Limpiada");
			}
			
			if(arg0.getSource() == btnMR) {//Mostrar valor almacenado en memoria
				lblNumeros.setText(memoria+"");
			}
			
			if (arg0.getSource() == btnMplus) {//Sumar valor de pantalla con valor de la memoria
				if(lblNumeros.getText() != "") {
					if(memoria != 0 ) {
						op.setOperador('+');
						op.setPrimerNum(memoria);
						op.setSegundoNum(Float.parseFloat(lblNumeros.getText()));
						lblNumeros.setText(op.operaciones()+"");
						op.setOperador(' ');
					}else
						JOptionPane.showMessageDialog(null, "No hay valores almacenados en la memoria");
				}else
					JOptionPane.showMessageDialog(null, "No hay valor ehn pantalla para mostrar");
			}
			
			
			
			
			
			
		}
		
	}

}
