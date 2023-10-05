import java.util.Scanner;
public class OpeAritCubQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ,quad,cubo;

        System.out.println("Digite a Entrada: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            quad =(int) Math.pow(i,2);
            cubo = (int) Math.pow(i,3);
            System.out.printf("%d %d %d\n",i,quad,cubo);

        }
        input.close();

    }
}
