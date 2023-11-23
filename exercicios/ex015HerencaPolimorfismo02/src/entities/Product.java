package entities;

public class Product {
    private String name;
    private Double price;

    //contrutores

    public Product(){

    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }


    //Getter e Setter
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Metodos


    public String toString() {
        return
                name + String.format(" $ %.2f",price);
    }
}
