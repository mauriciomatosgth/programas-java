package com.estudospring.cursojava.repositories;

import com.estudospring.cursojava.entities.Category;
import com.estudospring.cursojava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {

}
