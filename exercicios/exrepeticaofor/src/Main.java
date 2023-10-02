import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        valor =  input.nextInt();
        for(int i = 1; i <=valor;i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}