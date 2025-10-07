package lk;
 
import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
       int i=1, expoente;
       double base, resultado=1;
       
       System.out.println("Digite o número da base:");
   	base= in.nextDouble();
   	
   	System.out.println("Digite o número do expoente:");
   	expoente= in.nextInt();
   	
   	do {
   resultado*=base;
		   i++;
			   
   	
   	} while (i<= expoente);
   	
   	System.out.print( resultado);
   	
   	
   	
   			
   	
   	
       
	}

}
