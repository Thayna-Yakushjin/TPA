package prjExercicios0508;
import java.util.Scanner;
    public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
        double mes;
        
        System.out.println("Entre com o número");
        mes=ler.nextDouble();
        switch (mes)
        
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("contém 31 dias");
        	break;
        	
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("contem 30 dias");
        	break;
        	
        case 2:
        	System.out.println("contem 28 dias");
        	break;
        	
        	default:
        		System.out.println("mes inválido");
	}

}
