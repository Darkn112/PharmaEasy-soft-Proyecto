package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class FuncionarioDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int cedula;
	private String contraseña;
	private String correo;
	
	public FuncionarioDTO(String nombre, int cedula, String contraseña, String correo) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.contraseña = contraseña;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Funcionario\n Nombre = " + nombre + "\n Cedula = " + cedula +"\n Correo = "
				+ correo +"\n";
	}

}
