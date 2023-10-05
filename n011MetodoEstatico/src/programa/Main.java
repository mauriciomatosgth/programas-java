package programa;

import utilitario.Calculador;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        Calculador calculo = new Calculador();

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o Radio: ");
        double radius = input.nextDouble();

        double c = calculo.circumference(radius);

        double v = calculo.volume(radius);

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",calculo.PI);
        input.close();

    }


}