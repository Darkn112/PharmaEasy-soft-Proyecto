package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaInvEst extends VentanaPrincipal{
	
	private JButton btnvolver;
	
	public VentanaInvEst() {
		
		ImageIcon imagen = new ImageIcon("Images/invest.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		btnContinuar.setBounds(95, 252, 228, 56);
		btnFuncionario.setBounds(95, 370, 228, 56);
		
		btnvolver = new JButton();
		btnvolver.setBounds(62, 508, 163, 50);
		btnvolver.setContentAreaFilled(false);
	    btnvolver.setBorderPainted(false);
	    
	    add(btnvolver);
	    add(lblportada);
		
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

}
