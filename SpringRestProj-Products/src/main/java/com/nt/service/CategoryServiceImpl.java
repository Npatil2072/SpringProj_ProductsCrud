package com.nt.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.model.Category;
import com.nt.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private CategoryRepo repo;

	 @Override
	    public Page<Category> getAllCategory(int page, int size) {
	        Pageable pageable = PageRequest.of(page, size);
	        return repo.findAll(pageable);
	    }

	@Override
	public String saveCategory(Category category) {
        Category cate=repo.save(category);
		return "category is saved"+cate.toString();
	}

	@Override
	public Category getCategoryById(Integer cId) {
		Optional<Category> ate=repo.findById(cId);
		Category cate=null;
		if(ate.isPresent()) {
			cate =repo.getById(cId);
		return null;		 
		}
		return cate;		 
	}

	@Override
	public String updateCategoryById(Integer id,Category cat) {
		Optional<Category> ate=repo.findById(id);
		if(ate.isPresent()) {
		repo.save(cat);
		return "Updatation is completed";		 
		}
		return "Category not Found";	
	}

	@Override
	public String deleteCategoryById(Integer cId) {
		Optional<Category> ate=repo.findById(cId);
		if(ate.isPresent()) {
		repo.deleteById(cId);
		return "deletion is completed";		 
		}
		return "Category not Found";		 

	}

}
