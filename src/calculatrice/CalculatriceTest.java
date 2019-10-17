package calculatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest {

	@Test
	public void testSuma() {
		int resultado = Calculatrice.somme(2, 3);
		int esperado = 5; // 2+3 = 5
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		int resultado = Calculatrice.restar(3, 2);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
}
