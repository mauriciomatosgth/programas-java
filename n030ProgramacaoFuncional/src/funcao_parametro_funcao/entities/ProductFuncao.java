package funcao_parametro_funcao.entities;

public class ProductFuncao {
    private String name;
    private Double price;

    public ProductFuncao(){}


    public ProductFuncao(String name, Double price) {
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

    public static boolean staticProductPredicate(ProductFuncao p ){
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "ProductConsumer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
