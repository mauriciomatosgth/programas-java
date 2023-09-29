import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // ----soma----:

       /*
       * int n1,n2,soma ;

        n1 = input.nextInt();
        n2 = input.nextInt();
        soma = n1+n2;
        System.out.printf("O resultado da soma entre %d + %d é : %d \n",n1,n2,soma);
        */

        //-----valor do raio de um círculo:-----

        /*
        *
        double pi,raio,area;

        raio = input.nextDouble();
        pi = 3.14159;
        area = Math.pow(raio,2)*pi;
        System.out.printf("O valor da área é de : %.4f",area);
         */

        //-----Mostra o diferencial-----

        /*
        *int a,b,c,d,diferenca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        diferenca = (a * b) - (c * d);
        System.out.println("A diferença é de: " + diferenca);
        */

        //---código do funcionario e quanto ele ganha.---

        /*
        *
        int numeroFuncionario,horaTrab;
        double valorHora,salario;

        numeroFuncionario = input.nextInt();
        horaTrab = input.nextInt();
        valorHora = input.nextDouble();
        salario = horaTrab * valorHora;
        System.out.printf("Numero do funcionario é: %d e o salario dele é: %.2f U$ \n ",numeroFuncionario,salario);

         */

        //--------pedir o codigo a quantidade e o valor de 2 produtos-------------
        /*
        *
        int codigo,codigo2,quantidade,quantidade2;
        double valor ,valor2, valorApagar;

        codigo = input.nextInt();
        quantidade = input.nextInt();
        valor = input.nextDouble();

        codigo2 = input.nextInt();
        quantidade2 = input.nextInt();
        valor2 = input.nextDouble();

        valorApagar = (valor*quantidade) + (quantidade2*valor2);
        System.out.printf("O codigo das peças é %d,%d , esta levando %d,%d unidade, o valor a pagar é: %.2f ",codigo,codigo2,quantidade,quantidade2,valorApagar);

         */

        //------ fazer esses calculos--------

        double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo,pi;
        pi = 3.14159;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        //formulas
        triangulo = (a * c) / 2;
        circulo = pi * Math.pow(c,2);
        trapezio = ((a+b)*c) / 2;
        quadrado = Math.pow(b,2);
        retangulo = a*b;

        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETÂNGULO: %.3f\n",retangulo);



    }
}