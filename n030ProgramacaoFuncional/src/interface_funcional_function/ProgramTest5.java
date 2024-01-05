package interface_funcional_function;



import interface_funcional_consumer.entities.ProductConsumer;
import interface_funcional_function.entities.ProductFunction;
import interface_funcional_function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramTest5 {
    public static void main(String[] args) {
        List<ProductFunction> list = new ArrayList<>();
        list.add(new ProductFunction("Tv", 900.00));
        list.add(new ProductFunction("Mouse", 50.00));
        list.add(new ProductFunction("Tablet", 350.50));
        list.add(new ProductFunction("HD Case", 80.90));


        // implementação inline
        List<String> names = list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());

       /*     Implementação declarada
        Function<ProductFunction,String> func = f -> f.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());
        */
        //List<String> names = list.stream().map(ProductFunction::nonStaticUpperCaseName).collect(Collectors.toList()); implementação nãoEstatica
        //List<String> names = list.stream().map(ProductFunction::staticUpperCaseName).collect(Collectors.toList()); implementação estatica
       //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); implementação interface

       names.forEach(System.out::println);
    }
}
