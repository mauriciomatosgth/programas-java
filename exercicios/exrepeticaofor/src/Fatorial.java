import java.util.Scanner;
import java.util.Locale;
public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial,resultado;
        resultado = 1;
        System.out.println("Digite o numero: ");
        fatorial = input.nextInt();

        for(int i = fatorial; i >=1; i--){
            resultado *= i;

        }
        System.out.println(resultado);
    }
}
