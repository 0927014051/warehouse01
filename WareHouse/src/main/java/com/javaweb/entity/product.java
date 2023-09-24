package com.javaweb.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class product {
	
	@Id
	@Column
	private String product_id;
	
	@Column
	private String color;
	
	@Column
	private String material;
	
	@Column
	private int inventory_number;
	
	@Column
	private String size;
	
	@Column
	private Date mfg;
	
	@Column
	private Long category_id;
	
	@Column
	private Long supplier_id;
	
	@OneToMany(mappedBy = "product")
	private List<request_detail> request_detail;
	
	@ManyToOne
	@JoinColumn(name = "category_id",insertable = false, updatable = false)
	private category category;
	
	@OneToMany(mappedBy = "product")
	private List<position_product> position_product;
	
	
	@OneToMany(mappedBy = "product")
	private List<goods_order_detail> goods_order_detail;
	
	

}
