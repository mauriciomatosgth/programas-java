package application;

import entities.ComboDevice;
import entities.ConcreatePrinter;
import entities.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcreatePrinter p = new ConcreatePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");


        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: "+ s.scan());


        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());

    }
}
