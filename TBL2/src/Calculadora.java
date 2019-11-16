
public class Calculadora {
	int n;
	double p, i, ir;
	
	public Calculadora(int n, double p, double i) {
		this.n = n;
		this.p = p;
		this.i = i/100.0f;
		
		if(n <= 180)
			this.ir = 0.225;
		else if(n <= 360)
			this.ir = 0.20;
		else if(n <= 720)
			this.ir = 0.175;
		else
			this.ir = 0.15;
	}

	public double calculaRendimentoBruto() {
		return this.i*(this.n*this.p/365.0f);
	}
}