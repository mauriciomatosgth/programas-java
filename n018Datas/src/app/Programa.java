package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Programa {
    public static void main(String[] args) {

        //Documentação da classe
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now(); // instancia somente a data local
        LocalDateTime d02 = LocalDateTime.now();// instancia data e hora local
        Instant d03 = Instant.now();//instancia do Horario de Londres GMT

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);

        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,7,20,1,30);


        System.out.println("Somente a Data "+d01);
        System.out.println("Data e Hora " + d02);
        System.out.println("Horario Londres GMT "+d03);
        System.out.println("Parse "+ d04);
        System.out.println("Parse DATE TIME "+d05);
        System.out.println("Instant Parse zulu time "+d06);
        //System.out.println("Instant Parse -3:00 "+d07);
        System.out.println("d08 " + d08);
        System.out.println("d09 " + d09);
        System.out.println("d10 "+d10);
        System.out.println("d11"+d11);


    }
}