import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler= new Scanner(System.in);
		 double peso,altura,imc;
		 
		 System.out.println("Digite seu peso (kg):");
		 peso= ler.nextDouble();
		 
		 System.out.println ("Digite sua altura (m):");
		 altura= ler.nextDouble();
		 
		 imc= peso/ (altura * altura);
		 System.out.println("Seu imc é:"+imc);
		 
		 if (imc< 18.5) {
			 System.out.println("Excesso de magreza");
		 } else {
			 if(imc<=25) {
				 System.out.println("Peso normal");
			 } else {
				 if(imc<=30) {
					 System.out.println("Excesso de peso");
				 } else {
					 if(imc<=35) {
						 System.out.println(" Obesidade grau 1");
					 } else {
						 if(imc<=40) {
							 System.out.println("Obesidade grau 2");
						 } else {
							 System.out.println(" Obesidade grau 3");
						 }
					 }
				 }
			 }
		 }
		 ler.close();
	}
}
						
						 
				
			
		
		 



