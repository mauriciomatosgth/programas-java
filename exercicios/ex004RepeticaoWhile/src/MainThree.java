import java.util.Scanner;
public class MainThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alc,gaso,dies,codigo;
        alc = gaso = dies = 0;
        System.out.println("Selecione o produto:\n" + "1.Álcool 2.Gasolina 3.Diesel 4.Fim ");
        codigo = input.nextInt();

        while(codigo != 4){
            switch(codigo){
                case 1:
                    alc ++;
                    break;
                case 2:
                    gaso++;
                    break;
                case 3:
                    dies++;
                    break;
                default:
                    System.out.println("opção invalida.");
            }
            System.out.println("Selecione outro produto:\n" + "1.Álcool 2.Gasolina 3.Diesel 4.Fim ");
            codigo = input.nextInt();
        }
        System.out.printf("Muito Obrigado!\nAlcool: %d\nGasolina: %d\nDiesel: %d",alc,gaso,dies);

    }
}
