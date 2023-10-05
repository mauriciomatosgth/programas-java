package applicacao;

import produtos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Produto produto;
        produto = new Produto();

        /*
        * Os Codigos a baixo coletam as informações
        * do produto.
        */
        System.out.println("Digite os Dados do produto:");
        System.out.print("Nome: ");
        produto.name = input.nextLine().toUpperCase();

        System.out.print("Preço: ");
        produto.preco = input.nextDouble();

        System.out.print("Qual a quantidade em Estoque: ");
        produto.quant = input.nextInt();

        System.out.println("Dados do Produto: "+produto);

        System.out.print("Entre a quantidade a ser adicionado no estoque: ");
        produto.addProduto(input.nextInt());
        System.out.println("Update do Produto: "+produto);

        System.out.print("Entre a quantidade a ser retirada no estoque: ");
        produto.removeProduto(input.nextInt());
        System.out.println("Update do Produto: "+produto);

        input.close();
    }
}