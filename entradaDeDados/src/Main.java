import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);

        //ler uma palavra

        String x;
        x = input.next();
        System.out.println("Você escreveu: "+ x);
        // ler um numero

        int y;
        y = input.nextInt();
        System.out.println("Você escreveu " + y);
        //ler um numero float

        double f;
        f = input.nextDouble();
        System.out.println("Você escreveu " + f);

        char c;
        c = input.next().charAt(0);
        System.out.println("Você escreveu " + c);





        input.close();
    }
}