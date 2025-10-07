import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner(System.in);
         double A, B, C;

         System.out.println("Digite o primeiro valor:");
         A = ler.nextDouble();
         System.out.println("Digite o segundo valor:");
         B = ler.nextDouble();
         System.out.println("Digite o terceiro valor:");
         C = ler.nextDouble();

         if (A <= B ) {
             if (B <= C) {
             System.out.println("Ordem crescente:"+A+","+B+","+C);
             }else {
            	 if (A<=C) {
            		 System.out.println("Ordem crescente:"+A+","+C+","+B);
            	 }else {
            		 System.out.println("Ordem crescente:"+C+","+A+","+B);
            	 }
             }
            }else {
            	if(A<=C) {
            		 System.out.println("Ordem crescente:"+B+","+A+","+C);
            	}else {
            		if (B<=C) {
            			System.out.println("Ordem crescente:"+B+","+C+","+A);
            		}else {
            			System.out.println("Ordem crescente:"+C+","+B+","+A);
            		}
            	}
             }
         ler.close();
	}
}

