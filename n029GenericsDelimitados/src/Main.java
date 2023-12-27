import entities.Product;
import services.Calculation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        String path  = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1]) ));
                line = br.readLine();
            }

            Product x = Calculation.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        }catch(IOException e){
            System.out.println("Error :"+ e.getMessage());
        }
    }
}