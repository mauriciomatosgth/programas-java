package application;

import models.entities.Account;
import models.exception.Exceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Account Data:");
            System.out.print("Number:");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.print("Name Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial Balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit ");
            Double withdrawLimit = sc.nextDouble();

            Account conta = new Account(n, name, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            conta.withdraw(sc.nextDouble());
            System.out.println(conta);
        }
        catch(Exceptions e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Valor Invalido");
        }
        finally {
            System.out.println("Retire o Cartão");
        }




    }
}
