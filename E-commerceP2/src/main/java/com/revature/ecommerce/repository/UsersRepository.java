package com.revature.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ecommerce.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	List<Users>getAllUsers();
	
}
