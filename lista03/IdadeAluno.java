
package lista03;

import java.util.Scanner;

public class IdadeAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double idade1, idade2, idade3, idade4, idade5, qtdMenor, qtdMaior, porcentMenor, porcentMaior;
        
         qtdMenor = 0;
        qtdMaior = 0;
         
       
        System.out.println("Digite a primeira idade: ");
        idade1 = ler.nextDouble();

        System.out.println("Digite a segunda idade: ");
        idade2 = ler.nextDouble();

        System.out.println("Digite a terceira idade: ");
        idade3 = ler.nextDouble();

        System.out.println("Digite a quarta idade: ");
        idade4 = ler.nextDouble();

        System.out.println("Digite a quinta idade: ");
        idade5 = ler.nextDouble();

        
        if (idade1 < 18) {
            qtdMenor=qtdMenor+1 ;
            System.out.println("menor de idade");
        } else {
        	qtdMaior=qtdMaior+1;
            System.out.println("maior de idade");
        }

      
        if (idade2 < 18) {
        	 qtdMenor=qtdMenor+1 ;
            System.out.println("menor de idade");
        } else {
        	qtdMaior=qtdMaior+1;
            System.out.println("maior de idade");
        }

        // Verificação da terceira idade
        if (idade3 < 18) {
        	 qtdMenor=qtdMenor+1 ;
            System.out.println("menor de idade");
        } else {
        	qtdMaior=qtdMaior+1;
            System.out.println("maior de idade");
        }

     
        if (idade4 < 18) {
        	 qtdMenor=qtdMenor+1 ;
            System.out.println("menor de idade");
        } else {
        	 qtdMaior=qtdMaior+1 ;
            System.out.println("maior de idade");
        }

       
        if (idade5 < 18) {
        	 qtdMenor=qtdMenor+1 ;
            System.out.println("menor de idade");
        } else {
            qtdMaior=qtdMaior+1;
            System.out.println("maior de idade");
        }

     
        porcentMaior = (qtdMaior * 100) / 5;
        porcentMenor = (qtdMenor * 100) / 5;

        System.out.println("Quantidade de maiores de idade: " + qtdMaior);
        System.out.println("Quantidade de menores de idade: " + qtdMenor);
        System.out.println("Porcentagem de maiores de idade: " + porcentMaior + "%");
        System.out.println("Porcentagem de menores de idade: " + porcentMenor + "%");

        ler.close();
    }
}