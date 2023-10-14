package programa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num,quantHomem,quantMulher;
        double somaAltura, mediaMulher,menorAltura,maiorAltura;


        System.out.print("Quantos pessoas serao digitadas? ");
        num = sc.nextInt();

        double[] altura = new double[num];
        char[] sexo = new char[num];

        for(int i = 0; i < num; i++){
            System.out.printf("Altura da %da pessoa:  ",i+1);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %da pessoa:  ",i+1);
            sexo[i] = sc.next().charAt(0);

        }
        menorAltura = 0.0;
        maiorAltura = 0.0;
        somaAltura = 0.0;
        quantHomem = 0;
        quantMulher = 0;

        for(int i=0; i<num; i++) {
            if(i == 0){
                menorAltura = altura[i];
                maiorAltura = altura[i];
            }
            else{
                if(altura[i] < menorAltura){
                    menorAltura = altura[i];
                }
                else if(altura[i] > maiorAltura){
                    maiorAltura = altura[i];
                }
            }

            if(sexo[i]=='f'){
                somaAltura+=altura[i];
                quantMulher++;
            }
            else{
                quantHomem++;
            }
        }

        mediaMulher = somaAltura/quantMulher;

        System.out.printf("Menor altura = %.2f \n",menorAltura);
        System.out.printf("Maior altura = %.2f \n",maiorAltura);
        System.out.printf("Media das altura das mulheres = %.2f \n",mediaMulher);
        System.out.printf("Numero de homens = %d \n",quantHomem);


    }
}
