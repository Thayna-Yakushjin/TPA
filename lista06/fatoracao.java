package lk;

import java.util.Scanner;

public class fatoracao {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int i=1, r=1;
	int n;
	
	System.out.println("Digite o número:");
	n= in.nextInt();
	
	do {
		r *= i;
		i++;
	} while (i<=n);
	
	System.out.print(n+"! = "+r);
	
	

	}

}