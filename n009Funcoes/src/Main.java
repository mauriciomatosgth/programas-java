import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 numero: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maior = max(a,b,c);
        escreverResultado(maior);



        input.close();
        }
        public static int max(int x , int y, int z){
            int aux;
            if(x > y && x >z){
                aux = x;

            }
            else if(y > z ) {
                aux = y;
            }
            else{
                aux = z;
            }

            return aux;
        }
        //void é usado quando não vai ter return na função.
        public static void escreverResultado(int value){
            System.out.printf("O valor maior é: %d \n",value);
        }



    }
