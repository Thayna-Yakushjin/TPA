package prjVetor;

import java.util.Scanner;

public class vetorSoma {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int c[] = new int[TAM];
        
        for(int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + " valor do vetor A: ");
            a[i] = in.nextInt();
        }
        for(int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + " valor do vetor B: ");
            b[i] = in.nextInt();
        }
        for(int i = 0; i < TAM; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println("Vetor C (soma de A + B):");
        for(int i = 0; i < TAM; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
        in.close();
    }
}
