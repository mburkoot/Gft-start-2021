package exercicio1;

public class Eletronico extends Produto{

	public Eletronico(String nome, double valor, int quantidade) {
		super(nome, valor, quantidade);
	}
	
	public double calcularValorFinal() {
		return (super.calcularValorFinal())+(super.calcularValorFinal()*0.15);
	}
}
