package lista03;

import java.util.Scanner;

public class SituacaoAluno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
        double nota1, nota2,nota3, nota4, mediaInicial, novaMedia,exame;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = ler.nextDouble();
        
        
        mediaInicial = ((nota1 + nota2 + nota3 + nota4) / 4);
        
        System.out.println("A média inicial é: "+ mediaInicial);
       
        if (mediaInicial >=7 ) {
            System.out.println("APROVADO");
        
        }else {
        	
        	  System.out.println("Está em exame");
        	  
        	  System.out.println("Digite a nota do exame: ");
              exame = ler.nextDouble();
        	  
              novaMedia = ((mediaInicial + exame)/2);
              
              System.out.println("A nova média é: "+ novaMedia);
              
              
              
              if (novaMedia >=7 ) {
                  System.out.println("Aprovado em exame");
                  
              }else {
            	  System.out.println("Reprovado em exame");
            	  
              }
              
        	ler.close();
        }
	}

}
