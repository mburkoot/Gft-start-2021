package exercicio1;

public class Movel extends Produto{

	public Movel(String nome, double valor, int quantidade) {
		super(nome, valor, quantidade);
	}
	
	public double calcularValorFinal() {
		if (super.getQuantidade()<10) {
			return (super.calcularValorFinal())+(super.calcularValorFinal()*0.11);
		}
		else {
			return (super.calcularValorFinal())+(super.calcularValorFinal()*0.05);
		}
		 
	}

}
