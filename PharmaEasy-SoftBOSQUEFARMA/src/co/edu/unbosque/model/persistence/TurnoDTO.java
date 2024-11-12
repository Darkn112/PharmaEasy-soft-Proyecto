package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class TurnoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int documento;
	private String estado; 
	private int numero;

	public TurnoDTO(int documento, String estado, int numero) {
        this.documento = documento;
        this.estado = estado;
        this.numero = numero;
    }

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Paciente "+documento+" "+estado;
	}
	
}
