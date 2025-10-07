import java.util.Scanner;

public class DescontoIrpf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner(System.in);
	        double salario, irpf;

	        System.out.println("Digite o salário: ");
	        salario=ler.nextDouble();

	        if (salario<=1434.59) {
	            irpf=0;
	        } else {
	            if (salario<=2150.00) {
	                irpf =((salario*7.5)/100-107.59);
	            } else {
	                if (salario<=2866.70) {
	                    irpf = ((salario*15)/100-268.84);
	                } else {
	                    if ((salario<=3582.00)) {
	                        irpf = ((salario*22.5)/100-483.84);
	                    } else {
	                        irpf = ((salario*27.5)/100-662.94);
	                    }
	                }
	            }
	        }

	        System.out.println("O desconto do IRPF é: R$"+irpf);

	        ler.close(); 
	    }
	}


