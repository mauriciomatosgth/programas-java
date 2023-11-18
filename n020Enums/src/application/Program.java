package application;

import entidade.Ordem;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Ordem order = new Ordem(1080,new Date(), OrderStatus.ESPERANDO_PAGAMENTO);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.ENTREGUE;

        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);

    }
}
