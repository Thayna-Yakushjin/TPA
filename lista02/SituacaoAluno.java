import java.util.Scanner;

public class SituacaoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
        double nota1, nota2, media, notaExame, novaMedia;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        media = ((nota1 + nota2) / 2);

        if (media < 3) {
            System.out.println("REPROVADO");
        	 System.out.println("ALUNO ESTÁ EM EXAME");
        	 System.out.println("Digite a nota do exame: ");
             notaExame = ler.nextDouble();

             novaMedia = ((media + notaExame) / 2);
        	 
            if (media >= 6) {
                System.out.println("APROVADO");
            } else {
            novaMedia = ((media + notaExame) / 2);
                System.out.println("A nota final é:"+novaMedia);

                if (novaMedia >= 5) {
                    System.out.println("APROVADO");
                } else {
                    System.out.println("REPROVADO");
                }
            }
            
        }

        ler.close();
    }
}
