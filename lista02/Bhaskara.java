import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		 double A,B,C,delta,x1,x2;

		 System.out.println("Digite o valor de A:");
		 A= ler.nextDouble();
		 
		 System.out.println("Digite o valor de B:");
		 B= ler.nextDouble();
		 
		 System.out.println("Digite o valor de C:");
		 C= ler.nextDouble();
		 
		 delta= B*B-4*A*C;
		 if(delta<0) {
			 System.out.println("Não existem raízes reais.");
		 }else if (delta==0) {
			 x1= -B / (2*A);
			 System.out.println("Existe uma raíz real:"+x1);
		 }else {
			 x1= (-B+ Math.sqrt(delta))/(2*A);
			 x2= (-B- Math.sqrt(delta))/(2*A);
			 System.out.println("Duas raízes reais:"+x1+x2);
		 }
		 ler.close();	 
	  }
	}

