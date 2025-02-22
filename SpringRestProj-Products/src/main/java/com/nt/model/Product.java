package com.nt.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
	@Id
	@GeneratedValue
     private Integer pId;
	@Column(length = 30)
	private String pName;
	
	private Double price;
	@Column(length = 50)
	private String description;
	@ManyToOne(targetEntity = Category.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Person_Id",referencedColumnName = "cId")
	private Category catagory;
	
}
