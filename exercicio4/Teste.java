package exercicio4;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(13);
		Retangulo retangulo = new Retangulo(12, 12);
		Circulo circulo = new Circulo(7);
		
		
		System.out.printf("�rea do Quadrado = %.2f%n", quadrado.calculaArea());
		System.out.printf("�rea do Ret�ngulo = %.2f%n", retangulo.calculaArea());
		System.out.printf("�rea do C�rculo = %.2f", circulo.calculaArea());
		
	}

}
