import entities.RegistroDaEleicao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o Caminho do Documento? ");
        String caminho = sc.next();


        Map<String,Integer> registro = new TreeMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
           String line = br.readLine();

           while(line != null){
               String[] vetor = line.split(",");
               String nome = vetor[0];
               int novoVotos = Integer.parseInt(vetor[1]);

               if(registro.containsKey(nome)){
                   int votos = registro.get(nome);
                   registro.put(nome,votos + novoVotos);

               }else{
                   registro.put(nome,novoVotos);
               }


               line = br.readLine();
           }

            for(String key : registro.keySet()){
                System.out.println(key + "Valor: "+ registro.get(key));
            }
        }
        catch(IOException e){
            System.out.println("Error"+ e.getMessage());
        }



sc.close();
    }
}