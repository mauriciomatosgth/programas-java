package interface_funcional_function.util;

import interface_funcional_function.entities.ProductFunction;

import java.util.function.Function;

public class UpperCaseName implements Function<ProductFunction,String> {
    @Override
    public String apply(ProductFunction p) {
        return p.getName().toUpperCase();
    }
}
