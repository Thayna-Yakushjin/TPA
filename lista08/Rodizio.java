package prjExercicios0508;
import java.util.Scanner;
    public class Rodizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
        double numero;
        
        System.out.println("Entre com o número");
        numero=ler.nextDouble();
        switch (numero)
        
        case 1:
        case 2:
        	System.out.println("Segunda-feira");
        	break;
        	
        case 3:
        case 4:
        	System.out.println("Terça-feira");
        	break;
        	
        case 5:
        case 6:
        	System.out.println("Quarta-feira");
        	break;
        	
        	
        case 7:
        case 8:
        	System.out.println("Quinta-feira");
        	break;
        	
        case 9:
        case 0:
        	System.out.println("Sexta-feira");
        	break;
        	
        	default:
        		System.out.println("Placa inválida");
	      
	}

}
