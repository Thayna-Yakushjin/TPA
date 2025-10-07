package lk;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
        Scanner in= new Scanner (System.in);
        int x,y,z,i,n;
         
        System.out.println("Digite o número de termos:");
       	n= in.nextInt();
       	
       	x=0;
       	y=1;
       	
       	do {
       		System.out.println(x);
       		x= in.nextInt();
       		
       		z=x+y;
       		
       		x=y;
       		
       		y=z;
       		
       		i++;
       		
    	} while (i<= n);      
        
	}

}
