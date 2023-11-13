import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o numero de linhas: ");
        Integer n1 = sc.nextInt();

        System.out.print("Qual o numero de colunas: ");
        Integer n2 = sc.nextInt();
        Integer[][] matriz = new Integer[n1][n2];

        for(int i = 0; i < matriz.length;i++){
            for(int c = 0; c < matriz[i].length;c++) {
                System.out.printf("Digite o numero na posição %d,%d: ",i,c);
                matriz[i][c] = sc.nextInt();
            }
        }




        for(int i = 0; i < matriz.length;i++){
            for(int c = 0; c < matriz[i].length ;c++){
                System.out.printf("%d ",matriz[i][c]);
            }
            System.out.println();
        }

        System.out.print("Qual numero você escolhe na matriz?");
        Integer search = sc.nextInt();

        for(int i = 0; i < matriz.length;i++){
            for(int c = 0; c < n2;c++){
                if(matriz[i][c] == search){
                    System.out.printf("O numero %d esta na posição %d,%d\n",search,i,c);

                    if(c-1 >= 0) {
                        System.out.printf("A esquerda é: %d\n", matriz[i][c - 1]);
                    }
                    if(c+1 < matriz[i].length) {
                        System.out.printf("A direita é: %d\n", matriz[i][c + 1]);
                    }
                    if(i-1 >= 0) {
                        System.out.printf("A cima é: %d\n", matriz[i - 1][c]);
                    }
                    if(i+1 < matriz.length) {
                        System.out.printf("A baixo é: %d\n", matriz[i + 1][c]);
                    }



                }
            }

        }





        sc.close();

    }
}