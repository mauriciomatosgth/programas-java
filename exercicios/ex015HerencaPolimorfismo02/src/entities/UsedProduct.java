package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Construtores
    public UsedProduct(){
        super();

    }

    public UsedProduct(String name, Double price, Date manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //Getter e Setter

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //Metodos

    @Override
    public String toString() {
        return
                super.getName()
                + String.format(" (used) $ %.2f",super.getPrice()) +
                " (Manufacture date: " + sdf.format(manufactureDate)+ ")"
                ;
    }
}
