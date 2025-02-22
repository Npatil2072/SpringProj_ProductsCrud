package com.nt.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "category")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Category {
	@Id
	@GeneratedValue
     private Integer cId;
	@Column(length = 30)
	private String cName;
	@Column(length = 50)
	private String description;
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	private Set<Product>  product;
	
}
