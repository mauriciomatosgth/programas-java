package produtos;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
    public String name;
    public double preco;
    public int quant;

    public double valorEstoque(){
        return quant*preco;
    }

    public void addProduto(int quant){
        this.quant += quant;
    }

    public void removeProduto(int quant){
        this.quant -= quant;
    }

    public String toString(){
        return name
                +", R$ "
                + String.format("%.2f",preco)
                +", "
                + quant
                + " unidades, Total: "
                + String.format("R$ %.2f",valorEstoque());
    }


}
