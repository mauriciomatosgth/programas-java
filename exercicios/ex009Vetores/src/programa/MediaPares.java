package programa;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, somaPar,media;
        double mediaPar;


        System.out.print("Quantos elementos vai ter o vetor? ");
        num = sc.nextInt();

        int[] vetor = new int[num];

        somaPar = 0;
        media = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i]%2 == 0){
                somaPar += vetor[i];
                media++;
            }
        }
        mediaPar = (double)somaPar/media;
        if(media == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            System.out.printf("MEDIA DOS PARES = %.1f ",mediaPar);
        }


    }
}
