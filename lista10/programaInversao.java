package prjVetor;

import java.util.Scanner;

public class ProgramaInversao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j, a[], b[];
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		j = 9;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" elemento do vetor");
			a[i]= in.nextInt();
			b[j] = a[i];
			j--;
		}
		
		System.out.print("Vetor A [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("] ");
		
		System.out.print("Vetor B [ ");
		for ( i = 0 ; i < TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
}