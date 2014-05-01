package tutorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCalculadora {

	Calculadora calc;
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void testSoma() {
		assertEquals(calc.somar(2, 2), 4);
	}

}
