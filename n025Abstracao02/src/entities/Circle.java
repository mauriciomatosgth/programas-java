package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private double radius;

    //Construtores

    public Circle(){
        super();
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    //Getter e Setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //metodos

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
