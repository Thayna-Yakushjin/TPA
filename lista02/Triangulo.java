import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         Scanner ler = new Scanner(System.in);
		         double A, B, C;

		         System.out.println("Digite o lado A:");
		         A = ler.nextDouble();
		         System.out.println("Digite o lado B:");
		         B = ler.nextDouble();
		         System.out.println("Digite o lado C:");
		         C = ler.nextDouble();

		         if (A < B + C) {
		             if (B < A + C) {
		                 if (C < A + B) {
		                     if (A == B) {
		                         if (B == C) {
		                             System.out.println("Tri�ngulo Equil�tero");
		                         } else {
		                             System.out.println("Tri�ngulo Is�sceles");
		                         }
		                     } else {
		                         if (A == C) {
		                             System.out.println("Tri�ngulo Is�sceles");
		                         } else {
		                             if (B == C) {
		                                 System.out.println("Tri�ngulo Is�sceles");
		                             } else {
		                                 System.out.println("Tri�ngulo Escaleno");
		                             }
		                         }
		                     }
		                 } else {
		                     System.out.println("N�o � tri�ngulo");
		                 }
		             } else {
		                 System.out.println("N�o � tri�ngulo");
		             }
		         } else {
		             System.out.println("N�o � tri�ngulo");
		         }

		         ler.close();
		     }
		 }