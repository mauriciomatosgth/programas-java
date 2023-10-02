import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("entrada: ");
       int n = input.nextInt();
        //pra calcular os divisores do numero digitado.
       for(int i = 1; i <= n; i++){
           if(n % i == 0){
               System.out.println(i);
           }
       }
       input.close();
    }
}
