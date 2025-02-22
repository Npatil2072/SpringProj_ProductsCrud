package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.model.Product;
import com.nt.repo.ProductRepo;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepo repo;

//	@Override
//	public List<Product> getAllProduct() {
//		 
//		return repo.findAll();
//	}
	@Override
	public Page<Product> getAllCategory(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findAll(pageable);
	}

	@Override
	public String saveProduct(Product product) {
		Product prod=repo.save(product);
		return "Product is saved"+prod.toString();
	}

	@Override
	public Product getProductById(Integer cId) {
		Optional<Product> ate=repo.findById(cId);
		Product prod=null;
		if(ate.isPresent()) {
			prod =repo.getById(cId);
		return null;		 
		}
		return prod;		 
	}

	@Override
	public String updateProductById(Integer id,Product prod) {
		Optional<Product> ate=repo.findById(id);
		if(ate.isPresent()) {
		repo.save(prod);
		return "Updatation is completed";		 
		}
		return "Product not Found";	
	}

	@Override
	public String deleteProductById(Integer cId) {
		Optional<Product> ate=repo.findById(cId);
		if(ate.isPresent()) {
		repo.deleteById(cId);
		return "deletion is completed";		 
		}
		return "Product not Found";		 

	}

}
