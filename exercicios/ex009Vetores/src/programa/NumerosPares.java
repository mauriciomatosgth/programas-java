package programa;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num,quantPares;

        System.out.print("Quantos numeros você vai digitar? ");
        num = sc.nextInt();
        int[] vetor = new int[num];

        for(int i = 0; i< vetor.length; i++){
            System.out.print("Digite um numero");
            vetor[i] = sc.nextInt();
        }
        quantPares = 0;
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i< vetor.length;i++ ){
            if(vetor[i]%2==0){
                System.out.printf("%d  ",vetor[i]);
                quantPares += 1;
            }
        }

        System.out.println("\nQuantidade de pares = "+ quantPares);



    }
}
