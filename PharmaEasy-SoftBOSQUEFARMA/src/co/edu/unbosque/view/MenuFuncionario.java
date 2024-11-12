package co.edu.unbosque.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuFuncionario extends JFrame {
	
	protected JLabel lblportada;
	protected JButton btnagregar, btnmostrar, btneliminar, btnactualizar, btnvolver, btnopciones;

	public MenuFuncionario() {
		
		setSize(815, 638);
		setTitle("Bosque Farma");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		lblportada = new JLabel();
		ImageIcon imagen = new ImageIcon("Images/menufuncionarios.png");
		Image redimensionado = imagen.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		lblportada.setIcon(new ImageIcon(redimensionado));
		lblportada.setBounds(0, 0, 800, 600);
		
		btnagregar = new JButton();
		btnagregar.setBounds(70, 230, 310, 60);
		btnagregar.setContentAreaFilled(false);
	    btnagregar.setBorderPainted(false);
		
		btnactualizar = new JButton();
		btnactualizar.setBounds(423, 230, 305, 60);
		btnactualizar.setContentAreaFilled(false);
	    btnactualizar.setBorderPainted(false);
		
		btneliminar = new JButton();
		btneliminar.setBounds(70, 342, 315, 60);
		btneliminar.setContentAreaFilled(false);
	    btneliminar.setBorderPainted(false);
		
		btnmostrar = new JButton();
		btnmostrar.setBounds(422, 342, 317, 60);
		btnmostrar.setContentAreaFilled(false);
	    btnmostrar.setBorderPainted(false);
		
		btnvolver = new JButton();
		btnvolver.setBounds(65, 485, 162, 50);
		btnvolver.setContentAreaFilled(false);
	    btnvolver.setBorderPainted(false);
	    
	    btnopciones = new JButton();
		btnopciones.setBounds(505, 478, 226, 54);
		btnopciones.setContentAreaFilled(false);
	    btnopciones.setBorderPainted(false);
		
		add(btnopciones);
		add(btnagregar);
		add(btnactualizar);
		add(btneliminar);
		add(btnmostrar);
		add(btnvolver);
		add(lblportada);
	}

	public JLabel getLblportada() {
		return lblportada;
	}

	public void setLblportada(JLabel lblportada) {
		this.lblportada = lblportada;
	}

	public JButton getBtnagregar() {
		return btnagregar;
	}

	public void setBtnagregar(JButton btnagregar) {
		this.btnagregar = btnagregar;
	}

	public JButton getBtnmostrar() {
		return btnmostrar;
	}

	public void setBtnmostrar(JButton btnmostrar) {
		this.btnmostrar = btnmostrar;
	}

	public JButton getBtneliminar() {
		return btneliminar;
	}

	public void setBtneliminar(JButton btneliminar) {
		this.btneliminar = btneliminar;
	}

	public JButton getBtnactualizar() {
		return btnactualizar;
	}

	public void setBtnactualizar(JButton btnactualizar) {
		this.btnactualizar = btnactualizar;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

	public JButton getBtnopciones() {
		return btnopciones;
	}

	public void setBtnopciones(JButton btnopciones) {
		this.btnopciones = btnopciones;
	}
	
}
