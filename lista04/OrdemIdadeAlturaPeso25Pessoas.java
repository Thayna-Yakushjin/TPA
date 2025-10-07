import java.util.Scanner;
public class OrdemIdadeAlturaPeso25Pessoas {



	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
       double i50, sAlturas, pm40, maxIdade, minIdade, idade, peso, altura, mAltura, sAltura, ppm40;
       
       i50=0;
       sAltura=0;
       pm40=0;
       maxIdade=-1;
       minIdade=1000;
       
       for (i50=1;i50<=25;i50++) {
    	   
    	   System.out.println("Insira a idade:");
    	   idade= in.nextDouble();
    	   
    	   System.out.println("Insira o peso:");
    	   peso= in.nextDouble();
    	   
    	   System.out.println("Insira a altura:");
    	   altura= in.nextDouble();
    	   
    	   if (idade>50) {
    	   i50= i50+1;
    	   
    	   if(idade<=20 & idade>=10) {
    	   sAltura=sAltura+ altura;
    	   
    	   if(peso<40) {
    	   pm40= pm40+1;
    	   
    	   if(idade>maxIdade) {
    	   maxIdade= idade;
    	   
       }else {
    	   
    		   if(idade<minIdade) {
    	   minIdade=idade;
    	   mAltura=sAltura/25;
    	   
    	   ppm40 =(ppm40 /25) *100; 
    	   
    	   System.out.println(i50+"São pessoas com mais de 50 anos.");
    	   System.out.println(mAltura);
    	   System.out.println(ppm40+"%");
    	   System.out.println(maxIdade);
    	   System.out.println(minIdade);
    	   
    		   }
    		   
    		   
    		   }
    	   
    			   
    		   }
       }
    	   
    	   
    		   }
       }
    	   }
	{
    		   
		
	}

}
