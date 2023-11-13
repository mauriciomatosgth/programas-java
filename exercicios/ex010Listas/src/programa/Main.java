package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();
        int n;

        System.out.println("Quantos Funcionarios vai registrar?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("REGISTRO %d#\n", i + 1);

            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salario = sc.nextDouble();
            lista.add(new Funcionario(id, name, salario));
        }

        System.out.print("Qual ID do Funcionario?");
        int v = sc.nextInt();

        //ele vai pegar o indice verificando o filtro
        // ##1 Funcionario verificar = lista.stream().filter(x -> x.getId()== v).findFirst().orElse(null);

        //tambem um jeito de resolver esse problema usando uma função criada no final do main que compara item por item
        Integer idVerificar = position(lista, v);

        if (idVerificar == null) {
            System.out.println("Funcionario não existe.");
        } else {
            System.out.print("Porcentagem do aumento: ");
            double porcento = sc.nextDouble();
            lista.get(idVerificar).addAumento(porcento);
            //##1 verificar.addAumento(porcento);

        }


        System.out.println("Lista de Funcionarios:");

        for (Funcionario x : lista) {
            System.out.println(x);
        }

        sc.close();
    }


    public static Integer position(List<Funcionario> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}