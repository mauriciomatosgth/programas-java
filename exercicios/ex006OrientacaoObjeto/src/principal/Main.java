package principal;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double area,perimetro,diag,base,altura;

        System.out.println("Digite a Base do Retângulo: ");
        base = input.nextDouble();

        System.out.println("Digite a Altura do Retângulo: ");
        altura = input.nextDouble();

        area = base*altura;
        perimetro = (base *2) + (altura *2);
        diag = Math.sqrt((altura*altura) + (base*base));

        System.out.printf("Area = %.2fPerimetro = %.2fDiagonal = %.2f\n ",area,  perimetro, diag);
    }
}