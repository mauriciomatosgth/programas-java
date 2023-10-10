package programa;

import codigo.Holder;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Holder cliente;
        int account;
        String holder;
        char teste;

        //entrada de dados
        System.out.print("Enter account number: ");
        account = input.nextInt();

        input.nextLine();
        System.out.print("Enter account holder: ");
        holder = input.nextLine();



        System.out.print("Is there an initial deposit? (y/n)");
        teste = input.next().charAt(0);



        if (teste == 'y'){

            System.out.print("Enter initial deposit value: ");
            double balance = input.nextDouble();
            cliente = new Holder(account,holder,balance);//sobrecarga
        }
        else{
            cliente = new Holder(account,holder);//sobrecarga
        }
        System.out.println();
        System.out.println("Account data:\n"+cliente.toString());


        //continuação add deposito e retirada.
        System.out.println();
        System.out.print("Enter a deposit value: ");
        cliente.depositBalance(input.nextDouble());
        System.out.println("Updated account data: \n" + cliente.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        cliente.withdrawBalance(input.nextDouble());
        System.out.println("Updated account data: \n" + cliente.toString());








        input.close();



    }
}