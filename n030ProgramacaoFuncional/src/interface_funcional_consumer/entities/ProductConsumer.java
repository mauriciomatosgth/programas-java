package interface_funcional_consumer.entities;

import comparator.entities.Product;

public class ProductConsumer {
    private String name;
    private Double price;

    public ProductConsumer(){}


    public ProductConsumer(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   public static void staticPriceUpdate(ProductConsumer p){
        p.setPrice(p.getPrice()*1.1);
   }

    public void nonStaticPriceUpdate(){
        setPrice(getPrice()*1.1);
    }

    @Override
    public String toString() {
        return "ProductConsumer{" +
                "name='" + name + '\'' +
                String.format(", price= %.2f", price) +
                '}';
    }
}
