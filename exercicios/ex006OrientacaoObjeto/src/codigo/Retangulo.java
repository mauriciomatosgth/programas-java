package codigo;

public class Retangulo {
    public Double b;
    public Double a;

    public Double area(){
        return a*b;
    }

    public Double perimetro(){
        return (b*2)+(a*2);//pode ser tambem 2*(b+a);
    }

    public Double diagonal(){
        return Math.sqrt((a*a) + (b*b));
    }
}


