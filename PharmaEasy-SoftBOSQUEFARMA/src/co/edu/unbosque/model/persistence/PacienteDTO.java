package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class PacienteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int documento;
	private int codigoEntidad;
	private int codigoMedicamento;
	private int cantidadMedicamento;
	
	public PacienteDTO(int documento, int codigoEntidad, int codigoMedicamento, int cantidadMedicamento) {
		super();
		this.documento = documento;
		this.codigoEntidad = codigoEntidad;
		this.codigoMedicamento = codigoMedicamento;
		this.cantidadMedicamento = cantidadMedicamento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getCodigoEntidad() {
		return codigoEntidad;
	}

	public void setCodigoEntidad(int codigoEntidad) {
		this.codigoEntidad = codigoEntidad;
	}

	public int getCodigoMedicamento() {
		return codigoMedicamento;
	}

	public void setCodigoMedicamento(int codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}

	public int getCantidadMedicamento() {
		return cantidadMedicamento;
	}

	public void setCantidadMedicamento(int cantidadMedicamento) {
		this.cantidadMedicamento = cantidadMedicamento;
	}

	@Override
	public String toString() {
		return "Paciente\n Documento = " + documento + "\n Código de la Entidad = " + codigoEntidad +
				"\n Código del Medicamento = " + codigoMedicamento + "\n Cantidad de Medicamento = " 
				+ cantidadMedicamento;
	}

}
