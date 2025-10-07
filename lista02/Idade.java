import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler= new Scanner(System.in);
        
        double AnoNascimento,AnoAtual,Idade;
        
            System.out.println("Digite o ano de nascimento:");
              AnoNascimento= ler.nextDouble();
              
            System.out.println("Digite o ano atual:");
            
              AnoAtual=ler.nextDouble();
              
              Idade= AnoAtual-AnoNascimento;
              
              System.out.println("Sua idade é:"+Idade+"anos.");
              
              if(Idade<10) {
            	  
            	  System.out.println("Você é uma criança.");
              }else if(Idade<18) {
            		   System.out.println("Você é adolescente.");
            		   
            	   }else if(Idade<60) {
            		   System.out.println("Você é um adulto");
            		   
            	   }else {
            		   System.out.println("Você é um idoso.");
            	}
               
	            ler.close();
	        }
	    }

