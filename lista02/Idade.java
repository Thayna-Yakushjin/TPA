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
              
              System.out.println("Sua idade �:"+Idade+"anos.");
              
              if(Idade<10) {
            	  
            	  System.out.println("Voc� � uma crian�a.");
              }else if(Idade<18) {
            		   System.out.println("Voc� � adolescente.");
            		   
            	   }else if(Idade<60) {
            		   System.out.println("Voc� � um adulto");
            		   
            	   }else {
            		   System.out.println("Voc� � um idoso.");
            	}
               
	            ler.close();
	        }
	    }

