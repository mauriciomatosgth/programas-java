package programa;

import entities.Cadastro;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        Cadastro[] quartos = new Cadastro[11];
        String name, email;
        int n,q;

        System.out.print("Quantos cadastros? ");
        n = sc.nextInt();
        sc.nextLine();

        /*
        *
        for(int i = 0; i < quartos.length; i++){
           quartos[i] = new Cadastro("Desocupado","Vazio");
        }
         */

        for(int i = 0; i < n; i++){
            System.out.printf("Cadastro #%d:\n",i+1);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("E-mail: ");
            email = sc.nextLine();
            System.out.print("Qual quarto?");
            q = sc.nextInt();
            sc.nextLine();
            quartos[q] = new Cadastro(name,email);

        }
        System.out.println("Quartos Cadastrados: ");
        for(int i = 0; i < quartos.length; i++){
            if(quartos[i] != null) {
                System.out.printf("Quarto: %d - Nome: %s, Email: %s \n", i, quartos[i].getName(), quartos[i].getEmail());
            }
        }


        sc.close();
    }
}
