package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
    private LocalDate dataFinal;
    private Double amount;

    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Parcelas(){}

    public Parcelas(LocalDate dataFinal, Double amount) {
        this.dataFinal = dataFinal;
        this.amount = amount;
    }


    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return  formato.format(dataFinal)
                +" - "
                + String.format("R$%.2f",amount);
    }
}
