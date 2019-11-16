import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void RendimentoBrutoTest1() {
		Calculadora calc = new Calculadora(60, 1000.00f, 8.5f);
		double rb = 13.97f;
		assertEquals(calc.calculaRendimentoBruto(), rb, 0.01);
	}

	@Test
	public void RendimentoBrutoTest2() {
		Calculadora calc = new Calculadora(1000, 100.00f, 7.5f);
		double rb = 20.55f;
		assertEquals(calc.calculaRendimentoBruto(), rb, 0.01);
	}
}