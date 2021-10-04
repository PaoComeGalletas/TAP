package Animacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;


public class Vta extends JFrame {

	private JPanel contentPane;
	
   Circulo nvo; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vta frame = new Vta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Control = new JPanel();
		contentPane.add(Control, BorderLayout.SOUTH);
		
		JRadioButton rdbtn1 = new JRadioButton("Manual");
		Control.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Automatico");
		Control.add(rdbtn2);
		
		ButtonGroup grupoBtns=new ButtonGroup();
		grupoBtns.add(rdbtn1);
		grupoBtns.add(rdbtn2);
		rdbtn2.setSelected(true);
		
		JPanel Tapiz = new JPanel();
		//Tapiz.addKeyListener(new KeyAdapter() {
			//@Override
			//public void keyTyped(KeyEvent arg0) {
				//Vta ven=new Vta();
				//Circulo nvo=ven.nvo;
				//nvo.initKeyEvent(arg0);
				//nvo.setSelect(rdbtn1);
				//nvo.start();
			//}
		//});
		
		Tapiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Circulo nvo=new Circulo(arg0.getX(), arg0.getY(), Tapiz);
				
				Vta ven=new Vta();
				ven.nvo=nvo;
				nvo.setSelect(rdbtn1);
				nvo.start();
			}
		});
		
		Tapiz.setBackground(Color.WHITE);
		contentPane.add(Tapiz, BorderLayout.CENTER);
	}

}
