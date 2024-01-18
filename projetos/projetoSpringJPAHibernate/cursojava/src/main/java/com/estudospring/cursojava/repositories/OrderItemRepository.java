package com.estudospring.cursojava.repositories;

import com.estudospring.cursojava.entities.OrderItem;
import com.estudospring.cursojava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
