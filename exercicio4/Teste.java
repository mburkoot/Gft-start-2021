package exercicio4;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(13);
		Retangulo retangulo = new Retangulo(12, 12);
		Circulo circulo = new Circulo(7);
		
		
		System.out.printf("Área do Quadrado = %.2f%n", quadrado.calculaArea());
		System.out.printf("Área do Retângulo = %.2f%n", retangulo.calculaArea());
		System.out.printf("Área do Círculo = %.2f", circulo.calculaArea());
		
	}

}
