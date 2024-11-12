package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaEliminarFuncionario extends VentanaMostrarFuncionario{
	
	private JTextField txtnumeliminar;
	protected JButton btneliminar;
	
	public VentanaEliminarFuncionario() {
		
		ImageIcon imagen = new ImageIcon("Images/eliminarf.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		scroll.setBounds(55, 125, 335, 340);
		
		txtnumeliminar = new JTextField(12);
		txtnumeliminar.setBounds(446, 260, 260, 25);
		
		btnvolver.setBounds(62, 510, 200, 60);
		
		btneliminar = new JButton();
		btneliminar.setBounds(494, 493, 240, 60);
		btneliminar.setContentAreaFilled(false);
	    btneliminar.setBorderPainted(false);
		
		add(btneliminar);
		add(txtnumeliminar);
		add(lblportada);
		
	}

	public JTextField getTxtnumeliminar() {
		return txtnumeliminar;
	}

	public void setTxtnumeliminar(JTextField txtnumeliminar) {
		this.txtnumeliminar = txtnumeliminar;
	}

	public JButton getBtneliminar() {
		return btneliminar;
	}

	public void setBtneliminar(JButton btneliminar) {
		this.btneliminar = btneliminar;
	}
	
	

}
