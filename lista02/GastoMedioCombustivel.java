import java.util.Scanner;

public class GastoMedioCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		 double d,c,gastoMedio;
		 System.out.println("Digite a dist�ncia percorrida (km):");
		 d=ler.nextDouble();
		 
		 System.out.println("Digite o consumo de combust�vel (litros):");
		 
		 c=ler.nextDouble();
		 
		 gastoMedio= d/ c;
		 
		 if (gastoMedio>=10) {
			 
			 System.out.println("Econ�nico"); 
		 } else {
			 System.out.println("N�o Econ�mico");
		 }
		 
		 ler.close();
		 
	 }
}

