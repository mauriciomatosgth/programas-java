import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int soma,x;
       soma = 0;

       System.out.print("Digite um numero: ");
       x = input.nextInt();


       while (x != 0){
           soma += x;
           System.out.print("Digite novamente: ");
           x = input.nextInt();

       }
        System.out.println(soma);
        input.close();
    }
}