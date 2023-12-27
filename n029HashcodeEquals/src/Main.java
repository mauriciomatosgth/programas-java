// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";



        Cliente c1 = new Cliente("Maria","maria@gmail.com");
        Cliente c2 = new Cliente("Maria","maria@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);
        System.out.println(c1.hashCode() == c2.hashCode());
    }
}