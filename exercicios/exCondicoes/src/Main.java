import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // --------EXERCICIOS DE DECIÇÃO---------------

        //----- verificar se é negativo ou não --------------
    /*
    *
        int num;

        System.out.print("Digite um numero: ");
        num = input.nextInt();

        if(num < 0){
            System.out.println("NEGATIVO!");
        }
        else{
            System.out.println("NÃO NEGATIVO!");
        }
         input.close();

     */

        //------ se é impar ou par ------------

    /*
    *
    int num1;

        System.out.print("Digite um numero: ");
        num1 = input.nextInt();

        if(num1 % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
         input.close();

     */

        //-------Se são multiplos ----------

    /*
    *
    int num2,num3;

        System.out.print("Digite um numero: ");
        num2 = input.nextInt();

        System.out.print("Digite outro numero: ");
        num3 = input.nextInt();

        if(num2 % num3 == 0 || num3 % num2 == 0 ){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }
         input.close();


     */

        // ------ calcular a hora de um jogo ---------


    /*
    *
    int num4,num5,resultado;

        System.out.print("Digite a hora inicial: ");
        num4 = input.nextInt();


        System.out.print("Digite a hora final: ");
        num5 = input.nextInt();


        if(num4 < num5){
            resultado = num5 - num4;
        }
        else  {
            resultado = 24 - num4 + num5;
        }



        System.out.printf("O jogo durou %d hora(s)",resultado);
        input.close();

     */

        //----- ler o codigo de um item e mostra as informações -------


        int code, quantidade;
        double valor, valorDaConta;
        String item;
        item = "";
        valor = 0;

        System.out.println("qual o cidigo do item [1],[2],[3],[4],[5]");
        code = input.nextInt();

        switch(code) {
            case 1:
                valor = 4.00;
                item = "Cachorro Quente";
                break;
            case 2:
                valor = 4.50;
                item = "X-Salada";
                break;
            case 3:
                valor = 5.00;
                item = "X-Bacon";
                break;
            case 4:
                valor = 2.00;
                item = "Torrada simples";
                break;
            case 5:
                valor = 1.50;
                item = "Refrigerante";
                break;
            default:
                System.out.println("Escolha invalida.");
            }


        System.out.printf("O item escolhido foi %s no valor de R$ %.2f quantos vai querer? ", item, valor);
        quantidade = input.nextInt();

        valorDaConta = valor * quantidade;

        System.out.printf("O valor da conta deu: R$%.2f", valorDaConta);

    input.close();



    //-----Verificar em qual intervalo esta o numero digitado -----

    /*
    *
    double intervalo;

        System.out.print("Digite um Valor: ");
        intervalo = input.nextDouble();

        if(intervalo < 0 || intervalo > 100){
            System.out.println("fora de intervalo");
        }

        else if(intervalo <= 25){
            System.out.println("intervalo [0,25]");
        }
        else if(intervalo <= 50){
            System.out.println("intervalo (25,50]");
        }
        else if(intervalo <= 75){
            System.out.println("intervalo (50,75]");
        }
        else{
            System.out.println("intervalo (75,100]");
        }
        input.close();

     */

    // ------ representar as coordenadas de um ponto em um plano-------

        /*
        *
    double x,y;

        System.out.print("Digite o valor X: ");
        x = input.nextDouble();

        System.out.print("Digite o valor Y: ");
        y = input.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x == 0.0){
            System.out.println("Eixo Y");
        }
        else if(y == 0.0){
            System.out.println("Eixo X");
        }
        else if(x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if(x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if(x < 0 && y > 0){
            System.out.println("Q2");
        }
        else{
            System.out.println("Q3");
        }
    input.close();

         */


    // ---- calculo de imposto de renda ----
    /*
    *
    double salario,imposto;


        System.out.print("Qual o Salario? ");
        salario = input.nextDouble();

        if (salario < 0 ){
            System.out.println("Valor incorreto.");
        }
        else if(salario <= 2000.00){
            System.out.println("Isento.");
        }
        else if(salario <= 3000.00){
            imposto = (salario - 2000)*0.08;
            System.out.printf("R$ %.2f \n",imposto);
        }
        else if (salario <= 4500.00){
            imposto = ((salario - 3000)*0.18)+((3000 - 2000)*0.08) ;
            System.out.printf("R$ %.2f \n",imposto);
        }
        else if(salario > 4500.00){
            imposto = ((salario - 4500)*0.28)+((4500 - 3000)*0.18)+((3000 - 2000)*0.08);
            System.out.printf("R$ %.2f \n",imposto);
        }

        input.close();

     */





    }
}