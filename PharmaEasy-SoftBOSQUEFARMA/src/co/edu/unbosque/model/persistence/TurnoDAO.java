package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class TurnoDAO implements CRUDOperation<TurnoDTO> {
	
	private ArrayList<TurnoDTO> listaTurnos;
	private final String SERIAL_NAME = "turnos.dat";

	public TurnoDAO() {
		listaTurnos = new ArrayList<>();
		FileHandler.checkFolder();
		readSerialized();
	}

	public boolean verificarTurnos()
	{
		if(listaTurnos.isEmpty())
		{
			return false;
		}else
		{
			return true;
		}
		
	}
	public int getSize()
	{
		return listaTurnos.size();
	}
	
	@Override
	public String showAll() {
		
		String contenido = "";
		if (listaTurnos.isEmpty()) 
		{
			return null;
		} else {
			for (TurnoDTO t : listaTurnos) {
				contenido += t.toString() + "\n";
			}
		return contenido;
	    }
	}

	@Override
	public ArrayList<TurnoDTO> getAll() {
		return listaTurnos;
	}

	@Override
	public boolean add(TurnoDTO newData) {
		
		if (find(newData) == null) 
		{
			listaTurnos.add(newData);
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int index) {
		
		if(index <= listaTurnos.size()&& index>0 && listaTurnos.get(index-1).getEstado().equals("atendido") )
		{
			listaTurnos.remove(index-1);
			writeSerialized();
			return true;
		}
		return false;
	}

	@Override
	public TurnoDTO find(TurnoDTO toFind) {
		for (TurnoDTO t : listaTurnos) 
			{
				if (t.getDocumento()==toFind.getDocumento()) 
				{
					return t;
				} 
			}
		return null;
	}

	@Override
	public boolean update(int index, TurnoDTO newData) {
		
		if(index <= listaTurnos.size()&& index>0)
		{
			listaTurnos.remove(index-1);
			listaTurnos.add(index-1, newData);
			writeSerialized();
			return true;
		}else
		{
			return false;
		}
	}
    
	public void writeSerialized() {

		FileHandler.writeSerialized(SERIAL_NAME, listaTurnos);

	}

	public void readSerialized() {

		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {

			listaTurnos = new ArrayList<>();

		} else {

		listaTurnos = (ArrayList<TurnoDTO>) content;
		
		}
	}

}
