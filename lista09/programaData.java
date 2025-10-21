package exercicio;

import java.util.Scanner;

public class programaData {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i = 0, dia, mes, ano, resposta;
		
		do {
			System.out.println("Insira o dia:");
			dia = in.nextInt();
			System.out.println("Insira o mês:");
			mes = in.nextInt();
			System.out.println("Insira o ano:");
			ano = in.nextInt();
			
			switch(mes) {
			case 2:
				if (ano%4 == 0) {
					if (dia == 29) {
						dia = 1;
						mes = mes + 1;
					} else {
						if (dia < 29) {
							dia = dia + 1;
						} else {
							System.out.println("Data Inválida");
						}
					}
				} else {
					if (dia == 28) {
						dia = 1;
						mes = mes + 1;
					} else {
						if (dia < 28) {
							dia = dia + 1;
						} else {
							System.out.println("Data Inválida");
						}
					}
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia == 30) {
					dia = 1;
					mes = mes + 1;
				} else {
					if (dia < 30) {
						dia = dia + 1;
					} else {
						System.out.println("Data Inválida");
					}
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (mes == 12) {
					if (dia == 31) {
						dia = 1;
						mes = 1;
						ano = ano + 1;
					} else {
						if (dia < 31) {
							dia = dia + 1;
						} else {
							System.out.println("Data Inválida");
						}
					}
				} else {
					if (dia == 31) {
						dia = 1;
						mes = mes + 1;
					} else {
						if (dia < 31) {
							dia = dia + 1;
						} else {
							System.out.println("Data Inválida");
						}
					}
				}
				break;
				default:
					System.out.println("Data Inválida");
			}
			System.out.println("Próximo dia:" + dia + "/" + mes + "/" + ano);
			System.out.println("Deseja continuar? 1 - Sim/ 2 - Não");
			resposta = in.nextInt();
			if (resposta == 2) {
				i++;
			}	
		}while (i == 0);
	}
}
