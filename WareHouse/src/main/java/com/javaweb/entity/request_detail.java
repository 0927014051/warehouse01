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
@Table(name = "request_detail")
public class request_detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long request_detail_id;
	
	@Column
	private Long request_id;

	@Column
	private String product_id;
	
	@Column
	private int quantity;
	
	@Column
	private long price;
	
	@ManyToOne
	@JoinColumn(name = "request_id",insertable = false, updatable = false)
	private request request;
	
	@ManyToOne
	@JoinColumn(name = "product_id",insertable = false, updatable = false)
	private product product;
	

}
