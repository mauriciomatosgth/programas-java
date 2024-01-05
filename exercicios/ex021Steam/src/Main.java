import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String cam = "c:\\temp\\in.txt";

        List<Product> produtos = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(cam))){
            String line = bf.readLine();

            while(line != null){

                String[] vetor = line.split(",");
                String nome = vetor[0];
                Double price = Double.parseDouble(vetor[1]);
                produtos.add(new Product(nome,price));
                line = bf.readLine();
            }

            Double valor = produtos.stream().map(Product::getPrice).reduce(0.0, Double::sum);//posso ja fazer isso dentro somente da variavel mediaPrice

            //valor.forEach(System.out::println);

            double mediaPrice = valor/produtos.size();



            Comparator<String> comparator = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> media = produtos.stream().filter(p -> p.getPrice() < mediaPrice).map(Product::getName).sorted(comparator.reversed()).collect(Collectors.toList());

            System.out.printf("Media: %.2f\n", mediaPrice);
            System.out.println("--------------");
            media.forEach(System.out::println);

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}