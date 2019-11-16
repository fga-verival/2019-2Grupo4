import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculadoraTest {
	int n;
	double p, i;
	Resposta resposta;
	
	public CalculadoraTest(int n, double p, double i, Resposta resposta) {
		this.n = n;
		this.p = p;
		this.i = i;
		this.resposta = resposta;
	}

	@Parameters
	public static Collection<Object[]> getParameters() {
		Object[][] respostas = new Object[][] {
			{60, 1000.0, 8.5, new Resposta(13.97, 3.14, 1.0829)},
			{120, 500.00, 8.0, new Resposta(13.15, 2.96, 2.0384)},
			{240, 3000.0, 9.0, new Resposta(177.53, 35.51, 4.7342)},
			{270, 2000.0, 8.5, new Resposta(125.75, 25.15, 5.0301)},
			{390, 100.0, 7.5, new Resposta(8.01, 1.40, 6.6113)},
			{420, 250.00, 8.0, new Resposta(23.01, 4.03, 7.5945)},
			{550, 400.0, 8.0, new Resposta(48.22, 8.44, 9.9452)},
			{670, 800.0, 8.0, new Resposta(117.48, 20.56, 12.1151)},
			{700, 2500.0, 9.0, new Resposta(431.51, 75.51, 14.2397)},
			{900, 4200.00, 9.5, new Resposta(983.84, 147.58, 19.9110)},
			{1000, 100.00, 7.5, new Resposta(20.55, 3.08, 17.4658)}
		};
		
		return Arrays.asList(respostas);
	}
	
	@Test
	public void RendimentoBrutoTest() {
		Calculadora calc = new Calculadora(n, p, i);
		assertEquals(calc.calculaRendimentoBruto(), resposta.rb, 0.01);
	}

	@Test
	public void ImpostoRendaTest1() {
		Calculadora calc = new Calculadora(60, 1000.00f, 8.5f);
		double d = 3.14f;
		assertEquals(calc.calculaImpostoRenda(), d, 0.01);
	}

	@Test
	public void ImpostoRendaTest2() {
		Calculadora calc = new Calculadora(1000, 100.00f, 7.5f);
		double d = 3.08f;
		assertEquals(calc.calculaImpostoRenda(), d, 0.01);
	}
}