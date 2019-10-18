package calculatrice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest21 {

	CalculatriceTest2 calc;

	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		CalculatriceTest2 calc = new CalculatriceTest2();
		calc.add(3, 2);
		int result = calc.ans();
		int esper = 5;
		assertEquals(esper, result);
	}
	

	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}

	@Before
	public void before() {
		System.out.println("before()");
		calc = new CalculatriceTest2();
	}

	@Test
	public void testsum() {

		System.out.println("somme()");
		CalculatriceTest2 calc = new CalculatriceTest2();
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, resul);
	}

}