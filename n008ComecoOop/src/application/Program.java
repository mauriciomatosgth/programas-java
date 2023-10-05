package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle x,y;
        double p,areax,areay;
        x = new Triangle();
        y = new Triangle();




        System.out.println("Digite as 3 medidas de X:");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        areax = x.area();



        System.out.println("Digite as 3 medidas de Y:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
        areay = y.area();



        System.out.printf("Triângulo X: %.4f\n",areax);
        System.out.printf("Triângulo Y: %.4f\n",areay);


        if(areay > areax){
            System.out.printf("O maior Triângulo é Y: %.4f",areay);
        }
        else{
            System.out.printf("O maior Triângulo é X: %.4f",areax);
        }
        input.close();


    }
}
