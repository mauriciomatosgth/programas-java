package programa;

import java.util.Locale;
import java.util.Scanner;
import codigo.Funcionario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //criando objeto
        Funcionario funcionario;
        funcionario = new Funcionario();

        //pedindo dados
        System.out.print("Nome: ");
        funcionario.nome = input.nextLine();
        System.out.print("Sálario Bruto: ");
        funcionario.salarioBruto = input.nextDouble();
        System.out.print("Valor do imposto: ");
        funcionario.imposto = input.nextDouble();

        //escrevendo dados.
        System.out.println("Dados: " + funcionario.toString());
        System.out.print("Qual porcentagem você quer adicionar ao salario?");

        funcionario.addSalario(input.nextDouble());
        System.out.println("Update de dados: " + funcionario.toString());

        input.close();

    }
}