package com.estudospring.cursojava.repositories;

import com.estudospring.cursojava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
