package lista01;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		 double numero;
		 
		 System.out.println("Digite um n�mero:");
		 numero = ler.nextInt();
		 
		 if (numero < 0) {
	            System.out.println("O n�mero � negativo.");
	        } else if (numero == 0) {
	            System.out.println("O n�mero � neutro (zero).");
	        } else {
	            System.out.println("O n�mero � positivo.");
	        }
		 ler.close();
	}

}
