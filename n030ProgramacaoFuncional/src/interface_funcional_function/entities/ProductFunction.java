package interface_funcional_function.entities;

import interface_funcional_consumer.entities.ProductConsumer;

public class ProductFunction {
    private String name;
    private Double price;

    public ProductFunction(){}


    public ProductFunction(String name, Double price) {
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

    public static String staticUpperCaseName(ProductFunction p){
        return p.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName(){
        return getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "ProductConsumer{" +
                "name='" + name + '\'' +
                String.format(", price= %.2f", price) +
                '}';
    }
}
