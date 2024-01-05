package interface_funcional_pridicate;

import interface_funcional_pridicate.entities.Product;
import interface_funcional_pridicate.interfaces.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProgramTest3 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);
        /* Expressão lambda declarada

        Predicate<ProductConsumer> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);
        */
        // list.removeIf(ProductConsumer::nonStaticProductPredicate);//não estatico
        //list.removeIf(ProductConsumer::staticProductPredicate);// estatico

        //list.removeIf(new ProductPredicate()); implementação da interface
        //list.removeIf(p -> p.getPrice() >= 100); Lambda inline

        for(Product p : list){
            System.out.println(p);
        }

    }
}
