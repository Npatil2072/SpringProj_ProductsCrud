package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	
}
