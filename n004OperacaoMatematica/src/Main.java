public class Main {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;

        double a,b,c,delta,x1,x2;


        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25);
        System.out.printf("A raiz quadra de %.0f é: %f \n",x,a);
        System.out.printf("A raiz quadra de %.0f é: %f \n",y,b);
        System.out.printf("A raiz quadra de %.0f é: %f \n",z,c);

        a = Math.pow(x,y);
        b = Math.pow(x,2.0);
        c = Math.pow(5.0,2.0);
        System.out.printf("%.0f elevado a %.0f é : %.1f \n",x,y,a );
        System.out.printf("%.0f elevado a %.0f é : %.1f \n",y,2.0,b );
        System.out.printf("%.0f elevado a %.0f é : %.1f \n",5.0,2.0,c );

        a = Math.abs(y);
        b = Math.abs(z);

        System.out.printf("O numero absoluto de %.1f é: %.1f \n",y,a );
        System.out.printf("O numero absoluto de %.1f é: %.1f \n",z,b );


        delta = Math.pow(b,2.0) - 4*a*c;

        x1 = (-b + Math.sqrt(delta))/(2.0 * a);
        x2 = (-b - Math.sqrt(delta))/(2.0 * a);

        // mais informações: java.lang.Math
    }
}