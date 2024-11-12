package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class VentanaExpendioMedicamento extends VentanaAgregarFuncionario{
	
	private JTextField txtturno;
	
	public VentanaExpendioMedicamento() {
		
		ImageIcon imagen = new ImageIcon("Images/expendiom.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		remove(btnvolver);
		btnagregar.setBounds(498, 492, 237, 63);
		txtnombre.setBounds(60, 165, 405, 30);
		txtcedula.setBounds(60, 257, 405, 30);
		txtcorreo.setBounds(60, 343, 405, 30);
		txtcontraseña.setBounds(60, 425, 405, 30);
		
		txtturno = new JTextField(10);
		txtturno.setBounds(522, 384, 200, 30);
		txtturno.setFont(new Font("Candara", Font.PLAIN, 18));
		txtturno.setEditable(false);
		txtturno.setHorizontalAlignment(JTextField.CENTER);
		
		add(txtturno);
		add(lblportada);
	}

	public JTextField getTxtturno() {
		return txtturno;
	}

	public void setTxtturno(JTextField txtturno) {
		this.txtturno = txtturno;
	}

}
