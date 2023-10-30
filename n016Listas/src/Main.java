import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());


        System.out.println(list);
        for(String x: list){
            System.out.println(x);
        }

        System.out.println("----------------");

        //list.remove(1);
        //list.remove("Anna");//remove digitando o valor do indice, invez de declara o indice
        list.removeIf(x -> x.charAt(0)=='M');//Remove todos que começa o nome com M
        for(String x: list){
            System.out.println(x);
        }

        System.out.println("----------------");

        System.out.println("Index of Bob:" + list.indexOf("Bob"));
        System.out.println("Index of Bob:" + list.indexOf("Marco"));

        System.out.println("----------------");
        //cria uma nova lista contendo os nome que começando com a letra do filtro, usando a lista
        List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }

        System.out.println("----------------");
        //retorna o primeiro elemento começando com a letra no filtro se não existe devolve null
        String name = list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(name);


    }
}