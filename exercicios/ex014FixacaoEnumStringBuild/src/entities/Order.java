package entities;

import enums.entities.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;


    private List<OrderItem> productList = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat csdf = new SimpleDateFormat("dd/MM/yyyy");


    //construct
    public Order(){}

    public Order(Date moment, OrderStatus status,Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;

    }

    //Getter e Setter


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getProductList() {
        return productList;
    }

    //Metodos

    public void addItem(OrderItem item){
        productList.add(item);
    }

    public void removeItem(OrderItem item){
        productList.remove(item);
    }

    public double total(){
        double total = 0;
        for (OrderItem c: productList) {
          total += c.subTotal();
        }
        return total;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY \n");
        sb.append("Order moment: "+sdf.format(moment)+"\n");
        sb.append("Order status: "+status+"\n");
        sb.append("Client: "+ client.getName() +" ("+csdf.format(client.getBirthDate())+") - " + client.getEmail()+"\n");
        sb.append("Order items: \n");
        for (OrderItem c: productList) {
            sb.append(c.getProduct().getName()+ String.format(", $%.2f",+c.getProduct().getPrice())+", Quantity: "+c.getQuantity()+String.format(", Subtotal: $%.2f", c.subTotal()) + "\n");
        }
        sb.append(String.format("Total price: $%.2f", total()));
    return sb.toString();

    }
}
