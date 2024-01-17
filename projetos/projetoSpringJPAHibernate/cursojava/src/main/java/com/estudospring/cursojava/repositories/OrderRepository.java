package com.estudospring.cursojava.repositories;

import com.estudospring.cursojava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {

}
