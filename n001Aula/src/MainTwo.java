import java.util.Locale;

public class MainTwo {

    public static void main(String[] args) {

        System.out.println("Olá Mundo!");

        /*
        *int n1 = 10;
        *int n2 = 10;
        */
        byte soma = 20;
        double deci = 3.567;
        String nome = "Mauricio";
        int idade = 28;
        double renda = 4000.00;


        System.out.printf("O numero float é %.2f \n",deci);
        System.out.println("O resultado da conta é : " + soma);
        Locale.setDefault(Locale.US);//usado para printa o . na separação do numero float
        System.out.printf("O numero float é %.4f \n",deci);

        //concatenização

        System.out.println("Resultado = " + soma + " Reais");

        //concatenização com printf

        System.out.printf("Resultado = %.2f reais \n",deci);

        System.out.printf("%s tem %d anos e recebe um salario de %.2fR$",nome,idade,renda);


    }
}
