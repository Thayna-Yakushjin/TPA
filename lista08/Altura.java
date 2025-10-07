package lk2;

import java.util.Scanner;

public class Altura  {

	public static void main(String[] args) {
		
		  double joao = 1.34; 
	        double pedro = 1.45; 
	        int anos = 0;

	        do {
	            joao += 0.025; 
	            pedro += 0.02; 
	            anos++;
	        } while (joao <= pedro);

	        System.out.println("Serão necessários " + anos + " anos para João ficar mais alto que Pedro.");
		
		
	}

}
