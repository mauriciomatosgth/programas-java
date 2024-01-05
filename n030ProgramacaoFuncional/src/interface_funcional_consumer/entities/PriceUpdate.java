package interface_funcional_consumer.entities;

import interface_funcional_consumer.entities.ProductConsumer;
import java.util.function.Consumer;

public class PriceUpdate implements Consumer<ProductConsumer> {
    @Override
    public void accept(ProductConsumer productConsumer) {
        productConsumer.setPrice(productConsumer.getPrice()*1.1);
    }
}
