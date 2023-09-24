package com.javaweb.entity;

import java.lang.Long;
import java.util.Date;
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
@Table(name = "position_product")
public class position_product {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column
	private Long position_id;
	
	@Column
	private String product_id;
	
	@Column
	private Long box_id;
	
	@Column
	private Date date;
	
	@Column
	private int quantity_first;
	
	@Column
	private int quantity_last;
	
	@ManyToOne
	@JoinColumn(name = "product_id",insertable = false, updatable = false)
	private product product;
	
	@ManyToOne
	@JoinColumn(name = "box_id",insertable = false, updatable = false)
	private box box;

}
