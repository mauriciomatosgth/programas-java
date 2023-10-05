package programa;

import utilitario.Calculador;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TerceiraVersao {


    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o Radios: ");
        double radius = input.nextDouble();

        double c = Calculador.circumference(radius);

        double v = Calculador.volume(radius);

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",Calculador.PI);
        input.close();

    }


}