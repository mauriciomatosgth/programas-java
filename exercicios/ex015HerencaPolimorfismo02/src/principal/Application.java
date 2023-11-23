package principal;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> pedidos = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            System.out.printf("Product #%d data: \n",i);
            System.out.print("Common, used or imported (c/u/i)?");
            char answer = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name =sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (answer){
                case 'c':
                    pedidos.add(new Product(name,price));
                    break;

                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    Date date = sdf.parse(sc.nextLine());
                    pedidos.add(new UsedProduct(name,price,date));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();
                    pedidos.add(new ImportedProduct(name,price,customsFee));
                    break;
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product produto: pedidos){
            System.out.println(produto);
        }









        sc.close();
    }
}
