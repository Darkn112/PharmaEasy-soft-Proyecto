package co.edu.unbosque.test;

import co.edu.unbosque.model.persistence.MedicamentoDAO;
import co.edu.unbosque.model.persistence.MedicamentoDTO;
import junit.framework.TestCase;

public class MedicamentoDAOTest extends TestCase {
	
	private MedicamentoDAO medicamentoDAO;

    protected void setUp() throws Exception {
        medicamentoDAO = new MedicamentoDAO();
    }
    
    //Verificar si existe el medicamento, no debe existir
    public void testFind()
    {
    	MedicamentoDTO medicamento = new MedicamentoDTO("Noraver", 100, 44, 1);
    	MedicamentoDTO resultado = medicamentoDAO.find(medicamento);
    	assertEquals("El medicamento ya existe", null, resultado);
    }
    
    //Verificar si el codigo ingresado corresponde a algun medicamento de la lista de medicamentos, si debe coincidir
    public void testVerificarCodigoMedicamento()
    {
    	boolean confirmar = medicamentoDAO.verificarCodigoMedicamento(11);
    	assertEquals("El código no corresponde a ningún medicamento", true, confirmar);
    }
    protected void tearDown() throws Exception{
		medicamentoDAO = null;
	} 


}
