package exercicio3;

import java.util.Scanner;

public class ImprimaoCubo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o intervalo INICIAL: ");
		int intervaloInicial = sc.nextInt();
		System.out.print("Digite o intervalo FINAL: ");
		int intervaloFinal = sc.nextInt();
		if (intervaloFinal-intervaloInicial > 15) {
			System.out.print("Inválido!");
		}
		else {
			
			int resultado = 0;
			for (int i = intervaloInicial; i <= intervaloFinal; i++) {
				resultado = i * i * i;
				System.out.println("Cubo de " + i + " é " + resultado);
			}
		}
		
		sc.close();
	}

}
