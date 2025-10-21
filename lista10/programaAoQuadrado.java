package prjVetor;

import java.util.Scanner;

public class programaAoQuadrado {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        final int TAM = 10;
        int a[] = new int[TAM];
        int b[] = new int[TAM];
        
        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o "+(i+1)+"º valor do vetor A: ");
            a[i] = in.nextInt();
        }
        
      
        for (int i =0; i<TAM; i++) {
            b[i]= a[i]*a[i];
        }
        
       
        System.out.println("Valores ao quadrado:");
        for (int i = 0;i <TAM;i++) {
            System.out.println("B["+ i +"] = "+ b[i]);
        }
        
        in.close();
    }
}