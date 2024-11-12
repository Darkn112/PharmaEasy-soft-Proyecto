package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	protected JButton btnFuncionario, btnContinuar;
	protected JLabel lblportada;

	public VentanaPrincipal() {

		setSize(815, 638);
		setTitle("Bosque Farma");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		lblportada = new JLabel();
		ImageIcon imagen = new ImageIcon("Images/inicio.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);

		btnFuncionario = new JButton();
		btnFuncionario.setBounds(40, 526, 200, 33);
		btnFuncionario.setContentAreaFilled(false);
	    btnFuncionario.setBorderPainted(false);

		btnContinuar = new JButton();
		btnContinuar.setBounds(245, 250, 308, 67);
		btnContinuar.setContentAreaFilled(false);
		btnContinuar.setBorderPainted(false);

		add(btnContinuar);
		add(btnFuncionario);
		add(lblportada);

	}

	public JButton getBtnFuncionario() {
		return btnFuncionario;
	}

	public void setBtnFuncionario(JButton btnFuncionario) {
		this.btnFuncionario = btnFuncionario;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}

	public JLabel getLblportada() {
		return lblportada;
	}

	public void setLblportada(JLabel lblportada) {
		this.lblportada = lblportada;
	}

}
