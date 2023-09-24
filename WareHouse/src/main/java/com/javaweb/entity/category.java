package com.javaweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long category_id;
	
	@Column
	private String category_name;
	
	@OneToMany(mappedBy = "category")
	private List<product> product;
}
