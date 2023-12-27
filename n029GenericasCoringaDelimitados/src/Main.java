import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        List<Rectangle> myRectangle = new ArrayList<>();
        myRectangle.add(new Rectangle(2.0,3.0));
        myRectangle.add(new Rectangle(4.0,3.0));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));
        System.out.println("Total area: " + totalArea(myRectangle));
    }



    public static double totalArea(List<? extends Shape> list){

        double sum = 0.0;
        for(Shape s: list){
            sum += s.area();
        }
        return sum;
    }


}