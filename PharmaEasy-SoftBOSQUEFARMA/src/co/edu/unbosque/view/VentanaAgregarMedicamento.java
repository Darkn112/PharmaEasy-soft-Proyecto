package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;

public class VentanaAgregarMedicamento extends VentanaAgregarFuncionario{
	
	public VentanaAgregarMedicamento() {
		
		ImageIcon imagen = new ImageIcon("Images/agregarm.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		remove(txtcontraseña);
		txtnombre.setBounds(195, 185, 405, 30);
		txtcedula.setBounds(195, 282, 405, 30);
		txtcorreo.setBounds(195, 373, 405, 30);
	}

}
