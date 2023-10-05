package codigo;

public class Funcionario {
    public String nome;
    public Double salarioBruto;
    public Double imposto;

    public Double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void addSalario(double porcentagem){
         salarioBruto+=(salarioBruto*(porcentagem/100));

    }


    public String toString(){
        return nome +
                ","+
               String.format(" $ %.2f.", salarioLiquido());
    }


}
