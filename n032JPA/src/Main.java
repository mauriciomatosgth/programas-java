import dominio.Pessoa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1,"Carlos da Silva","carlos@gmail.com");
        Pessoa p2 = new Pessoa(2,"Joaquim Torres","joaquim@gmail.com");
        Pessoa p3 = new Pessoa(3,"Ana Maria","ana@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}