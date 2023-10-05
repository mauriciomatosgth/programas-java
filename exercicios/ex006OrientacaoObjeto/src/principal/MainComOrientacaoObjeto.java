package principal;


import codigo.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class MainComOrientacaoObjeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();



        System.out.println("Digite a Base: ");
        retangulo.b = input.nextDouble();
        System.out.println("Digite aAltura: ");
        retangulo.a = input.nextDouble();

        System.out.printf("Area = %.2f\n",retangulo.area());
        System.out.printf("Perimetro = %.2f\n",retangulo.perimetro());
        System.out.printf("Diagonal = %.2f\n",retangulo.diagonal());
        input.close();
    }
}
