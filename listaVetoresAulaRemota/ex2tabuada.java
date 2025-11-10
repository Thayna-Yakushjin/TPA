package listaVetoresAulaRemota;
import java.util.Scanner;
public class ex2tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		        int[] a = new int[5];

		        for (int i = 0; i < 5; i++) {
		            System.out.print("Digite os números " + (i + 1) + ": ");
		            a[i] = in.nextInt();
		        }
		        for (int i = 0; i < 5; i++) {
		            int numero = a[i]; 

		            System.out.println("Tabuada do "+numero+":");

		            for (int i1 = 1; i1 <= 10; i1++) {
		                System.out.println(numero +" x" + i1 +"= " + (numero*i1));
		            }
		        }
		    }
	}
