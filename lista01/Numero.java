package lista01;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		 double numero;
		 
		 System.out.println("Digite um número:");
		 numero = ler.nextInt();
		 
		 if (numero < 0) {
	            System.out.println("O número é negativo.");
	        } else if (numero == 0) {
	            System.out.println("O número é neutro (zero).");
	        } else {
	            System.out.println("O número é positivo.");
	        }
		 ler.close();
	}

}
