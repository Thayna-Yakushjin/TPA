package listaVetoresAulaRemota;
import java.util.Scanner;

public class ex14vetorAeB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número de A: ");
			a[i] = in.nextInt();
			
			if (a[i] % 2 ==0) { 
				b[i] = a[i];
				System.out.println("É par");
			} else {
				b[i] =0; 
				System.out.println("É ímpar");
			}
		}
		System.out.println("números do vetor B:");
		for (int i =0; i< 10; i++) {
			System.out.print(b[i] + " ");
		}
	}
}

