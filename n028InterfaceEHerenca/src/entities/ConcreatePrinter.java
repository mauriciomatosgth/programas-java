package entities;

public class ConcreatePrinter extends Device  implements Printer{


    public ConcreatePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("ConcreatePrinter processing: " + doc);
    }


    @Override
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
