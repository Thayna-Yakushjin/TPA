package lista01;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		  double salario;
		     System.out.println("Entre com o sal�rio:");
		     salario = ler.nextDouble();
		     if (salario < 1302.00) {
		    	   System.out.println("Est� abaixo do sal�rio m�nimo.");
		     } else {
		    	 System.out.println("Est� acima do sal�rio m�nimo.");
		     }
		    ler.close();
	}

}
