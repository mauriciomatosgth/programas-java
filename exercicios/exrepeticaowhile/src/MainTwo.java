import java.util.Scanner;
public class MainTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.print("Digite o Valor de X: ");
        x = input.nextDouble();

        System.out.print("Digite o Valor de Y: ");
        y = input.nextDouble();

        while(x != 0.0 && y != 0.0){

            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if(x > 0 && y < 0){
                System.out.println("quarto");
            }
            else if(x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else{
                System.out.println("segundo");
            }
            System.out.print("Digite o Valor de X: ");
            x = input.nextDouble();

            System.out.print("Digite o Valor de Y: ");
            y = input.nextDouble();
        }


        input.close();
    }
}
