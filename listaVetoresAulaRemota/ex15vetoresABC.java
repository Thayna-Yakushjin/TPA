package listaVetoresAulaRemota;

import java.util.Scanner;

public class ex15vetoresABC {
	

	public static void main(String[] args) {
		
				Scanner in = new Scanner(System.in);
				int[]a= new int[10];
				int[]b= new int[10];
				int[]c= new int[10];
				
				for (int i =0; i<10; i++) {
					System.out.print("Digite o "+(i+1)+"º número de A: ");
					a[i]= in.nextInt();

					System.out.print("Digite o "+(i+1)+"º número de B: ");
					b[i]= in.nextInt();
					
					if(a[i]>b[i]) {
						c[i]=1;
						
					} else if(a[i]==b[i]) {
						c[i]=0;
						
					} else {
						c[i]= -1;
					}
				}
				System.out.println("Números do vetor C:");
				for (int i=0;i<10;i++) {
					System.out.println("C: "+i+ " = "+c[i]);
				}
			}
	    }


