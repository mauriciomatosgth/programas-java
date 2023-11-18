package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departmentName = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.print("Level: ");
        String levelTrabalhador = sc.nextLine();

        System.out.print("Sálario base ");
        double salarioBase = sc.nextDouble();

        Worker worker = new Worker(nomeTrabalhador,WorkerLevel.valueOf(levelTrabalhador),salarioBase,new Department(departmentName));

        System.out.print("Quantos Contratos? ");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            System.out.println("Enter contract #"+i+ " data:");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("valor por Hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração (horas):");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valorPorHora,hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre com o mês e ano para calcular o salario(MM/YYYY): ");
        String mesEAno = sc.next();
        int month = Integer.parseInt(mesEAno.substring(0,2));
        int year = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: "+ worker.getName());
        System.out.println("Departamento: "+worker.getDepartment().getName());
        System.out.println("Valor para "+ mesEAno + ": R$" + String.format("%.2f",worker.income(year,month)));



        sc.close();
    }
}
