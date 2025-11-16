package listaVetoresAulaRemota;

import java.util.Scanner;
public class ex1ParesImpares {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];

        int contador= 0;

        for (int i=0; i<20;i++) {

            System.out.print("Digite o "+(i+1)+ " número de A: ");
            a[i] = in.nextInt();

            if (a[i] % 2 == 0) {
                b[contador] = a[i];
                contador++;
            }
        }

        for (int i = 0; i < 20; i++) {

            if (a[i] % 2 != 0) {
                b[contador]= a[i];
                contador++;
            }
        }
        System.out.println("Vetor B (pares primeiro - depois os ímpares):");
        for (int i=0; i<20; i++) {
            System.out.println("posição "+i+"= " + b[i]);
        }
    }
}
