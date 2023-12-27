package application;

import entities.Contrato;
import entities.Parcelas;
import entities.procedimentos.ContractService;
import entities.procedimentos.PaypalService;
import entities.procedimentos.ServicoDePagamentoOnline;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(),formato);
        System.out.print("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero,data,valorTotal);

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();


        ContractService cont = new ContractService(new PaypalService());

        cont.processoDeContrato(contrato,parcelas);

        System.out.println("Parcelas:");
        for(Parcelas p : contrato.getLista()){
            System.out.println(p);

        }

        System.out.println(contrato.getNumero());

        sc.close();
    }
}
