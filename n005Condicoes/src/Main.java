import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner input = new Scanner(System.in);

       int horas;

        System.out.println("Que horas são?");
        horas = input.nextInt();

        if(horas <= 12) {
            System.out.println("Bom dia!");
        }
        else if(horas <= 18){
            System.out.println("Bom tarde!");
        }
        else{
            System.out.println("Boa noite!");
        }


       




        input.close();
    }
}