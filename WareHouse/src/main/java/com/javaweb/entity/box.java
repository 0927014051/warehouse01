package com.javaweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "box")
public class box {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "box_id")
	private Long box_id;
	
	@Column(name = "limit")
	private String limit;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "shelf_id")
	private Long shelf_id;
	
	@OneToMany(mappedBy = "box")
	private List<position_product> position_product;
	
	@ManyToOne
	@JoinColumn(name = "shelf_id",insertable = false, updatable = false)
	private shelf shelf;
	
	
}
