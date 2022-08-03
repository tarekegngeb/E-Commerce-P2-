package com.revature.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ecommerce.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{

}
