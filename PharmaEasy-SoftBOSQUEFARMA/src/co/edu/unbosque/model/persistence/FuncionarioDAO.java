package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class FuncionarioDAO implements CRUDOperation<FuncionarioDTO>{
	
	private ArrayList<FuncionarioDTO> listaFuncionarios;
	private final String SERIAL_NAME = "funcionarios.dat";
	
	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList<>();
		FileHandler.checkFolder();
		readSerialized();
	}

	@Override
	public String showAll() {
		
		int num=1;
		String contenido = "";
		if (listaFuncionarios.isEmpty()) 
		{
			return null;
		} else {
			for (FuncionarioDTO f : listaFuncionarios) {
				contenido += " "+num+". "+f.toString() + "\n";
				num++;
			}
		return contenido;
	    }
	}

	@Override
	public ArrayList<FuncionarioDTO> getAll() {
		return listaFuncionarios;
	}

	@Override
	public boolean add(FuncionarioDTO newData) {
		if (find(newData) == null) 
		{
			listaFuncionarios.add(newData);
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int index) {
	
		if(index <= listaFuncionarios.size()&& index>0)
		{
			listaFuncionarios.remove(index-1);
			writeSerialized();
			return true;
		}else
		{
			return false;
		}
		
	}

	@Override
	public FuncionarioDTO find(FuncionarioDTO toFind) {
		for (FuncionarioDTO f : listaFuncionarios) 
			{
				if (f.getCedula()==toFind.getCedula()) 
				{
					return f;
				}
			}
		return null;
	}

	@Override
	public boolean update(int index, FuncionarioDTO newData) {
		
		if(index <= listaFuncionarios.size()&& index>0)
		{
			listaFuncionarios.remove(index-1);
			listaFuncionarios.add(index-1, newData);
			writeSerialized();
			return true;
		}else
		{
			return false;
		}
	}

	public void writeSerialized() {

		FileHandler.writeSerialized(SERIAL_NAME, listaFuncionarios);

	}

	public void readSerialized() {

		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {

			listaFuncionarios = new ArrayList<>();

		} else {

		listaFuncionarios = (ArrayList<FuncionarioDTO>) content;
		
		}
	}

}
