package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaActualizarFuncionario extends VentanaAgregarFuncionario{
	
	private JTextArea txtacontenido;
	private JTextField txtnumactualizar;
	private JScrollPane scroll;
	
	public VentanaActualizarFuncionario() {
		
		ImageIcon imagen = new ImageIcon("Images/actualizarf.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		txtnombre.setBounds(53, 165, 330, 25);
		txtcedula.setBounds(53, 250, 330, 25);
		txtcorreo.setBounds(53, 340, 330, 25);
		txtcontraseña.setBounds(53, 430, 330, 25);
		
		txtacontenido = new JTextArea();
		txtacontenido.setBackground(new Color(221, 234, 237));
		txtacontenido.setFont(new Font("Candara", Font.PLAIN, 18));
		txtacontenido.setEditable(false);
		
		txtnumactualizar = new JTextField(1);
		txtnumactualizar.setBounds(430, 420, 300, 30);
		txtnumactualizar.setFont(new Font("Candara", Font.PLAIN, 18));
		
		btnvolver.setBounds(65, 510, 196, 59);
		btnagregar.setBounds(496, 492, 238, 62);
		
		scroll = new JScrollPane(txtacontenido);
		scroll.setBounds(412, 120, 335, 250);
	    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		add(txtnumactualizar);
		add(scroll);
		add(lblportada);
	}

	public JTextArea getTxtacontenido() {
		return txtacontenido;
	}

	public void setTxtacontenido(JTextArea txtacontenido) {
		this.txtacontenido = txtacontenido;
	}

	public JTextField getTxtnumactualizar() {
		return txtnumactualizar;
	}

	public void setTxtnumactualizar(JTextField txtnumactualizar) {
		this.txtnumactualizar = txtnumactualizar;
	}
	
	

}
