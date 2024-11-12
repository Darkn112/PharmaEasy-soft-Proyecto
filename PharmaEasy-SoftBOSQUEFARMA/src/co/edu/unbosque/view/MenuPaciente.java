package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuPaciente extends JFrame{
	
	protected JLabel lblportada;
	protected JTextField txtnumdocumento;
	protected JButton btnvolver, btntomarturno;
	
	public MenuPaciente() {
		
		setSize(815, 638);
		setTitle("Bosque Farma");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		lblportada = new JLabel();
		ImageIcon imagen = new ImageIcon("Images/menupaciente.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		txtnumdocumento = new JTextField(10);
		txtnumdocumento.setBounds(155, 330, 400, 25);
		txtnumdocumento.setFont(new Font("Candara", Font.PLAIN, 18));
		
		btnvolver = new JButton();
		btnvolver.setBounds(82, 495, 152, 50);
		btnvolver.setContentAreaFilled(false);
	    btnvolver.setBorderPainted(false);
	    
	    btntomarturno = new JButton();
		btntomarturno.setBounds(432, 492, 295, 55);
		btntomarturno.setContentAreaFilled(false);
	    btntomarturno.setBorderPainted(false);
		
		add(btnvolver);
		add(btntomarturno);
		add(txtnumdocumento);
		add(lblportada);
	}

	public JLabel getLblportada() {
		return lblportada;
	}

	public void setLblportada(JLabel lblportada) {
		this.lblportada = lblportada;
	}

	public JTextField getTxtnumdocumento() {
		return txtnumdocumento;
	}

	public void setTxtnumdocumento(JTextField txtnumdocumento) {
		this.txtnumdocumento = txtnumdocumento;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

	public JButton getBtntomarturno() {
		return btntomarturno;
	}

	public void setBtntomarturno(JButton btntomarturno) {
		this.btntomarturno = btntomarturno;
	}

}
