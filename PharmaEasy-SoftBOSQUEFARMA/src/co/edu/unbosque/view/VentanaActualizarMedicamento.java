package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;

public class VentanaActualizarMedicamento extends VentanaActualizarFuncionario{
	
	public VentanaActualizarMedicamento() {
		
		ImageIcon imagen = new ImageIcon("Images/actualizarm.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		remove(txtcontraseña);
		add(lblportada);
	}

}
