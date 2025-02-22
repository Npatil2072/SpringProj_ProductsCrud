package com.nt.repo;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	//Page<Category> findAll(Pageable pageable);
	Page<Category> findAll(Pageable pageable);

}
