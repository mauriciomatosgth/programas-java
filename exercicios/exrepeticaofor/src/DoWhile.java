import java.util.Locale;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double celcius, fahr;
        char r;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            celcius = input.nextDouble();

            fahr = ((9.0 * celcius) / 5.0) + 32.0;
            System.out.printf("Equivalente em Fahrenheit %.1f \n",fahr);
            System.out.print("Quer continuar [S/N]? ");
            r = input.next().charAt(0);
        }while(r != 'n');
        
        input.close();




    }
}
