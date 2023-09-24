package com.javaweb.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "goods_order")
public class goods_order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long g_order_id;
	
	@Column
	private Date date;
	
	@Column
	private Long staff_id;
	
	@Column
	private	Long supplier_id;
	
	@ManyToOne
	@JoinColumn(name = "staff_id",insertable = false, updatable = false)
	private staffs staffs;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id",insertable = false, updatable = false)
	private supplier supplier;
	
	@OneToMany(mappedBy = "goods_order")
	private List<goods_order_detail> goods_order_detail;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "g_receipt_id")
	private goods_receipt goods_receipt;

}
