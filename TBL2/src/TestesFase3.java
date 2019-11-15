import junit.framework.TestCase;

public class TestesFase3 extends TestCase {
	
	public void testCaseA() {
		double res = CalculoRentabilidade.RendimentoBruto(1000, 60, 8.5);
		
		assertEquals(res, 13.97);
	}
}
