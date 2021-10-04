//Paola Beltran. Luis Ruiz, Ryan Mercado, Alberto Castillo


package ActClase2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class VtaPPal extends JFrame {
	
	JButton btnInicio;
	JButton btnPag1;
	JButton btnPag2;
	JButton btnPag3;
	JButton btnFinal;
	CardLayout clayout;
	JPanel panTxt;

	private JPanel contentPane;
	private JTextPane txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtaPPal frame = new VtaPPal();
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
	public VtaPPal() {
		initComps();
		initAccion();
		
	}
	
	public void initAccion()
	{
		AccionBtn acc=new AccionBtn(btnInicio, btnPag1, btnPag2, btnPag3, btnFinal, this);
		btnInicio.addActionListener(acc);
		btnPag1.addActionListener(acc);
		btnPag2.addActionListener(acc);
		btnPag3.addActionListener(acc);
		btnFinal.addActionListener(acc);
	}
	public void initComps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelPpal = new JPanel();
		contentPane.add(panelPpal, BorderLayout.WEST);
		panelPpal.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel PanelBotones = new JPanel();
		PanelBotones.setForeground(Color.WHITE);
		panelPpal.add(PanelBotones);
		PanelBotones.setLayout(new BoxLayout(PanelBotones, BoxLayout.Y_AXIS));
		
		btnInicio = new JButton("Inicio");
		PanelBotones.add(btnInicio);
		
		btnPag1 = new JButton("Pag1");
		PanelBotones.add(btnPag1);
		
		btnPag2 = new JButton("Pag2");
		PanelBotones.add(btnPag2);
		
		btnPag3 = new JButton("Pag3");
		PanelBotones.add(btnPag3);
		
		btnFinal = new JButton("Final");
		PanelBotones.add(btnFinal);
		
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(Color.WHITE);
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblCanguros = new JLabel("CANGUROS");
		panelSuperior.add(lblCanguros);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(Color.WHITE);
		contentPane.add(panelInferior, BorderLayout.SOUTH);
		
		JLabel lbl2 = new JLabel("Canguritos");
		panelInferior.add(lbl2);
		
		JPanel panelBtns2 = new JPanel();
		contentPane.add(panelBtns2, BorderLayout.EAST);
		
		clayout=new CardLayout();
		
		panTxt = new JPanel();
		contentPane.add(panTxt, BorderLayout.CENTER);
		panTxt.setLayout(clayout);
		
		JPanel panInicio = new JPanel();
		panInicio.setBackground(Color.PINK);
		panInicio.setForeground(Color.PINK);
		panTxt.add(panInicio, "inicio");
		panInicio.setLayout(null);
		
		JTextPane txt1 = new JTextPane();
		txt1.setBounds(59, 34, 435, 213);
		txt1.setToolTipText("");
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txt1.setEditable(false);
		txt1.setText("El t\u00E9rmino canguro es el nombre com\u00FAn que se utiliza para designar a las especies de mayor tama\u00F1o de la subfamilia Macropodinae, tal como el t\u00E9rmino ualab\u00ED que se utiliza para denominar a las de menor tama\u00F1o.");
		panInicio.add(txt1);
		
		JPanel panPag1 = new JPanel();
		panPag1.setBackground(Color.YELLOW);
		panPag1.setForeground(Color.YELLOW);
		panTxt.add(panPag1, "pag 1");
		panPag1.setLayout(null);
		
		txt2 = new JTextPane();
		txt2.setText("Los canguros poseen grandes y poderosas patas traseras, grandes pies aptos para saltar, una cola larga y musculosa para mantener el equilibrio y una cabeza peque\u00F1a. Los canguros son herb\u00EDvoros, aliment\u00E1ndose de pasto y ra\u00EDces. Todas las especies son nocturnas y crepusculares, usualmente pasando el d\u00EDa en quietud y aliment\u00E1ndose durante las tardes y noches fr\u00EDas, generalmente en grupos. Tienen una esperanza de vida de 18 a\u00F1os aproximadamente.");
		txt2.setBounds(37, 24, 479, 227);
		panPag1.add(txt2);
		
		JPanel panPag2 = new JPanel();
		panPag2.setBackground(Color.MAGENTA);
		panPag2.setForeground(Color.MAGENTA);
		panTxt.add(panPag2, "pag 2");
		panPag2.setLayout(null);
		
		JTextPane txt3 = new JTextPane();
		txt3.setText("Su reproducci\u00F3n var\u00EDa mucho con las especies. El canguro rojo es un reproductor oportunista, ya que se aparea y reproduce cuando las condiciones estacionales son favorables para su cr\u00EDa. Los canguros grises procrean durante todo el a\u00F1o, pero paren m\u00E1s cr\u00EDas en los meses de verano, pues salen de la bolsa en la \u00E9poca ideal, la primavera. Otras especies tienen una estaci\u00F3n reproductora m\u00E1s restringida.");
		txt3.setBounds(61, 35, 418, 236);
		panPag2.add(txt3);
		
		JPanel panPag3 = new JPanel();
		panPag3.setBackground(Color.BLUE);
		panPag3.setForeground(Color.BLUE);
		panTxt.add(panPag3, "pag 3");
		panPag3.setLayout(null);
		
		JTextPane txt4 = new JTextPane();
		txt4.setText("Los canguros son los \u00FAnicos animales grandes que se desplazan dando saltos. Los saltos, que los hacen moviendo sus piernas a la vez, son un modo de locomoci\u00F3n r\u00E1pido y econ\u00F3mico, pues a altas velocidades consumen una fracci\u00F3n de la energ\u00EDa que consumir\u00EDan desplaz\u00E1ndose de otra manera.");
		txt4.setBounds(52, 38, 452, 213);
		panPag3.add(txt4);
		
		JPanel panFinal = new JPanel();
		panFinal.setBackground(Color.CYAN);
		panFinal.setForeground(new Color(0, 255, 255));
		panTxt.add(panFinal, "final");
		panFinal.setLayout(null);
		
		JTextPane txt5 = new JTextPane();
		txt5.setText("Una leyenda extendida afirma que el nombre canguro habr\u00EDa surgido al preguntar los occidentales el nombre de aquel animal y ser esto (Kan Ghu Ru) lo que respond\u00EDan los abor\u00EDgenes; su significado, seg\u00FAn la leyenda, no era el nombre del animal, sino la frase \"no le entiendo\". Esta leyenda no tiene fundamento, pues el origen vern\u00E1culo de la palabra est\u00E1 perfectamente documentado.\r\n");
		txt5.setBounds(45, 43, 454, 219);
		panFinal.add(txt5);
		
		
		
		
		
		}
}
