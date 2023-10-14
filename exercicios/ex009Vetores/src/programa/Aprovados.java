package programa;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        double soma,media;


        System.out.print("Quantos alunos serao digitados? ");
        num = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[num];
        double[] nota1 = new double[num];
        double[] nota2 = new double[num];

        for(int i = 0; i < num ;i++) {
            System.out.printf("Digite nome,1ªnota e 2ªnota do %d° aluno:  \n",i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("1ª nota: ");
            nota1[i] = sc.nextDouble();

            System.out.print("2ª nota: ");
            nota2[i] = sc.nextDouble();

            sc.nextLine();

        }
        media = 0.0;
        soma = 0.0;
        System.out.println("Alunos aprovados:");
        for(int  i = 0; i < num; i++){
            soma = nota1[i]+nota2[i];
            media = soma/2;
            if(media >= 6){
                System.out.println(nome[i]);

            }
        }
        sc.close();
    }
}
