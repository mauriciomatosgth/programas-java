package programa;

import java.util.Locale;
import java.util.Scanner;

public class ExAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        double alturaMedia= 0.0,somaAltura = 0.0 , porcentagemIdade = 0.0;                ;
        int num,menorIdade  = 0;
        num = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[num];
        int[] idades = new int[num];
        double[] alturas = new double[num];

         ;
        for (int i = 0; i < num; i++ ){
            System.out.printf("Dados da %da pessoa:\n",i+1);

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            if(idades[i] < 16){
                menorIdade +=1;
            }

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();

            somaAltura+= alturas[i];
        }

        alturaMedia = somaAltura/alturas.length;
        porcentagemIdade = (double)menorIdade/idades.length* 100;

        System.out.printf("Altura média: %.2f\n",alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",porcentagemIdade);

        for (int i = 0; i < num; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

    sc.close();
    }
}
