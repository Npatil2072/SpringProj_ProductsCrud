package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Product;
import com.nt.service.IProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private IProductService service;
	
	@GetMapping("/products")
	public ResponseEntity <Page<Product>> getAll(@RequestParam(defaultValue = "3") int page){
       int size=3;
		Page<Product> list=service.getAllCategory(page,size);	
	  return new ResponseEntity <Page<Product>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> saveProduct(@RequestBody Product prod){
		String s=service.saveProduct(prod);
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getById(@PathVariable("id") Integer iId){
		Product pod=service.getProductById(iId);
		return new ResponseEntity<Product>(pod,HttpStatus.OK);
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<String> updateById(@PathVariable("id") Integer id,@RequestBody Product prod){
		String p=service.updateProductById(id, prod);
		return new ResponseEntity<String>(p,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
		String p=service.deleteProductById(id);
		return new ResponseEntity<String>(p,HttpStatus.OK);
		
	}
	
}
