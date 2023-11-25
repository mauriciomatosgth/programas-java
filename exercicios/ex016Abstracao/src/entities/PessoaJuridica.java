package entities;

public class PessoaJuridica extends Contribuintes {

    private Integer numeroDeFuncionarios;

    //Construtores
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(name, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    //Getter e Setter


    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    //Metodos
    @Override
    public Double imposto() {
        //return (numeroDeFuncionarios <= 10) ? getRendaAnual() * 0.16 : getRendaAnual()*0.14;
        if (numeroDeFuncionarios <= 10){
            return getRendaAnual() * 0.16;
        }else{
            return getRendaAnual() * 0.14;
        }

    }
}
