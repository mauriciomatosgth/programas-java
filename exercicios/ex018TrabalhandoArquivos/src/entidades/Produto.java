package entidades;

import java.util.Locale;

public class Produto {

    private String nome;
    private double valor;
    private int quantidade;


    //construtores

    public Produto(){}

    public Produto(String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    //Getter e Setter

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }



    public int getQuantidade() {
        return quantidade;
    }

    // Metodos


    public double somaTotal(){
        return valor * quantidade;
    }

    @Override
    public String toString(){
        Locale.setDefault(Locale.US);
        return getNome() + String.format(", %.2f", somaTotal());
    }
}
