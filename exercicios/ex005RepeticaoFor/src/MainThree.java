import java.util.Locale;
import java.util.Scanner;
public class MainThree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int r;
        double n1,n2,n3,mp;

        System.out.println("Quantas medias ponderadas?");
        r = input.nextInt();

        for(int i = 0; i < r; i++){
            System.out.print("nota 1: ");
            n1 = input.nextDouble();

            System.out.print("nota 2: ");
            n2 = input.nextDouble();

            System.out.print("nota 3: ");
            n3 = input.nextDouble();

            mp = (n1*2 + n2 * 3 + n3 * 5)/(2+3+5);

            System.out.printf("A Media ponderada foi: %.1f\n ",mp );
        }


    }
}

