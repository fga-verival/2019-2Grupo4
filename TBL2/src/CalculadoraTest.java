import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void RendimentoBrutoTest() {
		Calculadora calc = new Calculadora(60, 1000.00f, 8.5f);
		double rb = 13.97f;
		assertEquals(calc.calculaRendimentoBruto(), rb, 0.01);
	}
}
