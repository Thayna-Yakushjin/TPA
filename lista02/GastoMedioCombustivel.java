import java.util.Scanner;

public class GastoMedioCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		 double d,c,gastoMedio;
		 System.out.println("Digite a distância percorrida (km):");
		 d=ler.nextDouble();
		 
		 System.out.println("Digite o consumo de combustível (litros):");
		 
		 c=ler.nextDouble();
		 
		 gastoMedio= d/ c;
		 
		 if (gastoMedio>=10) {
			 
			 System.out.println("Econônico"); 
		 } else {
			 System.out.println("Não Econômico");
		 }
		 
		 ler.close();
		 
	 }
}

