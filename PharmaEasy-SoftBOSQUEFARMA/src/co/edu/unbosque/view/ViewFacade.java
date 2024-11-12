package co.edu.unbosque.view;

public class ViewFacade {
	
	private VentanaPrincipal vp;
	private MenuFuncionario mf;
	private MenuPaciente mp;
	private VentanaAgregarFuncionario vaf;
	private VentanaMostrarFuncionario vmf;
	private ViewConsole vc;
	private VentanaActualizarFuncionario vacf;
	private VentanaEliminarFuncionario vef;
	private VentanaInicioSesionFuncionario visf;
	private VentanaInvEst vie;
	private VentanaInventario vi;
	private VentanaEstadisticas ve;
	private VentanaAgregarMedicamento vam;
	private VentanaActualizarMedicamento vacm;
	private VentanaEliminarMedicamento vem;
	private VentanaMostrarMedicamento vmm;
	private VentanaTurno vt;
	private VentanaExpendioMedicamento vexm;
	
	public ViewFacade() {
		
		vp = new VentanaPrincipal();
		mf = new MenuFuncionario();
		mp = new MenuPaciente();
		vaf = new VentanaAgregarFuncionario();
		vmf = new VentanaMostrarFuncionario();
		vc = new ViewConsole();
		vacf = new VentanaActualizarFuncionario();
		vef = new VentanaEliminarFuncionario();
		visf = new VentanaInicioSesionFuncionario();
		vie = new VentanaInvEst();
		vi = new VentanaInventario();
		ve = new VentanaEstadisticas();
		vam = new VentanaAgregarMedicamento();
		vacm = new VentanaActualizarMedicamento();
		vem = new VentanaEliminarMedicamento();
		vmm = new VentanaMostrarMedicamento();
		vt = new VentanaTurno();
		vexm = new VentanaExpendioMedicamento();
	}

	public VentanaExpendioMedicamento getVexm() {
		return vexm;
	}

	public void setVexm(VentanaExpendioMedicamento vexm) {
		this.vexm = vexm;
	}

	public VentanaTurno getVt() {
		return vt;
	}

	public void setVt(VentanaTurno vt) {
		this.vt = vt;
	}

	public VentanaMostrarMedicamento getVmm() {
		return vmm;
	}

	public void setVmm(VentanaMostrarMedicamento vmm) {
		this.vmm = vmm;
	}

	public VentanaEliminarMedicamento getVem() {
		return vem;
	}

	public void setVem(VentanaEliminarMedicamento vem) {
		this.vem = vem;
	}

	public VentanaActualizarMedicamento getVacm() {
		return vacm;
	}

	public void setVacm(VentanaActualizarMedicamento vacm) {
		this.vacm = vacm;
	}

	public VentanaAgregarMedicamento getVam() {
		return vam;
	}

	public void setVam(VentanaAgregarMedicamento vam) {
		this.vam = vam;
	}

	public VentanaEstadisticas getVe() {
		return ve;
	}

	public void setVe(VentanaEstadisticas ve) {
		this.ve = ve;
	}

	public VentanaInventario getVi() {
		return vi;
	}

	public void setVi(VentanaInventario vi) {
		this.vi = vi;
	}

	public VentanaInvEst getVie() {
		return vie;
	}

	public void setVie(VentanaInvEst vie) {
		this.vie = vie;
	}

	public VentanaInicioSesionFuncionario getVisf() {
		return visf;
	}

	public void setVisf(VentanaInicioSesionFuncionario visf) {
		this.visf = visf;
	}

	public VentanaEliminarFuncionario getVef() {
		return vef;
	}

	public void setVef(VentanaEliminarFuncionario vef) {
		this.vef = vef;
	}

	public VentanaActualizarFuncionario getVacf() {
		return vacf;
	}

	public void setVacf(VentanaActualizarFuncionario vacf) {
		this.vacf = vacf;
	}

	public ViewConsole getVc() {
		return vc;
	}

	public void setVc(ViewConsole vc) {
		this.vc = vc;
	}

	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

	public MenuFuncionario getMf() {
		return mf;
	}

	public void setMf(MenuFuncionario mf) {
		this.mf = mf;
	}

	public MenuPaciente getMp() {
		return mp;
	}

	public void setMp(MenuPaciente mp) {
		this.mp = mp;
	}

	public VentanaAgregarFuncionario getVaf() {
		return vaf;
	}

	public void setVaf(VentanaAgregarFuncionario vaf) {
		this.vaf = vaf;
	}

	public VentanaMostrarFuncionario getVmf() {
		return vmf;
	}

	public void setVmf(VentanaMostrarFuncionario vmf) {
		this.vmf = vmf;
	}
	
	

}
