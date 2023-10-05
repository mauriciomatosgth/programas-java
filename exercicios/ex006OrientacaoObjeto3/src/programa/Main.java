package programa;

import codigo.Estudante;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        //criando objeto
        Estudante estudante = new Estudante();

        //pedindo os argumentos
        System.out.print("Nome do Aluno: ");
        estudante.nome = input.nextLine();
        System.out.print("Nota do Primeiro Trimestre: ");
        estudante.nota1 = input.nextDouble();
        System.out.print("Nota do Segundo Trimestre: ");
        estudante.nota2 = input.nextDouble();
        System.out.print("Nota do Terceiro Trimestre: ");
        estudante.nota3 = input.nextDouble();

        estudante.avaliadorDeNotas();

        input.close();
    }
}