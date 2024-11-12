package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;

public class VentanaMostrarMedicamento extends VentanaMostrarFuncionario {

	public VentanaMostrarMedicamento() {
		
		ImageIcon imagen = new ImageIcon("Images/mostrarm.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
	}

}
