package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class PacienteDAO implements CRUDOperation<PacienteDTO> {

	private ArrayList<PacienteDTO> listaPacientes;
	private final String SERIAL_NAME = "pacientes.dat";

	public PacienteDAO() {
		listaPacientes = new ArrayList<>();
		FileHandler.checkFolder();
		readSerialized();
	}

	@Override
	public String showAll() {

		int num = 1;
		String contenido = "";
		if (listaPacientes.isEmpty()) {
			return null;
		} else {
			for (PacienteDTO p : listaPacientes) {
				contenido += " " + num + ". " + p.toString() + "\n";
				num++;
			}
			return contenido;
		}
	}

	@Override
	public ArrayList<PacienteDTO> getAll() {
		return listaPacientes;
	}

	@Override
	public boolean add(PacienteDTO newData) {

		listaPacientes.add(newData);
		writeSerialized();
		return true;

	}

	@Override
	public boolean delete(int index) {

		if (index <= listaPacientes.size() && index > 0) {
			listaPacientes.remove(index - 1);
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public PacienteDTO find(PacienteDTO toFind) {
		for (PacienteDTO p : listaPacientes) {
			if (p.getDocumento() == toFind.getDocumento()) {
					return p;
				} 
		}
		return null;
	}

	@Override
	public boolean update(int index, PacienteDTO newData) {

		if (index <= listaPacientes.size() && index > 0) {
			listaPacientes.remove(index-1);
			listaPacientes.add(index-1, newData);
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}
	
	public String getSize()
	{
		String size = Integer.toString(listaPacientes.size());
		return size;
	}

	public void writeSerialized() {

		FileHandler.writeSerialized(SERIAL_NAME, listaPacientes);

	}

	public void readSerialized() {

		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {

			listaPacientes = new ArrayList<>();

		} else {

			listaPacientes = (ArrayList<PacienteDTO>) content;

		}
	}

}
