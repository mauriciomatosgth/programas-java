package funcao_parametro_funcao.service;


import funcao_parametro_funcao.entities.ProductFuncao;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<ProductFuncao> list, Predicate<ProductFuncao> criteria){
        double sum = 0.0;

        for (ProductFuncao p : list){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
