package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;

public class VentanaEliminarMedicamento extends VentanaEliminarFuncionario{
	
	public VentanaEliminarMedicamento() {
		
		ImageIcon imagen = new ImageIcon("Images/eliminarm.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		scroll.setBounds(55, 125, 330, 340);
		btnvolver.setBounds(63, 512, 200, 62);
		btneliminar.setBounds(495, 495, 239, 62);
		add(lblportada);
		
	}

}
