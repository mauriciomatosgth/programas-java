package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;



    //Contrutores:
    public Rectangle(){
        super();

    }


    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //Getter e Setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //Metodos
    @Override
    public double area() {
        return width*height;
    }
}
