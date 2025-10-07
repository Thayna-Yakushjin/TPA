import java.util.Scanner;
public class programaTabuadaAte10 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		  int i,y, resultado;
		  
		  for (i=1;i<=10;i++) {
			  System.out.println("Tabuada do "+i+":");
			  for (y=1;y<=10;y++) {
				  resultado= i*y;
				  System.out.print(i+"x"+y+"="+resultado+"   ");
				  
				  System.out.println();
			  }
	
			  System.out.println();
		  }
	}

}
