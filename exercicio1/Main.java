package exercicio1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Caixa caixa = new Caixa("Ventilador", 320.00, 3);
		System.out.println(caixa.calcularTotal());
		Caixa caixa1 = new Caixa("Computador", 3999.0, 2);
		System.out.println(caixa1.calcularTotal());
		Caixa caixa2 = new Caixa("Mesa", 270.00, 2);
		System.out.println(caixa2.calcularTotal());
		Caixa caixa3 = new Caixa("Caderno", 10.50, 10);
		System.out.println(caixa3.calcularTotal());
		Caixa caixa4 = new Caixa("Cadeira", 234.25, 2);
		System.out.println(caixa4.calcularTotal());
		Caixa caixa5 = new Caixa("Caneta", 0.70, 15);
		System.out.println(caixa5.calcularTotal());
		
	}

}
