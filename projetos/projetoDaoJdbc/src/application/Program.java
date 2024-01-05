package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {





        SellerDao sellerDao = DaoFactory.createSellerdao();

        System.out.println("=== TEST 1: seller FindById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller FindByIdDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller s : list){
            System.out.println(s);
        }

        System.out.println("\n=== TEST 3: seller FindAll ===");

        list = sellerDao.findAll();
        for (Seller s : list){
            System.out.println(s);
        }

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null,"Greg", "greg@gmail.com", new Date(), 4000.0,department);

        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());





    }


}
