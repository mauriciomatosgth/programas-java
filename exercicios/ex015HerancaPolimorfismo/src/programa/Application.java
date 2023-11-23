package programa;

import entidades.Employee;
import entidades.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> lista = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0 ;i<n ;i++){
            System.out.printf("Employee #%d data:\n",i+1);
            System.out.print("Outsourced (y/n)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value Per Hours: ");
            double  valuePerHour = sc.nextDouble();
            if(answer == 'y'){
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                lista.add(new OutsourceEmployee(name,hours,valuePerHour,additional));
            }else {
                lista.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println("PAYMENTS: ");
        for(Employee c: lista){

            System.out.println(c);
        }


       sc.close();
    }
}
