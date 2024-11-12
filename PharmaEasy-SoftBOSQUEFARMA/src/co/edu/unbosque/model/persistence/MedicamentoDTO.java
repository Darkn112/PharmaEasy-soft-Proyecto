package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class MedicamentoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int cantidad;
	private int codigo;
	private int cantidadExpedida;
	
	public MedicamentoDTO(String nombre, int cantidad, int codigo, int cantidadExpedida) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.codigo = codigo;
		this.cantidadExpedida = cantidadExpedida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidadExpedida() {
		return cantidadExpedida;
	}

	public void setCantidadExpedida(int cantidadExpedida) {
		this.cantidadExpedida = cantidadExpedida;
	}

	@Override
	public String toString() {
		return "Medicamento\n Nombre = " + nombre + "\n Cantidad = " + cantidad + "\n Codigo = " + codigo + "\n";
	}

}
