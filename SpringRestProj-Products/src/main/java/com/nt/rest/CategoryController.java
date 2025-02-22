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

import com.nt.model.Category;
import com.nt.service.ICategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/categories")
	public ResponseEntity <Page<Category>> getAll(@RequestParam(defaultValue = "3") int page){
       int size=3;
		Page<Category> list=service.getAllCategory(page,size);	
	  return new ResponseEntity <Page<Category>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/categories")
	public ResponseEntity<String> saveCategory(@RequestBody Category cat){
		String s=service.saveCategory(cat);
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	@GetMapping("/categories/{id}")
	public ResponseEntity<Category> getById(@PathVariable("id") Integer id){
		Category cat=service.getCategoryById(id);
		return new ResponseEntity<Category>(cat,HttpStatus.OK);
	}
	@PutMapping("/categories/{id}")
	public ResponseEntity<String> updateById(@PathVariable("id") Integer id,@RequestBody Category cat){
		String p=service.updateCategoryById(id, cat);
		return new ResponseEntity<String>(p,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
		String p=service.deleteCategoryById(id);
		return new ResponseEntity<String>(p,HttpStatus.OK);
		
	}
	
}
