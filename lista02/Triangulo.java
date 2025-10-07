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
		                             System.out.println("Triângulo Equilátero");
		                         } else {
		                             System.out.println("Triângulo Isósceles");
		                         }
		                     } else {
		                         if (A == C) {
		                             System.out.println("Triângulo Isósceles");
		                         } else {
		                             if (B == C) {
		                                 System.out.println("Triângulo Isósceles");
		                             } else {
		                                 System.out.println("Triângulo Escaleno");
		                             }
		                         }
		                     }
		                 } else {
		                     System.out.println("Não é triângulo");
		                 }
		             } else {
		                 System.out.println("Não é triângulo");
		             }
		         } else {
		             System.out.println("Não é triângulo");
		         }

		         ler.close();
		     }
		 }