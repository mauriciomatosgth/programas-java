import java.util.Scanner;
public class MainTwo {
    public static void main(String[] args) {
        int r,num,entrada,saida;
        entrada = 0;
        saida = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite Valor de repetição: ");
        r = input.nextInt();



        for(int i = 0; i < r; i++){
            System.out.print("Digite um numero:  ");
            num = input.nextInt();

            if(num >= 10 && num <=20){
                entrada +=1;
            }
            else{
                saida+= 1;
            }


        }
        System.out.printf("in: %d\nout: %d\n",entrada,saida);


    }
}
