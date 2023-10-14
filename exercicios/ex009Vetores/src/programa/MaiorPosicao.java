package programa;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num,posicao;
        double maiorValor;

        System.out.print("Quantos numeros você vai digitar? ");
        num = sc.nextInt();


        double[] vetor = new double[num];
        for(int i = 0; i< vetor.length;i++){
            System.out.printf("Digite o %d° numero: ",i+1);
            vetor[i] = sc.nextDouble();
        }

        maiorValor = 0.0;
        posicao = 0;

        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
                posicao = i+1;
            }
        }

        System.out.print("\nMaior valor = "+maiorValor);
        System.out.print("\nPosicao Do Maior Valor = " +posicao);

        sc.close();

    }
}
