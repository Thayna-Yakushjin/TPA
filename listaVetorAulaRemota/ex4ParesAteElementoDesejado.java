package listaVetoresAulaRemota;
import java.util.Scanner;

public class ex4ParesAteElementoDesejado {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("digite o "+(i+1)+" número de A: ");
            a[i] = in.nextInt();
        }

        System.out.println("pares até os elementos do A nas posições de 0 até 10");

        for (int i = 0; i < 10; i++) {
            System.out.println("conjunto A["+i+"]= "+a[i]);

            for (int contador=0; contador<= a[i]; contador++) {
                if (contador % 2 ==0) {
                    System.out.print(contador+" ");
                }
            }

            System.out.println( ); 
        }
    }
}


