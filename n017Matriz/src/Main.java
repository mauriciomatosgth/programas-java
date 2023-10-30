import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Colunas?");
        Integer n = sc.nextInt();

        Integer[][] matriz = new Integer[n][n];

        for(int i=0; i<matriz.length;i++){
            for(int c = 0; c <matriz[i].length; c++){
                matriz[i][c] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for(int i=0; i<n;i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();


        Integer count = 0;
        for(int i=0; i<matriz.length;i++){
            for(int c = 0; c <n; c++){
                if(matriz[i][c] < 0){
                    count ++;
                }

            }
        }
        System.out.printf("Negativos é %d",count);

        sc.close();
    }
}