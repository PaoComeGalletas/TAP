package Calculadora;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Ventana extends JFrame {

	private JPanel contentPane;
	
	JPanel panOper;
	JPanel panNum;
	JPanel panPpal;
	JPanel panMemo;
	JPanel panRestore;
	JPanel panOperadores;
	JPanel panGuardar;
	JPanel panDigits;
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
	
	
	public static void main(String[] args) {
		Ventana vta=new Ventana();
		vta.setSize(400, 500);
		vta.setTitle("Calculadora");
		vta.setResizable(false);
		vta.setVisible(true);
		vta.setDefaultCloseOperation(EXIT_ON_CLOSE);
		vta.setLocationRelativeTo(null);
	}

	public Ventana() {
		initComps();
		initAccion();
	}
	
	public void initAccion() {
		Accion acc=new Accion(btnMC, btnMR, btnMS, btnMplus, btnC, btnCE, btnDiv, btnComparador, btnMulti, btnFrac, btnRes, btnSuma, btnIgual, btnGuardar, btnCancel,
				btnDigits, btnInv, btnPunto, lblNumeros, lblOperacion);
		btnMC.addActionListener(acc);
		btnMR.addActionListener(acc);
		btnMS.addActionListener(acc);
		btnMplus.addActionListener(acc);
		btnC.addActionListener(acc);
		btnCE.addActionListener(acc);
		btnDiv.addActionListener(acc);
		btnComparador.addActionListener(acc);
		btnMulti.addActionListener(acc);
		btnFrac.addActionListener(acc);
		btnRes.addActionListener(acc);
		btnSuma.addActionListener(acc);
		btnIgual.addActionListener(acc);
		btnGuardar.addActionListener(acc);
		btnCancel.addActionListener(acc);
		for (int i = 0; i < btnDigits.length; i++) {
			btnDigits[i].addActionListener(acc);
		}
		btnInv.addActionListener(acc);
		btnPunto.addActionListener(acc);
	}
	
	public void initComps() {
		
		Font opers=new Font("Arial", Font.BOLD, 16);
		
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panPpal = new JPanel();
		panPpal.setBackground(Color.PINK);
		panPpal.setBounds(0, 0, 382, 450);
		contentPane.add(panPpal);
		panPpal.setLayout(null);
		
		panOper= new JPanel();
		panOper.setBackground(Color.WHITE);
		panOper.setBounds(12, 13, 358, 117);
		panPpal.add(panOper);
		panOper.setLayout(null);
		
		panNum = new JPanel();
		panNum.setBackground(Color.WHITE);
		panNum.setBounds(12, 143, 358, 297);
		panPpal.add(panNum);
		panNum.setLayout(new BorderLayout(0, 0));
		
		
		//Panel de memoria
		panMemo=new JPanel();
		btnMC=new JButton("MC");
		btnMC.setFont(opers);
		btnMC.setForeground(Color.RED);
		btnMR=new JButton("MR");
		btnMR.setFont(opers);
		btnMR.setForeground(Color.RED);
		btnMS=new JButton("MS");
		btnMS.setFont(opers);
		btnMS.setForeground(Color.RED);
		btnMplus=new JButton("M+");
		btnMplus.setFont(opers);
		btnMplus.setForeground(Color.RED);
		panMemo.add(btnMC);
		panMemo.add(btnMR);
		panMemo.add(btnMS);
		panMemo.add(btnMplus);
		panMemo.setLayout(new BoxLayout(panMemo, BoxLayout.Y_AXIS));
		panNum.add(panMemo, BorderLayout.WEST);
		
		
		//Panel restablecer
		panRestore=new JPanel();
		panRestore.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnCE=new JButton("CE");
		btnCE.setFont(opers);
		btnCE.setForeground(Color.RED);
		btnC=new JButton("C");
		btnC.setFont(opers);
		btnC.setForeground(Color.RED);
		panRestore.setLayout(new FlowLayout());
		panRestore.add(btnCE);
		panRestore.add(btnC);
		panNum.add(panRestore,BorderLayout.NORTH);
		
		//Panel operadores
		
		panOperadores=new JPanel();
		panOperadores.setLayout(new GridLayout(4,2));
		btnDiv=new JButton("/");
		btnDiv.setFont(opers);
		btnDiv.setForeground(Color.BLUE);
		btnComparador=new JButton(">");
		btnComparador.setFont(opers);
	    btnMulti=new JButton("*");
	    btnMulti.setFont(opers);
	    btnMulti.setForeground(Color.BLUE);
		btnFrac=new JButton("1/x");
		btnFrac.setFont(opers);
	    btnRes=new JButton("-");
	    btnRes.setFont(opers);
	    btnRes.setForeground(Color.BLUE);
	    btnIgual=new JButton("=");
	    btnIgual.setFont(opers);
	    btnIgual.setForeground(Color.BLUE);
	    //btnIgual.setSize(btnIgual.getWidth(), (btnIgual.getHeight()*2));
		btnSuma=new JButton("+");
		btnSuma.setFont(opers);
		btnSuma.setForeground(Color.BLUE);
		panOperadores.add(btnDiv);
		panOperadores.add(btnComparador);
		panOperadores.add(btnMulti);
		panOperadores.add(btnFrac);
		panOperadores.add(btnRes);
		panOperadores.add(btnIgual);
		panOperadores.add(btnSuma);
		panNum.add(panOperadores, BorderLayout.EAST);
		
		
		//panel guardado
		JPanel panGuardar=new JPanel();
		btnGuardar=new JButton("OK");
		btnCancel=new JButton("Cancelar");
		btnGuardar.setSize(btnGuardar.getWidth()*2, btnGuardar.getHeight());
		btnGuardar.setFont(opers);
		btnGuardar.setForeground(Color.GREEN);
		btnCancel.setSize(btnCancel.getWidth()*2, btnCancel.getHeight());
		btnCancel.setFont(opers);
		btnCancel.setForeground(Color.RED);
		panGuardar.add(btnGuardar);
		panGuardar.add(btnCancel);
		panNum.add(panGuardar, BorderLayout.SOUTH);
		
		
		//panel digitos
		panDigits=new JPanel();
		panDigits.setLayout(new GridLayout(4,3));
		btnDigits=new JButton[10];
		for (int i = btnDigits.length-1; i >= 0; i--) {
			btnDigits[i]=new JButton((i)+"");
			btnDigits[i].setFont(opers);
			panDigits.add(btnDigits[i]);
		}
		btnInv=new JButton("+/-");
		btnInv.setFont(opers);
		btnInv.setForeground(Color.BLUE);
		btnPunto=new JButton(".");
		btnPunto.setFont(opers);
		btnPunto.setForeground(Color.BLUE);
		panDigits.add(btnInv);
		panDigits.add(btnPunto);
		panNum.add(panDigits, BorderLayout.CENTER);
		
		
		
		lblNumeros= new JLabel("");
		lblNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeros.setFont(new Font("Arial", Font.BOLD, 20));
		lblNumeros.setBounds(12, 55, 334, 49);
		panOper.add(lblNumeros);
		
		lblOperacion = new JLabel("");
		lblOperacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOperacion.setFont(opers);
		lblOperacion.setBounds(12, 7, 346, 35);
		panOper.add(lblOperacion);
		
		
		
		
		
	}
}
