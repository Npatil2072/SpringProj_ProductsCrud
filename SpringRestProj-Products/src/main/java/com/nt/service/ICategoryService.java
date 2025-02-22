package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.model.Category;

public interface ICategoryService {
	
//	 public List<Category> getAllCategory();
//	 Page<Category> getAllCategory(int page, int size);
//s	 Page<Category> getAllCategory(int page);
	 Page<Category> getAllCategory(int page, int size);
	 
//	 public String saveCategory();
	 String saveCategory(Category category);
	 
//	 public String getCategoryById();
	 Category getCategoryById(Integer cId);
	 
//	 public String updateCategoryById();
	 String updateCategoryById(Integer id, Category cate);
	 
//	 public String deleteCategoryById();
	 String deleteCategoryById(Integer cId);








}
