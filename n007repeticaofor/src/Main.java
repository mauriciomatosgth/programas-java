import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = input.nextInt();
        //int soma = 0;
        for (int i = 0;  i <= n ; i++) {


            System.out.printf("Valor de i: %d\n", i);

        }

        int x,y;
        x = 3;
        y = 0;
        for(int i = 0; i < x; i++){
            System.out.print(i+",");
            y += 5;
            System.out.println(y);
        }

        input.close();

    }
}