package lista01;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		  double salario;
		     System.out.println("Entre com o salário:");
		     salario = ler.nextDouble();
		     if (salario < 1302.00) {
		    	   System.out.println("Está abaixo do salário mínimo.");
		     } else {
		    	 System.out.println("Está acima do salário mínimo.");
		     }
		    ler.close();
	}

}
