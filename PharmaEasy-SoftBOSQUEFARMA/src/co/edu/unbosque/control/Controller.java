package co.edu.unbosque.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.persistence.FuncionarioDTO;
import co.edu.unbosque.model.persistence.MedicamentoDTO;
import co.edu.unbosque.model.persistence.PacienteDTO;
import co.edu.unbosque.model.persistence.TurnoDTO;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {

	private ModelFacade mf;
	private ViewFacade vf;

	public Controller() {

		mf = new ModelFacade();
		vf = new ViewFacade();
		vf.getVp().setVisible(true);
		asignar();
	}

	public void asignar() {
		vf.getVp().getBtnContinuar().addActionListener(this);
		vf.getVp().getBtnContinuar().setActionCommand("continuar");
		vf.getVp().getBtnFuncionario().addActionListener(this);
		vf.getVp().getBtnFuncionario().setActionCommand("funcionarios");
		vf.getMp().getBtnvolver().addActionListener(this);
		vf.getMp().getBtnvolver().setActionCommand("volverdemenupacienteainicio");
		vf.getMp().getBtntomarturno().addActionListener(this);
		vf.getMp().getBtntomarturno().setActionCommand("tomarturno");
		vf.getVisf().getBtnvolver().addActionListener(this);
		vf.getVisf().getBtnvolver().setActionCommand("volverdeiniciosainicio");
		vf.getVisf().getBtnagregar().addActionListener(this);
		vf.getVisf().getBtnagregar().setActionCommand("iniciosesion");
		vf.getMf().getBtnagregar().addActionListener(this);
		vf.getMf().getBtnagregar().setActionCommand("agregarfuncionario");
		vf.getMf().getBtnmostrar().addActionListener(this);
		vf.getMf().getBtnmostrar().setActionCommand("mostrarfuncionario");
		vf.getMf().getBtnactualizar().addActionListener(this);
		vf.getMf().getBtnactualizar().setActionCommand("actualizarfuncionario");
		vf.getMf().getBtneliminar().addActionListener(this);
		vf.getMf().getBtneliminar().setActionCommand("eliminarfuncionario");
		vf.getMf().getBtnvolver().addActionListener(this);
		vf.getMf().getBtnvolver().setActionCommand("volverdemenufuncionarioainiciosesion");
		vf.getVaf().getBtnagregar().addActionListener(this);
		vf.getVaf().getBtnagregar().setActionCommand("menuagregarfuncionario");
		vf.getVaf().getBtnvolver().addActionListener(this);
		vf.getVaf().getBtnvolver().setActionCommand("volverdeagregaramenu");
		vf.getVmf().getBtnvolver().addActionListener(this);
		vf.getVmf().getBtnvolver().setActionCommand("volverdemostraramenu");
		vf.getVacf().getBtnvolver().addActionListener(this);
		vf.getVacf().getBtnvolver().setActionCommand("volverdeactualizaramenu");
		vf.getVacf().getBtnagregar().addActionListener(this);
		vf.getVacf().getBtnagregar().setActionCommand("menuactualizarfuncionario");
		vf.getVef().getBtnvolver().addActionListener(this);
		vf.getVef().getBtnvolver().setActionCommand("volverdeeliminaramenu");
		vf.getVef().getBtneliminar().addActionListener(this);
		vf.getVef().getBtneliminar().setActionCommand("menueliminarfuncionario");
		vf.getMf().getBtnopciones().addActionListener(this);
		vf.getMf().getBtnopciones().setActionCommand("masopciones");
		vf.getVie().getBtnContinuar().addActionListener(this);
		vf.getVie().getBtnContinuar().setActionCommand("inventario");
		vf.getVie().getBtnFuncionario().addActionListener(this);
		vf.getVie().getBtnFuncionario().setActionCommand("estadisticas");
		vf.getVie().getBtnvolver().addActionListener(this);
		vf.getVie().getBtnvolver().setActionCommand("volverdeinvestamenufuncionario");
		vf.getVi().getBtnvolver().addActionListener(this);
		vf.getVi().getBtnvolver().setActionCommand("volverdeinventarioainvest");
		vf.getVi().getBtnagregar().addActionListener(this);
		vf.getVi().getBtnagregar().setActionCommand("agregarmedicamento");
		vf.getVam().getBtnvolver().addActionListener(this);
		vf.getVam().getBtnvolver().setActionCommand("volverdeagregarmedicamentoainventario");
		vf.getVam().getBtnagregar().addActionListener(this);
		vf.getVam().getBtnagregar().setActionCommand("menuagregarmedicamento");
		vf.getVi().getBtnactualizar().addActionListener(this);
		vf.getVi().getBtnactualizar().setActionCommand("actualizarmedicamento");
		vf.getVacm().getBtnvolver().addActionListener(this);
		vf.getVacm().getBtnvolver().setActionCommand("volverdeactualizarmedicamentoainventario");
		vf.getVacm().getBtnagregar().addActionListener(this);
		vf.getVacm().getBtnagregar().setActionCommand("menuactualizarmedicamento");
		vf.getVi().getBtneliminar().addActionListener(this);
		vf.getVi().getBtneliminar().setActionCommand("eliminarmedicamento");
		vf.getVem().getBtnvolver().addActionListener(this);
		vf.getVem().getBtnvolver().setActionCommand("volverdeeliminarmedicamentoainventario");
		vf.getVem().getBtneliminar().addActionListener(this);
		vf.getVem().getBtneliminar().setActionCommand("menueliminarmedicamento");
		vf.getVi().getBtnmostrar().addActionListener(this);
		vf.getVi().getBtnmostrar().setActionCommand("mostrarmedicamento");
		vf.getVmm().getBtnvolver().addActionListener(this);
		vf.getVmm().getBtnvolver().setActionCommand("volverdemostrarmedicamentoainventario");
		vf.getVt().getBtnvolver().addActionListener(this);
		vf.getVt().getBtnvolver().setActionCommand("volverdeiracajaaturnonuevo");
		vf.getVt().getBtntomarturno().addActionListener(this);
		vf.getVt().getBtntomarturno().setActionCommand("iracaja");
		vf.getVexm().getBtnagregar().addActionListener(this);
		vf.getVexm().getBtnagregar().setActionCommand("solicitarmedicamento");
		vf.getVe().getBtnvolver().addActionListener(this);
		vf.getVe().getBtnvolver().setActionCommand("volverdeestadisticasaotrasopciones");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "continuar":
			vf.getMp().setVisible(true);
			vf.getVp().setVisible(false);
			break;
		case "funcionarios":
			vf.getVisf().setVisible(true);
			vf.getVp().setVisible(false);
			break;
		case "volverdemenupacienteainicio":
			vf.getVp().setVisible(true);
			vf.getMp().setVisible(false);
			vf.getMp().getTxtnumdocumento().setText("");
			break;
		case "tomarturno":
			asignarTurno();
			break;
		case "volverdeiniciosainicio":
			vf.getVp().setVisible(true);
			vf.getVisf().setVisible(false);
			vf.getVisf().getTxtcedula().setText("");
			vf.getVisf().getTxtcontraseña().setText("");
			break;
		case "iniciosesion":
			inicioSesion();
			break;
		case "agregarfuncionario":
			vf.getVaf().setVisible(true);
			vf.getMf().setVisible(false);
			break;
		case "mostrarfuncionario":
			vf.getVmf().getTxtacontenido().setText(mf.getFd().showAll());
			vf.getVmf().setVisible(true);
			vf.getMf().setVisible(false);
			break;
		case "actualizarfuncionario":
			vf.getVacf().getTxtacontenido().setText(mf.getFd().showAll());
			vf.getVacf().setVisible(true);
			vf.getMf().setVisible(false);
			break;
		case "eliminarfuncionario":
			vf.getVef().getTxtacontenido().setText(mf.getFd().showAll());
			vf.getVef().setVisible(true);
			vf.getMf().setVisible(false);
			break;
		case "volverdemenufuncionarioainiciosesion":
			vf.getVisf().setVisible(true);
			vf.getMf().setVisible(false);
			break;
		case "menuagregarfuncionario":
			agregarFuncionario();
			break;
		case "volverdeagregaramenu":
			vf.getMf().setVisible(true);
			vf.getVaf().setVisible(false);
			vf.getVaf().getTxtnombre().setText("");
			vf.getVaf().getTxtcedula().setText("");
			vf.getVaf().getTxtcorreo().setText("");
			vf.getVaf().getTxtcontraseña().setText("");
			break;
		case "volverdemostraramenu":
			vf.getMf().setVisible(true);
			vf.getVmf().setVisible(false);
			break;
		case "volverdeactualizaramenu":
			vf.getMf().setVisible(true);
			vf.getVacf().setVisible(false);
			vf.getVacf().getTxtnombre().setText("");
			vf.getVacf().getTxtcedula().setText("");
			vf.getVacf().getTxtcorreo().setText("");
			vf.getVacf().getTxtcontraseña().setText("");
			vf.getVacf().getTxtnumactualizar().setText("");
			break;
		case "menuactualizarfuncionario":
			actualizarFuncionario();
			break;
		case "volverdeeliminaramenu":
			vf.getMf().setVisible(true);
			vf.getVef().setVisible(false);
			vf.getVef().getTxtnumeliminar().setText("");
			break;
		case "menueliminarfuncionario":
			eliminarFuncionario();
			break;
		case "masopciones":
			vf.getVie().setVisible(true);
			vf.getMf().setVisible(false);
			break;
		case "inventario":
			vf.getVi().setVisible(true);
			vf.getVie().setVisible(false);
			break;
		case "estadisticas":
			vf.getVe().getTxtcontenido().setText(mf.getPd().getSize());
			vf.getVe().getTxtacontenido().setText(mf.getMd().listaMedicamentosExpedidosPorNombre());
			vf.getVe().getTxtacontenido2().setText(mf.getMd().topMedicamentos());
			vf.getVe().setVisible(true);
			vf.getVie().setVisible(false);
			break;
		case "volverdeinvestamenufuncionario":
			vf.getMf().setVisible(true);
			vf.getVie().setVisible(false);
			break;
		case "volverdeinventarioainvest":
			vf.getVie().setVisible(true);
			vf.getVi().setVisible(false);
			break;
		case "agregarmedicamento":
			vf.getVam().setVisible(true);
			vf.getVi().setVisible(false);
			break;
		case "volverdeagregarmedicamentoainventario":
			vf.getVi().setVisible(true);
			vf.getVam().setVisible(false);
			vf.getVam().getTxtnombre().setText("");
			vf.getVam().getTxtcedula().setText("");
			vf.getVam().getTxtcorreo().setText("");
			break;
		case "menuagregarmedicamento":
			agregarMedicamento();
			break;
		case "actualizarmedicamento":
			vf.getVacm().getTxtacontenido().setText(mf.getMd().showAll());
			vf.getVacm().setVisible(true);
			vf.getVi().setVisible(false);
			break;
		case "volverdeactualizarmedicamentoainventario":
			vf.getVi().setVisible(true);
			vf.getVacm().setVisible(false);
			vf.getVacm().getTxtnombre().setText("");
			vf.getVacm().getTxtcedula().setText("");
			vf.getVacm().getTxtcorreo().setText("");
			vf.getVacm().getTxtnumactualizar().setText("");
			break;
		case "menuactualizarmedicamento":
			actualizarMedicamento();
			break;
		case "eliminarmedicamento":
			vf.getVem().getTxtacontenido().setText(mf.getMd().showAll());
			vf.getVem().setVisible(true);
			vf.getVi().setVisible(false);
			break;
		case "volverdeeliminarmedicamentoainventario":
			vf.getVi().setVisible(true);
			vf.getVem().setVisible(false);
			vf.getVem().getTxtnumeliminar().setText("");
			break;
		case "menueliminarmedicamento":
			eliminarMedicamento();
			break;
		case "mostrarmedicamento":
			vf.getVmm().getTxtacontenido().setText(mf.getMd().showAll());
			vf.getVmm().setVisible(true);
			vf.getVi().setVisible(false);
			break;
		case "volverdemostrarmedicamentoainventario":
			vf.getVi().setVisible(true);
			vf.getVmm().setVisible(false);
			break;
		case "volverdeiracajaaturnonuevo":
			vf.getMp().setVisible(true);
			vf.getVt().setVisible(false);
			break;
		case "iracaja":
			vf.getVexm().getTxtturno().setText("Turno " +mf.getTd().getAll().get(0).getNumero());
			vf.getVexm().setVisible(true);
			vf.getVt().setVisible(false);
			break;
		case "solicitarmedicamento":
			solicitarMedicamento();
			vf.getVt().getTxtacontenido().setText(mf.getTd().showAll());
			break;
		case"volverdeestadisticasaotrasopciones":
			vf.getVie().setVisible(true);
			vf.getVe().setVisible(false);
			break;
		}

	}

	public void agregarFuncionario() {

		//Se almacena lo que este en los campos de texto
		String nombre = vf.getVaf().getTxtnombre().getText();
		String correo = vf.getVaf().getTxtcorreo().getText();
		String contraseña = vf.getVaf().getTxtcontraseña().getText();
		String cedulatexto = vf.getVaf().getTxtcedula().getText();

		//Se verfica que todos los campos se llenaron
		if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || cedulatexto.isEmpty()) {
			vf.getVc().mostrarResultados("Se deben llenar todos los espacios");
			return;
		}

		//Se verifica que el nombre solo contenga letras
		if (!nombre.matches("[a-zA-Z\\s]+")) {
			vf.getVc().mostrarResultados("El nombre debe contener solo letras y espacios");
			return;
		}

		//Se verifica que la cedula sea numeros
		try {
			int cedula = Integer.parseInt(cedulatexto);
			
			//Se verifica que la cedula no sea negativa
			if(cedula<=0)
			{
				vf.getVc().mostrarResultados("La cédula no puede ser negativa o 0");
				return;
			}
			
			//Se verifica si la cedula ingresada ya existe sino se agrega el funcionario
			boolean confirmar = mf.getFd().add(new FuncionarioDTO(nombre, cedula, contraseña, correo));
			if (confirmar) {
				vf.getVc().mostrarResultados("Funcionario agregado exitosamente");
			} else {
				vf.getVc().mostrarResultados("El funcionario ya existe");
			}

		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Ingrese únicamente números en su Cédula");
			return;
		}
		
		//Se limpian los campos de texto
		vf.getVaf().getTxtnombre().setText("");
		vf.getVaf().getTxtcedula().setText("");
		vf.getVaf().getTxtcorreo().setText("");
		vf.getVaf().getTxtcontraseña().setText("");
	}

	public void agregarMedicamento() {
		
		//Se almacena lo que este en los campos de texto
		String nombre = vf.getVam().getTxtnombre().getText();
		String cantidadtexto = vf.getVam().getTxtcedula().getText();
		String codigotexto = vf.getVam().getTxtcorreo().getText();
		
        //Se verifica que se llenaron todos los campos
		if (nombre.isEmpty() || cantidadtexto.isEmpty() || codigotexto.isEmpty()) {
			vf.getVc().mostrarResultados("Se deben llenar todos los espacios");
			return;
		}
		
        //Se verifica que el nombre solo sean letras 
		if (!nombre.matches("[a-zA-Z\\s]+")) {
			vf.getVc().mostrarResultados("El nombre debe contener solo letras y espacios");
			return;
		}

		//Se verifica que la cantidad y el codigo sean numeros
		try {
			int cantidad = Integer.parseInt(cantidadtexto);
			int codigo = Integer.parseInt(codigotexto);
			
			//Se verifica que la cantidad sea mayor a 0
			if(cantidad<=0)
			{
				vf.getVc().mostrarResultados("La cantidad debe ser mayor a 0");
				return;
			}
			
			//Se verifica que la codigo sea mayor a 0
			if(codigo<=0)
			{
				vf.getVc().mostrarResultados("La código debe ser mayor a 0");
				return;
			}
			
			//Se verifica que el codigo no exista y se agrega el medicamento
			boolean confirmar = mf.getMd().add(new MedicamentoDTO(nombre, cantidad, codigo, 0));
			if (confirmar) {
				vf.getVc().mostrarResultados("Medicamento agregado exitosamente");
			} else {
				vf.getVc().mostrarResultados("El medicamento ya existe");
			}

		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Ingrese únicamente números en la cantidad y el código");
			return;
		}
		
		//Se limpian los campos de texto
		vf.getVam().getTxtnombre().setText("");
		vf.getVam().getTxtcedula().setText("");
		vf.getVam().getTxtcorreo().setText("");
	}

	public void actualizarFuncionario() {
		
		//Se alamacena lo que este en los campos de texto
		String nombre = vf.getVacf().getTxtnombre().getText();
		String contraseña = vf.getVacf().getTxtcontraseña().getText();
		String correo = vf.getVacf().getTxtcorreo().getText();
		String cedulatexto = vf.getVacf().getTxtcedula().getText();
		String numactualizartexto = vf.getVacf().getTxtnumactualizar().getText();
		
		//Se verifica que se llenen todos los espacios
		if (nombre.isEmpty() || contraseña.isEmpty() || correo.isEmpty() || cedulatexto.isEmpty()
				|| numactualizartexto.isEmpty()) {
			vf.getVc().mostrarResultados("Se deben llenar todos los espacios");
			return;
		}

		//Se verifica que el nombre solo contenga letras
		if (!nombre.matches("[a-zA-Z\\s]+")) {
			vf.getVc().mostrarResultados("El nombre debe contener solo letras y espacios");
			return;
		}

		//Se verifica que la cedula y el numero a actualizar sean números
		try {
			int numeroActualizar = Integer.parseInt(numactualizartexto);
			int cedula = Integer.parseInt(cedulatexto);
			
			//Se verifica que la celula no sea negativa
			if(cedula<=0)
			{
				vf.getVc().mostrarResultados("La cédula debe ser mayor a 0");
				return;
			}

			//Se verifica que el numero a actualizar exista y se actualiza el funcionario
			boolean confirmar = mf.getFd().update(numeroActualizar,new FuncionarioDTO(nombre, cedula, contraseña, correo));
			if (confirmar) {
				vf.getVc().mostrarResultados("Funcionario actualizado exitosamente");
				vf.getVacf().getTxtacontenido().setText(mf.getFd().showAll());
			} else {
				vf.getVc().mostrarResultados("El número de funcionario a actualizar no existe");
				return;
			}
		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Cédula o número a actualizar incorrecto\nIntente de nuevo");
			return;
		}
		
		//Se limpian los campos de texto
		vf.getVacf().getTxtnombre().setText("");
		vf.getVacf().getTxtcedula().setText("");
		vf.getVacf().getTxtcorreo().setText("");
		vf.getVacf().getTxtcontraseña().setText("");
		vf.getVacf().getTxtnumactualizar().setText("");
	}

	public void actualizarMedicamento() {
		
		//Se almacena lo que este en los campos de texto
		String nombre = vf.getVacm().getTxtnombre().getText();
		String cantidadtexto = vf.getVacm().getTxtcedula().getText();
		String codigotexto = vf.getVacm().getTxtcorreo().getText();
		String numactualizartexto = vf.getVacm().getTxtnumactualizar().getText();

		//Se verifica que se llenen todos los campos
		if (nombre.isEmpty() || cantidadtexto.isEmpty() || codigotexto.isEmpty() || numactualizartexto.isEmpty()) {
			vf.getVc().mostrarResultados("Se deben llenar todos los espacios");
			return;
		}

		//Se verifica que el nombre solo contenga letras
		if (!nombre.matches("[a-zA-Z\\s]+")) {
			vf.getVc().mostrarResultados("El nombre debe contener solo letras y espacios");
			return;
		}
		
		//Se verifica que la cantidad, codigo y numero a actualizar sean numeros
		try {
			int cantidad = Integer.parseInt(cantidadtexto);
			int codigo = Integer.parseInt(codigotexto);
			int numactualizar = Integer.parseInt(numactualizartexto);
			
			//Se verifica que la cantidad sea mayor a 0
			if(cantidad<=0)
			{
				vf.getVc().mostrarResultados("La cantidad debe ser mayor a 0");
				return;
			}
			
			//Se verifica que el codigo sea mayor a 0
			if(codigo<=0)
			{
				vf.getVc().mostrarResultados("El código debe ser mayor a 0");
				return;
			}
			
			//Se verifica si el nombre del medicamento existe en ese caso se almacena la cantidad de veces que se ha expedido
			int cantidadExpedidaMed = mf.getMd().getCantidadExpedidaMed(nombre);
			
			//Se verifica que el numero a actualizar exista y se actualiza el medicamento
			boolean confirmar = mf.getMd().update(numactualizar, new MedicamentoDTO(nombre, cantidad, codigo, cantidadExpedidaMed));
			if (confirmar) {
				vf.getVc().mostrarResultados("Medicamento actualizado exitosamente");
				vf.getVacm().getTxtacontenido().setText(mf.getMd().showAll());
			} else {
				vf.getVc().mostrarResultados("El número de medicamento a actualizar no existe");
				return;
			}

		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Cantidad, código o número a actualizar incorrecto\nIntente de nuevo");
			return;
		}
		
		//Se limpian los campos
		vf.getVacm().getTxtnombre().setText("");
		vf.getVacm().getTxtcedula().setText("");
		vf.getVacm().getTxtcorreo().setText("");
		vf.getVacm().getTxtnumactualizar().setText("");

	}

	public void eliminarFuncionario() {
		
		//Se alamacena lo que este en el campo
		String numeliminartexto = vf.getVef().getTxtnumeliminar().getText();
		
		//Se verifica que se haya llenado
		if (numeliminartexto.isEmpty()) {
			vf.getVc().mostrarResultados("Se debe indicar el funcionario que se desea eliminar");
			return;
		}
		
		//Se verifica que sea un numero
		try {
			int numeliminar = Integer.parseInt(numeliminartexto);
			
			//Se verifica que le numero a eliminar existe y se elimina
			boolean confirmar = mf.getFd().delete(numeliminar);
			if (confirmar) {
				vf.getVc().mostrarResultados("Funcionario eliminado exitosamente");
				vf.getVef().getTxtacontenido().setText(mf.getFd().showAll());
			} else {
				vf.getVc().mostrarResultados("El número de funcionario a eliminar no existe");
			}
		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Se debe digitar un número\nIntente de nuevo");
		}
		
		//Se limpia el campo
		vf.getVef().getTxtnumeliminar().setText("");
	}

	public void eliminarMedicamento() {
		
		//Se almacena lo que este en el campo
		String numeliminartexto = vf.getVem().getTxtnumeliminar().getText();
		
		//Se verifica que no este vacio
		if (numeliminartexto.isEmpty()) {
			vf.getVc().mostrarResultados("Se debe indicar el medicamento que se desea eliminar");
			return;
		}
		
		//Se verifica que sea un numero
		try {
			int numeliminar = Integer.parseInt(numeliminartexto);
			
			//Se verifica que el numero a eliminar exista y se elimina
			boolean confirmar = mf.getMd().delete(numeliminar);
			if (confirmar) {
				vf.getVc().mostrarResultados("Medicamento eliminado exitosamente");
				vf.getVem().getTxtacontenido().setText(mf.getMd().showAll());
			} else {
				vf.getVc().mostrarResultados("El número de medicamento a eliminar no existe");
			}
		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Se debe digitar un número\nIntente de nuevo");
		}
		
		//Se limpia el campo
		vf.getVem().getTxtnumeliminar().setText("");
	}

	public void inicioSesion() {
		
		//Se almacena lo que este en los campos
		String cedulatexto = vf.getVisf().getTxtcedula().getText();
		String contraseña = vf.getVisf().getTxtcontraseña().getText();

		//Se verifica que los campos esten llenos
		if (cedulatexto.isEmpty() || contraseña.isEmpty()) {
			vf.getVc().mostrarResultados("Se deben llenar todos los espacios");
			return;
		}

		//Se verifica que la cedula sea un numero
		try {
			int cedula = Integer.parseInt(cedulatexto);
			
			//Se verifica que la cedula no sea negativa
			if(cedula<=0)
			{
				vf.getVc().mostrarResultados("La cédula debe ser mayor a 0");
				return;
			}
			
			//Se trae la lista de funcionarios
			ArrayList<FuncionarioDTO> listaFuncionarios = mf.getFd().getAll();
			
			//Se itera en la lista para ver si existe un funcionario con esa cedula y contraseña
			boolean encontrado = false;
			for (FuncionarioDTO f : listaFuncionarios) {
				if (f.getCedula() == cedula && f.getContraseña().equals(contraseña)) {
					vf.getMf().setVisible(true);
					vf.getVisf().setVisible(false);
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				vf.getVc().mostrarResultados("Cédula o contraseña incorrectas");
				return;
			}

		} catch (NumberFormatException e) {
			vf.getVc().mostrarResultados("Ingrese únicamente números en su Cédula");
			return;
		}
		
		//Se limpian los espacios
		vf.getVisf().getTxtcedula().setText("");
		vf.getVisf().getTxtcontraseña().setText("");

	}
	
	public void asignarTurno()
	{
		//Se almacena lo que este en el campo de texto
		String documentotexto = vf.getMp().getTxtnumdocumento().getText();
		
		//Se verifica si se lleno el campo
		if(documentotexto.isEmpty())
		{
			vf.getVc().mostrarResultados("Se debe digitar el documento");
			return;
		}
		
		//Se verifica que el documento sea un numero
		try
		{
			int documento = Integer.parseInt(documentotexto);
			
			//Se verifica que el documento sea mayor a 0
			if(documento<=0)
			{
				vf.getVc().mostrarResultados("El documento no puede ser negativo o 0");
				return;
			}
			
			//El numero del turno va a ser el numero del ultimo turno mas 1
			int tamaño = mf.getTd().getSize();
			int numConsecutivo = 0;
			if(tamaño!=0)
			{
				numConsecutivo = mf.getTd().getAll().get(tamaño-1).getNumero();	
			}else
			{
				numConsecutivo = tamaño;
			}
			int numero =numConsecutivo+1;
			
			//Si no existe un turno con ese documento se crea un nuevo turno
			boolean confirmar = mf.getTd().add(new TurnoDTO(documento, "por atender", numero));
			if(confirmar)
			{
				vf.getVc().mostrarResultados("Turno "+numero);
				vf.getVt().getTxtacontenido().setText(mf.getTd().showAll());
				vf.getVt().setVisible(true);
				vf.getMp().setVisible(false);
			}else
			{
				vf.getVc().mostrarResultados("El paciente ya tiene un turno asignado");
			}
		}catch(NumberFormatException e)
		{
			vf.getVc().mostrarResultados("Ingresar únicamente números en el documento");
			return;
		}
		
		//Se deja el campo de texto en blanco
		vf.getMp().getTxtnumdocumento().setText("");
	}
	
	public void solicitarMedicamento()
	{
		//Se almacena lo que este en los campos de texto
		String documentotexto = vf.getVexm().getTxtnombre().getText();
		String codigoEntidadtexto = vf.getVexm().getTxtcedula().getText();
		String codigoMedicamentotexto = vf.getVexm().getTxtcorreo().getText();
		String cantidadtexto = vf.getVexm().getTxtcontraseña().getText();
		
		//Se verifica que todos los campos esten llenos
		if(documentotexto.isEmpty()||codigoEntidadtexto.isEmpty()||codigoMedicamentotexto.isEmpty()||cantidadtexto.isEmpty())
		{
			vf.getVc().mostrarResultados("Se deben llenar todos los espacios");
			return;
		}
		
		//Se verifica que en todos los campos se haya ingresado números
		try
		{
			int documento = Integer.parseInt(documentotexto);
			int codigoEntidad = Integer.parseInt(codigoEntidadtexto);
			int codigoMedicamento = Integer.parseInt(codigoMedicamentotexto);
			int cantidad = Integer.parseInt(cantidadtexto);
			
			//Se verifica que los numeros en los espacios sean mayores a 0
			if(documento<=0)
			{
				vf.getVc().mostrarResultados("El documento no puede ser negativo o 0");
				return;
			}
			
			if(codigoEntidad<=0)
			{
				vf.getVc().mostrarResultados("El código de la entidad no puede ser negativo o 0");
				return;
			}
			
			//Se verifica si el documento del paciente corresponde al documento del turno actual
			int docArray = mf.getTd().getAll().get(0).getDocumento();
			
			if(documento != docArray)
			{
				vf.getVc().mostrarResultados("El documento no corresponde al turno actual");
				return;
			}
			
			//Se verifica que la cantidad de medicamento solicitado sea un número mayor a cero
			if(cantidad<=0)
			{
				vf.getVc().mostrarResultados("Ingrese una cantidad mayor a cero");
				return;
			}
			
			//Se verifica si el codigo del medicamento es correto o si existe tal medicamento
			if(!mf.getMd().verificarCodigoMedicamento(codigoMedicamento))
			{
				vf.getVc().mostrarResultados("Código de medicamento incorrecto o no existe medicamento");
				return;
			}
			
			//Se verifica que haya la cantidad de medicamento solicitado de acuerdo al código del medicamento
			if(mf.getMd().verificarCantidad(cantidad, codigoMedicamento))
			{
				vf.getVc().mostrarResultados("La cantidad excede las existencias");
				return;
			}
			
			//Se agrega un paciente y se expide el medicamento solicitado	
				mf.getPd().add(new PacienteDTO(documento, codigoEntidad, codigoMedicamento, cantidad));
				expedirMedicamento(codigoMedicamento, cantidad);
			
		}catch(NumberFormatException e)
		{
			vf.getVc().mostrarResultados("Digite únicamente números en todas las opciones");
			return;
		}
		
		//Se dejan los campos de texto en blanco 
		vf.getVexm().getTxtnombre().setText("");
		vf.getVexm().getTxtcedula().setText("");
		vf.getVexm().getTxtcorreo().setText("");
		vf.getVexm().getTxtcontraseña().setText("");
	}
	
	public void expedirMedicamento(int codigoMedicamento, int cantidad)
	{
		//Se actualizan existencias del medicamento
		String nombreMed = mf.getMd().expedirMedicamento(codigoMedicamento, cantidad);
		if(nombreMed != null)
		{
			//Se cambia el estado atendido
			mf.getTd().getAll().get(0).setEstado("atendido");
			vf.getVexm().getTxtturno().setText("Turno " +mf.getTd().getAll().get(0).getNumero()
					+" "+ mf.getTd().getAll().get(0).getEstado());
			
			vf.getVc().mostrarResultados(" Medicamento: " + nombreMed+"\n Cantidad: " + cantidad
					+"\n Medicamento expedido exitosamente");
			
			//Se verifica que el turno este atendido y se borra de la lista de turnos
			mf.getTd().delete(1);
			
			//Se verifica si hay mas turnos en la lista o no
			boolean verificarTurnos = mf.getTd().verificarTurnos();
			
			if(verificarTurnos)
			{
				vf.getVt().setVisible(true);
				vf.getVexm().setVisible(false);
			}else
			{
				vf.getMp().setVisible(true);
				vf.getVexm().setVisible(false);
			}
		}
		
		//Estadisticas
	    mf.getMd().medExpedidoPorNombre(nombreMed, cantidad);
	}

}