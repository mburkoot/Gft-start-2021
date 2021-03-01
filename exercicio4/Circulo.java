package exercicio4;

public class Circulo implements AreaCalculavel {

	private double pi = 3.14159;
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}


	public double getPi() {
		return pi;
	}


	public double getRaio() {
		return raio;
	}




	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public double calculaArea() {
		return pi*(raio*raio);
	}

}
