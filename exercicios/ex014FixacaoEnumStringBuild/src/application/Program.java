package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.entities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter cliente data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate =sdf.parse( sc.nextLine());


        System.out.println("Enter order data:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order? ");
        int numOrder = sc.nextInt();

        Order order = new Order (new Date(),status,new Client(name,email,birthDate));

        for(int i = 0;i < numOrder; i++) {
            System.out.printf("Enter # %d item data:\n",i+1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            Product product = new Product(productName,productPrice);
            OrderItem ordemItem = new OrderItem(quantity,productPrice,product);

            order.addItem(ordemItem);


        }

        System.out.println(order);






        sc.close();
    }
}
