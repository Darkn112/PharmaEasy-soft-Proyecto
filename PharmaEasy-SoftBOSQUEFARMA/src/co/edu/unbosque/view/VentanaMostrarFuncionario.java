package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarFuncionario extends JFrame {
	
	protected JTextArea txtacontenido;
	protected JButton btnvolver;
	protected JLabel lblportada;
	protected JScrollPane scroll;

	public VentanaMostrarFuncionario() {
		
		setSize(815, 638);
		setTitle("Bosque Farma");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		lblportada = new JLabel();
		ImageIcon imagen = new ImageIcon("Images/mostrarf.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		txtacontenido = new JTextArea();
		txtacontenido.setBackground(new Color(221, 234, 237));
		txtacontenido.setFont(new Font("Candara", Font.PLAIN, 18));
		txtacontenido.setEditable(false);
		
		btnvolver = new JButton();
		btnvolver.setBounds(60, 510, 200, 60);
		btnvolver.setContentAreaFilled(false);
	    btnvolver.setBorderPainted(false);
		
		scroll = new JScrollPane(txtacontenido);
		scroll.setBounds(175, 130, 460, 340);
	    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		add(btnvolver);
		add(scroll);
		add(lblportada);
		
	}

	public JTextArea getTxtacontenido() {
		return txtacontenido;
	}

	public void setTxtacontenido(JTextArea txtacontenido) {
		this.txtacontenido = txtacontenido;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

	public JLabel getLblportada() {
		return lblportada;
	}

	public void setLblportada(JLabel lblportada) {
		this.lblportada = lblportada;
	}
	
	

}
