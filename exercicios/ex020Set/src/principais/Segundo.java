package principais;

import entities.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Segundo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Log> log = new HashSet<>();

        //String caminho = "C:\\temp\\in.txt";
        System.out.print("Enter file full path: ");
        String caminho = sc.next();
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String line = br.readLine();
            while(line != null){
                String[] vetor = line.split(" ");


                log.add(new Log(vetor[0]));

                line = br.readLine();

            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Total users: "+log.size());

        sc.close();

    }
}
