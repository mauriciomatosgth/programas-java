import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String produto1  = "Computer";
        String produto2 = "Office desk";

        int idade = 30;
        int code = 5290;

        char genero = 'M';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medidas = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f \n",produto1,preco1);
        System.out.printf("%s, which price is $ %.2f \n\n",produto2,preco2);

        System.out.printf("Record: %d years old, code %d and gender: %s \n\n",idade,code,genero);

        System.out.println("Measure with eight decimal places: " + medidas);
        System.out.printf("Rouded (three decimal places): %.3f%n",medidas);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f%n",medidas);

    }
}