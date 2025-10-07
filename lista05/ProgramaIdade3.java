package lacoRepeticao;
import java.util.Scanner;
public class ProgramaIdade3 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int i=1,maior=0,menor=0;
		double Idade;
		
		while(i<=5) {
			System.out.println("Digite a idade da "+i+"° pessoa");
			Idade= in.nextDouble();
			if(Idade>=18) {
				maior++;
			}else {
				menor++;
			}
			i++;
		}
		System.out.println(menor+" são menores de idade");
		System.out.println(maior+" são maiores de idade");
	}

}
