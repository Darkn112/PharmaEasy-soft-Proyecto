package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaInventario extends MenuFuncionario{
	
	public VentanaInventario() {
		
		ImageIcon imagen = new ImageIcon("Images/menumedicamentos.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		remove(btnopciones);
		btnagregar.setBounds(62, 227, 313, 62);
		btneliminar.setBounds(62, 342, 316, 60);
		btnactualizar.setBounds(427, 227, 322, 58);
		btnmostrar.setBounds(419, 342, 321, 60);
	}

}
