package interface_funcional_pridicate.interfaces;

import comparator.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate  implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
