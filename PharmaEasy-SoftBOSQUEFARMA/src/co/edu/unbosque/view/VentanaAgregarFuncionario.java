package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaAgregarFuncionario extends JFrame {

	protected JLabel lblportada;
	protected JTextField txtnombre, txtcedula, txtcontraseña, txtcorreo;
	protected JButton btnvolver, btnagregar;

	public VentanaAgregarFuncionario() {

		setSize(815, 638);
		setTitle("Bosque Farma");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		lblportada = new JLabel();
		ImageIcon imagen = new ImageIcon("Images/agregarf.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);


		txtnombre = new JTextField(34);
		txtnombre.setBounds(195, 165, 405, 30);
		txtnombre.setFont(new Font("Candara", Font.PLAIN, 18));

		txtcedula = new JTextField(12);
		txtcedula.setBounds(195, 252, 405, 30);
		txtcedula.setFont(new Font("Candara", Font.PLAIN, 18));

		txtcorreo = new JTextField(20);
		txtcorreo.setBounds(195, 338, 405, 30);
		txtcorreo.setFont(new Font("Candara", Font.PLAIN, 18));
		
		txtcontraseña = new JTextField(12);
		txtcontraseña.setBounds(195, 425, 405, 30);
		txtcontraseña.setFont(new Font("Candara", Font.PLAIN, 18));

		btnvolver = new JButton();
		btnvolver.setBounds(62, 510, 200, 60);
		btnvolver.setContentAreaFilled(false);
	    btnvolver.setBorderPainted(false);
		
		btnagregar = new JButton();
		btnagregar.setBounds(500, 490, 237, 63);
		btnagregar.setContentAreaFilled(false);
	    btnagregar.setBorderPainted(false);

		add(btnagregar);
		add(btnvolver);
		add(txtnombre);
		add(txtcedula);
		add(txtcontraseña);
		add(txtcorreo);
		add(lblportada);
	}

	public JLabel getLblportada() {
		return lblportada;
	}

	public void setLblportada(JLabel lblportada) {
		this.lblportada = lblportada;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxtcedula() {
		return txtcedula;
	}

	public void setTxtcedula(JTextField txtcedula) {
		this.txtcedula = txtcedula;
	}

	public JTextField getTxtcontraseña() {
		return txtcontraseña;
	}

	public void setTxtcontraseña(JTextField txtcontraseña) {
		this.txtcontraseña = txtcontraseña;
	}

	public JTextField getTxtcorreo() {
		return txtcorreo;
	}

	public void setTxtcorreo(JTextField txtcorreo) {
		this.txtcorreo = txtcorreo;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

	public JButton getBtnagregar() {
		return btnagregar;
	}

	public void setBtnagregar(JButton btnagregar) {
		this.btnagregar = btnagregar;
	}
	

}
