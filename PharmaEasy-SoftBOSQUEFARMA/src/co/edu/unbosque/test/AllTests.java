package co.edu.unbosque.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(FuncionarioDAOTest.class);
		suite.addTestSuite(MedicamentoDAOTest.class);
		//$JUnit-END$
		return suite;
	}

}
