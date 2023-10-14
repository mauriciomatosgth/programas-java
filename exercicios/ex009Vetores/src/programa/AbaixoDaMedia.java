package programa;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        double mediaVetor,somaVetor;


        System.out.print("Quantos elementos vai ter o vetor? ");
        num = sc.nextInt();

        double[] vetor = new double[num];

        somaVetor = 0.0;
        for(int i = 0; i< vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            somaVetor+= vetor[i];
        }

        mediaVetor = somaVetor/vetor.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n",mediaVetor);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i< vetor.length;i++){
            if(vetor[i] < mediaVetor){
                System.out.printf("%.1f%n",vetor[i]);
            }
        }

    }
}
