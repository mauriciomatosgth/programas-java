package codigo;

public class ConversorDeDolar {
    public static Double IOF = 0.06;

    public static double conversor(double quantidade, double valor){
        return (quantidade*valor) + (quantidade*valor) * IOF;
    }
}
