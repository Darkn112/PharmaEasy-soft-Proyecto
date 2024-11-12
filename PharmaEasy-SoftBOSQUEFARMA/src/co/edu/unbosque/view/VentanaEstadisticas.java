package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaEstadisticas extends VentanaMostrarFuncionario{
	
	private JTextArea txtacontenido2;
	private JScrollPane scroll2;
	private JTextField txtcontenido;
	
	public VentanaEstadisticas() {
		
		ImageIcon imagen = new ImageIcon("Images/estadisticas.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		btnvolver.setBounds(62, 510, 200, 60);
		scroll.setBounds(60, 275, 320, 210);
		
		txtcontenido = new JTextField(12);
		txtcontenido.setBounds(467, 130, 100, 35);
		txtcontenido.setFont(new Font("Candara", Font.PLAIN, 18));
		txtcontenido.setEditable(false);
		txtcontenido.setHorizontalAlignment(JTextField.CENTER);
		
		txtacontenido2 = new JTextArea();
		txtacontenido2.setBackground(new Color(221, 234, 237));
		txtacontenido2.setFont(new Font("Candara", Font.PLAIN, 18));
		txtacontenido2.setEditable(false);
		
		scroll2 = new JScrollPane(txtacontenido2);
		scroll2.setBounds(422, 275, 320, 210);
	    scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
	    add(txtcontenido);
		add(scroll2);
		add(lblportada);
	}

	public JTextArea getTxtacontenido2() {
		return txtacontenido2;
	}

	public void setTxtacontenido2(JTextArea txtacontenido2) {
		this.txtacontenido2 = txtacontenido2;
	}

	public JScrollPane getScroll2() {
		return scroll2;
	}

	public void setScroll2(JScrollPane scroll2) {
		this.scroll2 = scroll2;
	}

	public JTextField getTxtcontenido() {
		return txtcontenido;
	}

	public void setTxtcontenido(JTextField txtcontenido) {
		this.txtcontenido = txtcontenido;
	}
}
