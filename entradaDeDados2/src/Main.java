import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        String s1,s2,s3;

        x = input.nextInt();

        //nextLine ler a frase todas  somente next ler so a palavra
        input.nextLine();// serve para consumir a quebra de linha criada pelo next anterior

        s1 = input.nextLine();
        s2 = input.nextLine();
        s3 = input.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}