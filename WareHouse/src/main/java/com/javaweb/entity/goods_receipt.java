package com.javaweb.entity;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "goods_receipt")
public class goods_receipt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long g_receipt_id;
	
	@Column
	private Date date;
	
	@Column
	private Long staff_id;
	
	@OneToOne(mappedBy = "goods_receipt")
	private goods_order goods_order;
	
	@OneToMany(mappedBy = "goods_receipt")
	private List<goods_receipt_detail> goods_receipt_detail;
	
	@ManyToOne
	@JoinColumn(name = "staff_id",insertable = false, updatable = false)
	private staffs staffs;
	
	

}
