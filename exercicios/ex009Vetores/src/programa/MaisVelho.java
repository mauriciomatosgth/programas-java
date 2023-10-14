package programa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num,maisVelho,nomeVelho;



        System.out.print("Quantos Você vai digitar? ");
        num = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[num];
        int[] idade = new int[num];



        for(int i = 0; i < num ;i++) {
            System.out.printf("Dados da %da pessoa: \n",i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }
        maisVelho = 0;
        nomeVelho = 0;

        for(int i = 0; i < num ;i++){
            if(idade[i] > maisVelho){
                maisVelho = idade[i];
                nomeVelho = i;
            }
        }

        System.out.println("PESSOAS MAIS VELHA : " + nome[nomeVelho]);


        sc.close();
    }
}
