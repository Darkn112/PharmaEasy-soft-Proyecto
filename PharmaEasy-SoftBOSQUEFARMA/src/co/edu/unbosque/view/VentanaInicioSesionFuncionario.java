package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicioSesionFuncionario extends VentanaAgregarFuncionario {
	
	public VentanaInicioSesionFuncionario() {
		
		remove(txtnombre);
		remove(txtcorreo);
		
		ImageIcon imagen = new ImageIcon("Images/iniciosesionf.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		txtcedula.setBounds(160, 245, 400, 25);
		txtcontraseña.setBounds(160, 370, 400, 25);
		
		btnvolver.setBounds(77, 475, 170, 55);
		btnagregar.setBounds(433, 445, 315, 55);
		
	}
	

}
