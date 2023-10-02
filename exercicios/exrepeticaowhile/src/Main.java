import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha,v;

        System.out.print("Informe a senha: ");
        v = input.nextInt();

        senha = 2002;

        while(v != senha){
            System.out.println("Senha Invalida.");
            System.out.println("Tente novamente: ");
            v =input.nextInt();
        }
        System.out.println("Acesso Permitido.");

        input.close();




    }
}