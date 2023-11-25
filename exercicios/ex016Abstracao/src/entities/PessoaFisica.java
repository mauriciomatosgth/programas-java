package entities;

public class PessoaFisica extends Contribuintes {
    private Double gastoSaude;


    //Construtores
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    //Getter e Setter


    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    //Metodos
    @Override
    public  Double imposto(){
        //double imposto = (getRendaAnual() < 20000.00) ? getRendaAnual()*0.15 : getRendaAnual()*0.25;

        double imposto;
        if (getRendaAnual() < 20000.00){
            imposto =getRendaAnual()*0.15;
        }else{
            imposto = getRendaAnual()*0.25;
        }
        imposto -= gastoSaude/2;
        if(imposto < 0.0){
            imposto = 0.0;
        }

        return imposto;
    }
}
