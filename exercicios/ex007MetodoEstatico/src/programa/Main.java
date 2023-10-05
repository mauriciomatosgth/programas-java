package programa;

import codigo.ConversorDeDolar;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        System.out.print("What is the dollar price?");
        double valorDollar = input.nextDouble();

        System.out.print("How many dollar will be bought?");
        double quantidadeDollar = input.nextDouble();

        double total = ConversorDeDolar.conversor(quantidadeDollar,valorDollar);

        System.out.printf("Amout to be paid in reais = %.2f%n",total);

    }
}