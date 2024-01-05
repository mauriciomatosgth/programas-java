package interface_funcional_consumer;

import interface_funcional_consumer.entities.PriceUpdate;
import interface_funcional_consumer.entities.ProductConsumer;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProgramTest4 {
    public static void main(String[] args) {
        List<ProductConsumer> list = new ArrayList<>();
        list.add(new ProductConsumer("Tv", 900.00));
        list.add(new ProductConsumer("Mouse", 50.00));
        list.add(new ProductConsumer("Tablet", 350.50));
        list.add(new ProductConsumer("HD Case", 80.90));

        double attPrice = 1.1;


        list.forEach(p -> p.setPrice(p.getPrice()*attPrice));

        /* Lambda Declarada
        Consumer<ProductConsumer> cons = p ->{
            p.setPrice(p.getPrice()*attPrice);
        };
        list.forEach(cons);

         */
        //list.forEach(ProductConsumer::nonStaticPriceUpdate);//  metodo estatico
        //list.forEach(ProductConsumer::staticPriceUpdate);  metodo estatico
        //list.forEach(new PriceUpdate()); Implementação com interface


        list.forEach(System.out::println);
    }
}
