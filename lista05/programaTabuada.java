package lacoRepeticao;
import java.util.Scanner;
public class programaTabuada {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int i=1;
		double n,m;
		System.out.println("Digite o número:");
		n= in.nextDouble();
		while(i<=10) {
			m=i*n;
			System.out.println(m);
			i++;
		}

	}

}
