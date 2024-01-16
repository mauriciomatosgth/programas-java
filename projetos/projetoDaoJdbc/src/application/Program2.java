package application;

import db.DbException;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.SQLException;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("=== TEST 1 - FindById ===");

       DepartmentDao dp = DaoFactory.createDepartmentDao() ;

        System.out.println(dp.findById(2));


        System.out.println("\n=== TEST 2 - FindAll ===");

        for(Department d : dp.findAll()){
            System.out.println(d);

        }

        System.out.println("\n=== TEST 3 - Insert ===");

       // Department department = new Department(null, "Carros");

        //dp.insert(department);
//        if(department.getId() != null){
//            System.out.printf("Categoria inserida com sucesso" +
//                    "\nNumero categoria: %d " +
//                    "\nNome categoria: %s\n",department.getId(),department.getName());

//        }

        System.out.println("\n=== TEST 4 - Update ===");

            Department department1 = dp.findById(6);
            department1.setName("Ventiladores");
            dp.update(department1);
            System.out.println("Departamento Atualizado com sucesso");

        System.out.println("\n=== TEST 5 - Delete ===");

        dp.deleteById(11);
        System.out.println("Deletado com Sucesso");




    }
}
