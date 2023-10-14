package programa;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;


        System.out.print("Quantos valores vai ter cada vetor? ");
        num = sc.nextInt();


        int[] vetorA = new int[num];
        int[] vetorB = new int[num];
        int[] somaVetor = new int[num];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < num; i++){
            System.out.printf("Digite o %d° numero: ",i+1);
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < num; i++){
            System.out.printf("Digite o %d° numero: ",i+1);
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");

        for(int i = 0; i < num; i++){
            somaVetor[i] = vetorA[i]+vetorB[i];
            System.out.printf("%d + %d = %d \n",vetorA[i],vetorB[i],somaVetor[i]);
        }
    }
}
