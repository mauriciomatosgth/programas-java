package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate date;
    private Double valorTotal;

    private List<Parcelas> lista = new ArrayList<>();

    public Contrato(){}

    public Contrato(Integer numero, LocalDate date, Double valorTotal) {
        this.numero = numero;
        this.date = date;
        this.valorTotal = valorTotal;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getLista() {
        return lista;
    }
}
