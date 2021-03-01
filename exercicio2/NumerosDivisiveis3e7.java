package exercicio2;


public class NumerosDivisiveis3e7 {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 215; i++) {
			if (((i%3)==0) && ((i%7)==0)){
			System.out.println("O valor de " + i + " é Divisivel por 3 e 7!");
			}
		}
		
	}
}