package lista01;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Digite a temperatura em Fahrenheit:");
        fahrenheit = ler.nextDouble();

        // Conversão para Celsius
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura em Celsius: " + celsius + "°C");

        if (celsius < 15) {
            System.out.println("Frio");
        } else if (celsius >= 15 & celsius < 22) {
            System.out.println("Ameno");
        } else {
            System.out.println("Calor");
        }

        ler.close();
    }
}
	

