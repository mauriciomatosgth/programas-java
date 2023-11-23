package entities;

public abstract class Contribuintes {
    private String name;
    private Double rendaAnual;

    //Construtores

    public Contribuintes(){

    }

    public Contribuintes(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    //Getter e Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    //metodos

    public abstract Double imposto();


}
