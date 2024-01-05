package funcao_parametro_funcao;

import funcao_parametro_funcao.entities.ProductFuncao;
import funcao_parametro_funcao.service.ProductService;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramTest6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<ProductFuncao> list = new ArrayList<>();

        list.add(new ProductFuncao("Tv", 900.00));
        list.add(new ProductFuncao("Mouse", 50.00));
        list.add(new ProductFuncao("Tablet", 350.50));
        list.add(new ProductFuncao("HD Case", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list,p -> p.getName().charAt(0) == 'M' );

        System.out.printf("Sum = %.2f\n",sum );
    }

}
