package com.estudospring.cursojava.repositories;

import com.estudospring.cursojava.entities.Category;
import com.estudospring.cursojava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {

}
