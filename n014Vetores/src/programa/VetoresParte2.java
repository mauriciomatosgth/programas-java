package programa;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de indices");
        int n = input.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i<vect.length; i++){
            input.nextLine();
            System.out.print("Nome: ");
            String name = input.nextLine();
            System.out.print("Preço: ");
            double price = input.nextDouble();
            vect[i] = new Product(name,price);
        }

        double sum = 0.0;
        for(int i = 0; i<n; i++){
            System.out.println(vect[i]);
            sum += vect[i].getPrice();
        }
        double avg = sum/n;

        System.out.printf("Average Price = %.2f",avg);


        input.close();
    }
}