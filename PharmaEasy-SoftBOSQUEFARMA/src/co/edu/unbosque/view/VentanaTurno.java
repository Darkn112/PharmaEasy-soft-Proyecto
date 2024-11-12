package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaTurno extends MenuPaciente {

	private JTextArea txtacontenido;
	private JScrollPane scroll;

	public VentanaTurno() {
		
		remove(txtnumdocumento);

		ImageIcon imagen = new ImageIcon("Images/turno.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);

		btnvolver.setBounds(52, 340, 300, 55);
		btntomarturno.setBounds(452, 340, 300, 55);

		txtacontenido = new JTextArea();
		txtacontenido.setFont(new Font("Candara", Font.PLAIN, 18));
		txtacontenido.setEditable(false);
		
		scroll = new JScrollPane(txtacontenido);
		scroll.setBounds(230, 150, 340, 75);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		add(scroll);
		add(lblportada);

	}

	public JTextArea getTxtacontenido() {
		return txtacontenido;
	}

	public void setTxtacontenido(JTextArea txtacontenido) {
		this.txtacontenido = txtacontenido;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

}
