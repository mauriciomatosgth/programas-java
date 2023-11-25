package application;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> contribuintes = new ArrayList<>();

        System.out.print("Numeros de Contribuintes: ");
        int n  = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("Dados do Contribuinte #%d\n",i);
            System.out.print("Pessoa Fisica ou Juridica (f/j)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Renda Anual: ");
            double renda  = sc.nextDouble();

            if (ch == 'f'){
                System.out.print("Gastos com Saúde: ");
                double gastoSaude = sc.nextDouble();

                contribuintes.add(new PessoaFisica(name,renda,gastoSaude));
            }else{
                System.out.print("Numero de funcionarios: ");
                int qntFuncionarios = sc.nextInt();

                contribuintes.add(new PessoaJuridica(name,renda,qntFuncionarios));
            }

        }

        System.out.println();
        System.out.println("Impostos dos Contribuintes");

        double soma = 0.0;
        for(Contribuintes pessoa: contribuintes){
            System.out.printf(pessoa.getName()+ " $ %.2f\n", pessoa.imposto());
            soma+= pessoa.imposto();
        }

        System.out.printf("Total: $%.2f",soma);









        sc.close();
    }
}
