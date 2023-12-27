import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       Map<String, String> cookies = new TreeMap<>();

       cookies.put("username", "Maria");
       cookies.put("email", "maria@gmail.com");
       cookies.put("phone","997118911");


       cookies.remove("email");
       cookies.put("phone","997878989");


        System.out.println("Contains 'phone'  key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size()ve);

        System.out.println("All Cookies");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}