package lk2;
import java.util.Scanner;
public class FaixaEtaria {

	public static void main(String[] args) {
		
			        Scanner in= new Scanner (System.in);

		        int F1 = 0, F2 = 0, F3 = 0, F4 = 0, F5 = 0, idade;
		        int total = 0;
		        int opcao;     

		        do {
		            System.out.print("Digite a idade: ");
		             idade = in.nextInt();

		            if (idade <= 15) {
		                F1++;
		            } else if (idade <= 30) {
		                F2++;
		            } else if (idade <= 45) {
		                F3++;
		            } else if (idade <= 60) {
		                F4++;
		            } else {
		                F5++;
		            }

		            total++;

		            System.out.print("Deseja continuar? (1-Sim / 2-Não): ");
		            opcao = in.nextInt();

		        } while (opcao != 2);

		        double P1 = (F1 * 100.0) / total;
		        double P2 = (F2 * 100.0) / total;
		        double P3 = (F3 * 100.0) / total;
		        double P4 = (F4 * 100.0) / total;
		        double P5 = (F5 * 100.0) / total;

		        System.out.println("\n--- Resultado Final ---");
		        System.out.println(F1 + " pessoas na 1ª faixa (" + P1 + "%)");
		        System.out.println(F2 + " pessoas na 2ª faixa (" + P2 + "%)");
		        System.out.println(F3 + " pessoas na 3ª faixa (" + P3 + "%)");
		        System.out.println(F4 + " pessoas na 4ª faixa (" + P4 + "%)");
		        System.out.println(F5 + " pessoas na 5ª faixa (" + P5 + "%)");

		    }
		
		

	}


