package principal;

import entidades.Aluguel;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formato  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime hoje = LocalDateTime.now();

        String hojeFormatado = formato.format(hoje);
        LocalDate worldCupDate = LocalDate.of(2018, Month.JUNE, 5);
        int anos =   hoje.getYear() - worldCupDate.getYear();

       // LocalDateTime retirada = LocalDateTime.parse("25/06/2018 10:30",formato);
        //LocalDateTime retorno = LocalDateTime.parse("27/06/2018 11:40",formato);


        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(),formato);

        System.out.println("Retorno (dd/MM/yyyy hh:mm):");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(),formato);

        System.out.println("Entre com o preço por hora: ");
        double precoHora = sc.nextDouble();

        System.out.println("Entre com o preço por dia: ");
        double precoDia = sc.nextDouble();

        Aluguel aluguel = new Aluguel(modelo,retirada,retorno,precoHora,precoDia);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + aluguel.calculoDePagamento());
        System.out.printf("Imposto: %.2f\n", aluguel.imposto());
        System.out.printf("Pagamento total: %.2f\n", (aluguel.calculoDePagamento()+ aluguel.imposto()));








        /*
        long segundos = ( qtdDias / 1000 ) % 60;      // se não precisar de segundos, basta remover esta linha.
        long minutos  = ( qtdDias / 60000 ) % 60;     // 60000   = 60 * 1000
        long horas    = qtdDias / 3600000;            // 3600000 = 60 * 60 * 1000
        long dias     = qtdDias/86400000  ;          // 86400000 = 24 * 60 * 60 * 1000
        long resto     = (qtdDias % 86400000)/3600000  ;          // 86400000 = 24 * 60 * 60 * 1000

        System.out.printf(  "%02d:%02d,  %d Dias %02d Horas \n", horas, minutos,dias,resto  );
         */





        Aluguel contrato = new Aluguel("civic",retirada,retorno,10.0,130.0);

       // System.out.println(contrato.retornoDeHoras(retirada,retorno));
        //System.out.println(qtdDias);


       // System.out.println(anos + " years");
       // System.out.println(hoje.format(formato));



sc.close();
    }
}
