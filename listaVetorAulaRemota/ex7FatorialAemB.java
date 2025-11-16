package listaVetoresAulaRemota;

import java.util.Scanner;

public class ex7FatorialAemB {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] a= new int[15];
		int[] b= new int[15];
		
		for (int i=0; i<15; i++) {
		    System.out.print("Digite o "+(i+1)+" número de A: ");
		    a[i] = in.nextInt();
		}

		for (int i=0; i< 15; i++) {
		    int fatorial=1;

		    for (int contador=1; contador<= a[i];contador++) {
		        fatorial= fatorial*contador;
		    }

		    b[i]=fatorial;
		}
		System.out.println("números do vetor B fatoriais:");
		for (int i=0; i< 15; i++) {
		    System.out.println("B["+i+ "]= "+b[i]);
		}

	}

}
