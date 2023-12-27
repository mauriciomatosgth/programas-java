package entidades;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Aluguel {
    private String modelo;
    private LocalDateTime retirada;
    private LocalDateTime retorno;
    private Double precoHora;
    private Double precoDia;

    static DateTimeFormatter formato  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //Construtores
    public Aluguel(){}

    public Aluguel(String modelo, LocalDateTime retirada, LocalDateTime retorno, Double precoHora, Double precoDia) {
        this.modelo = modelo;
        this.retirada = retirada;
        this.retorno = retorno;
        this.precoHora = precoHora;
        this.precoDia = precoDia;
    }

    //Getter e Setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        this.retirada = retirada;
    }

    public LocalDateTime getRetorno() {
        return retorno;
    }

    public void setRetorno(LocalDateTime retorno) {
        this.retorno = retorno;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }


    //Metodos







    public Double calculoDePagamento(){
        long milis = ChronoUnit.MILLIS.between(retirada,retorno);
        int horas = (int)(milis / 3600000);
        int min = (int) milis / 60000  % 60;
        double valor = 0.0;
        if(horas > 12){

            if(horas%24 > 0){
                valor = (double)(horas/24 +1)*precoDia;
            }else{
               valor = (double)horas/24*precoDia;
            }
        }else if(horas <12 && horas >= 0){
            if(min%60 != 0){
                valor = precoHora* (horas+1);
            }else{
                valor = precoHora * horas;
            }

        return valor;
        }


        return valor;
    }


    public Double imposto(){
        double imposto = 0.0;
        double valor  = calculoDePagamento();
        if (valor > 100.0){
            imposto = valor*0.15;
        }
        else if (valor > 0.0){
           imposto = valor*0.20;
        }

        return imposto;
    }

}
