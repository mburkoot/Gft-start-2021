package exercicio1;

public class Caixa extends Produto{
	
	public Caixa(String nome, double valor, int quantidade) {
		super(nome, valor, quantidade);
	}

	public String calcularTotal() {
		return "Produto = " + super.getNome() + " | Valor = R$" + String.format("%.2f",super.getValor()) + " | Quantidade = " + super.getQuantidade() + " | Total = R$" + String.format("%.2f",super.calcularValorFinal());
		} 
}
