package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    //Construtores

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //Getter e Setter

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    //Metodos
     public Double totalPrice(){
        return super.getPrice()+customsFee;
     }

     @Override
     public String toString() {
         return
                 super.getName() +
                 String.format(" $ %.2f",totalPrice()) +
                 String.format(" (Customs fee: $ %.2f)", customsFee)
                 ;
     }
}
