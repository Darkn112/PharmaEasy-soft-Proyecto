package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation <D> {
	
		public String showAll();
		
		public ArrayList<D> getAll();
		
		public boolean add(D newData);
		
		public boolean delete(int index);
		
		public D find(D toFind);
		
		public boolean update(int index, D newData);
		

}
