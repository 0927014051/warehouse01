package com.javaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "goods_order_detail")
public class goods_order_detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long g_order_detail_id;
	
	@Column
	private Long g_order_id;
	
	@Column 
	private String product_id;
	
	@Column
	private int quantity;
	
	@Column
	private long price;
	
	@ManyToOne
	@JoinColumn(name = "g_order_id",insertable = false, updatable = false)
	private goods_order goods_order;
	
	@ManyToOne
	@JoinColumn(name = "product_id",insertable = false, updatable = false)
	private product product;
	

}
