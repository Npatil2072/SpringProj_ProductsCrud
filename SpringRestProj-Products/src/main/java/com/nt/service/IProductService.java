package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.model.Product;

public interface IProductService {
	
//	 public Iterable<Product> getAllProducts();
//	 List<Product> getAllProduct();
	 Page<Product> getAllCategory(int page, int size);
	 
//	 public String saveProduct();
	 String saveProduct(Product product);
	 
//	 public String getById();
	 Product getProductById(Integer cId);
	 
//	 public String updateProductById();
//	 String updateProductById(Product prod);
	 String updateProductById(Integer id, Product prod);
	 
//	 public String deleteProductById();
	 String deleteProductById(Integer cId);








}
