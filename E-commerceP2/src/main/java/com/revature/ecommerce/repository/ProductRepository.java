package com.revature.ecommerce.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ecommerce.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{
	
	List<Products>getProductsByManufacturer(String Manufacturer);
	List<Products>getAllProducts();
}
