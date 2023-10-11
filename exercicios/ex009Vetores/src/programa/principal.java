package programa;

import java.util.Locale;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int num = sc.nextInt();
        int[] vetor = new int[num];

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite %d° numero: ",i+1);
            vetor[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i <vetor.length;i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }




        /*
        if (teste > 0){
               vetor[i] = teste;
           }
           */
        sc.close();
    }
}
