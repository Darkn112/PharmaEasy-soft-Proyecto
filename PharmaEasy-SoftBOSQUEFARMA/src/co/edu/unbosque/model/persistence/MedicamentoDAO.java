package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.Comparator;

public class MedicamentoDAO implements CRUDOperation<MedicamentoDTO> {

	private ArrayList<MedicamentoDTO> listaMedicamentos;
	private final String SERIAL_NAME = "medicamentos.dat";

	public MedicamentoDAO() {
		listaMedicamentos = new ArrayList<>();
		FileHandler.checkFolder();
		readSerialized();
	}

	@Override
	public String showAll() {
		int num = 1;
		String contenido = "";
		if (listaMedicamentos.isEmpty()) {
			return null;
		} else {
			for (MedicamentoDTO m : listaMedicamentos) {
				contenido += "" + num + ". " + m.toString() + "\n";
				num++;
			}
			return contenido;
		}
	}

	@Override
	public ArrayList<MedicamentoDTO> getAll() {
		return listaMedicamentos;
	}

	@Override
	public boolean add(MedicamentoDTO newData) 
	{
		if (find(newData) == null) 
		{
			listaMedicamentos.add(newData);
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int index) {

		if (index <= listaMedicamentos.size() && index > 0) {
			listaMedicamentos.remove(index - 1);
			writeSerialized();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public MedicamentoDTO find(MedicamentoDTO toFind) {
	    for (MedicamentoDTO m : listaMedicamentos) {
	        if (m.getCodigo() == toFind.getCodigo()) {
	            return m;
	        }
	    }
	    return null;
	}

	@Override
	public boolean update(int index, MedicamentoDTO newData) {

		if (index <= listaMedicamentos.size() && index > 0) {
			listaMedicamentos.remove(index-1);
			listaMedicamentos.add(index-1, newData);
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	public boolean verificarCodigoMedicamento(int codigoMedicamento) {
	    for (MedicamentoDTO m : listaMedicamentos) {
	        if (m.getCodigo() == codigoMedicamento) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public String expedirMedicamento(int codigoMedicamento, int cantidad) {

		if (!listaMedicamentos.isEmpty()) {
			for (MedicamentoDTO m : listaMedicamentos) {
				if (m.getCodigo() == codigoMedicamento) {
					m.setCantidad(m.getCantidad() - cantidad);
					writeSerialized();
					return m.getNombre();
				}
			}
		}
		return null;

	}
	
	public boolean verificarCantidad(int cantidad, int codigo) {
	    for (MedicamentoDTO m : listaMedicamentos) {
	        if (m.getCodigo() == codigo && cantidad > m.getCantidad()) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public int getCantidadExpedidaMed(String nombre) {
	    for (MedicamentoDTO medicamentoDTO : listaMedicamentos) {
	        if (medicamentoDTO.getNombre().equals(nombre)) {
	            return medicamentoDTO.getCantidadExpedida();
	        }
	    }
	    return 0;
	}
	
	public void medExpedidoPorNombre(String nombre, int cantidad)
	{
		for (MedicamentoDTO medicamentoDTO : listaMedicamentos) {
			
			if(medicamentoDTO.getNombre().equals(nombre))
			{
				medicamentoDTO.setCantidadExpedida(medicamentoDTO.getCantidadExpedida()+cantidad);
				writeSerialized();
			}
		}
	}
	
	public String listaMedicamentosExpedidosPorNombre() {
		int num = 1;
		String contenido = "";
		if (listaMedicamentos.isEmpty()) {
			return null;
		} else {
			for (MedicamentoDTO m : listaMedicamentos) {
				contenido += "" + num + ". " + m.getNombre() + " = "+ m.getCantidadExpedida()+ "\n";
				num++;
			}
			return contenido;
		}
	}
	
	public String topMedicamentos()
	{
		//Se trae la lista de medicamentos
		ArrayList<MedicamentoDTO> listaOrdenada = new ArrayList<>(listaMedicamentos);
		
		//Se crea un comparador que usa el método getCantidadExpedida para comparar los valores de tipo int
		//Y se invierte el orden para que quede de mayor a menor
		listaOrdenada.sort(Comparator.comparingInt(MedicamentoDTO::getCantidadExpedida).reversed());
		
		//Se determina el límite de iteraciones (máximo 5 o el tamaño de la lista si es menor)
		int limite = Math.min(5, listaOrdenada.size()); 
		
		String contenido = "";
		 for (int i = 0; i < limite; i++) {
		        MedicamentoDTO m = listaOrdenada.get(i);
		        contenido += " " + (i+1) + ". " + m.getNombre() + " = " + m.getCantidadExpedida() + "\n";
		    }
		return contenido;
	}

	public void writeSerialized() {

		FileHandler.writeSerialized(SERIAL_NAME, listaMedicamentos);

	}

	public void readSerialized() {

		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {

			listaMedicamentos = new ArrayList<>();

		} else {

			listaMedicamentos = (ArrayList<MedicamentoDTO>) content;

		}
	}
}
