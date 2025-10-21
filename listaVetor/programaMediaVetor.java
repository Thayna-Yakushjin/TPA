package prjVetor;

import java.util.Scanner;

public class ProgramaMediaVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[], i;
		double m = 0;
		final int TAM = 10;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" elemento do vetor");
			a[i]= in.nextInt();
			m = m + a[i];
		}
		
		m = m / 10;
		System.out.println("A média dos elementos do vetor é: "+m);

	}

}