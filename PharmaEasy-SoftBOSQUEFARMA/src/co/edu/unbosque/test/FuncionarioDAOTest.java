package co.edu.unbosque.test;

import co.edu.unbosque.model.persistence.FuncionarioDAO;
import co.edu.unbosque.model.persistence.FuncionarioDTO;
import junit.framework.TestCase;

public class FuncionarioDAOTest extends TestCase {
	
	private FuncionarioDAO funcionarioDAO;

	protected void setUp() throws Exception {
		funcionarioDAO = new FuncionarioDAO();
	}

	//Verificar si existe un funcionario con ese documento, no existe
    public void testFind()
    {
    	FuncionarioDTO funcionarioDTO = new FuncionarioDTO("Juan Perez", 1245761454, "contraseña1", "juanp@gmail.com");
    	FuncionarioDTO resultado = funcionarioDAO.find(funcionarioDTO);
    	assertEquals("Si existe funcionario con ese documento", null, resultado);
    }
	
	
	protected void tearDown() throws Exception {
		funcionarioDAO = null;
	}

}
