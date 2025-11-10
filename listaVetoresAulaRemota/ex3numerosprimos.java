package listaVetoresAulaRemota;

import java.util.Scanner;

public class ex3numerosprimos {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int numero = a[i];
            int div =0;

            for (int divisor =1; divisor <= numero; divisor++) {
                if (numero % divisor ==0) {
                    div++;
                }
            }
            if (div==2) {
                System.out.println(numero +" é primo");
            } else {
                System.out.println(numero +" não é primo");
            }
        }
    }
}
