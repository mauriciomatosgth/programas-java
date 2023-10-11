package programa;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        //serve para definir o tamanho do vetor
        int n = input.nextInt();
        double[] vect = new double[n];

        for(int i= 0; i <n; i++){
            vect[i] = input.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i<n; i++){
            sum += vect[i];
        }
        double media = sum/n;

        System.out.printf("AVERAGE HEIGHT  = %.2f\n" , media);

        input.close();
    }
}