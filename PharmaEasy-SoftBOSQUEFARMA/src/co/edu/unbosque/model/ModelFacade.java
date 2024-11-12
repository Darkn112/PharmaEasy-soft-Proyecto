package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FuncionarioDAO;
import co.edu.unbosque.model.persistence.MedicamentoDAO;
import co.edu.unbosque.model.persistence.PacienteDAO;
import co.edu.unbosque.model.persistence.TurnoDAO;

public class ModelFacade {
	
	private FuncionarioDAO fd;
	private MedicamentoDAO md;
	private PacienteDAO pd;
	private TurnoDAO td;
	
	public ModelFacade() {
		
		fd = new FuncionarioDAO();
		md = new MedicamentoDAO();
		pd = new PacienteDAO();
		td = new TurnoDAO();
	}

	public PacienteDAO getPd() {
		return pd;
	}

	public void setPd(PacienteDAO pd) {
		this.pd = pd;
	}

	public TurnoDAO getTd() {
		return td;
	}

	public void setTd(TurnoDAO td) {
		this.td = td;
	}

	public MedicamentoDAO getMd() {
		return md;
	}

	public void setMd(MedicamentoDAO md) {
		this.md = md;
	}

	public FuncionarioDAO getFd() {
		return fd;
	}

	public void setFd(FuncionarioDAO fd) {
		this.fd = fd;
	}

	
}
