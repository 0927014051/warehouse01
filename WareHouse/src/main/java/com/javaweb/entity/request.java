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
import javax.persistence.Table;

@Entity
@Table(name = "request")
public class request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long request_id;
	
	@Column
	private Date date;
	
	@Column
	private String type;
	
	@Column
	private Long staff_warehouse_id;
	
	@Column
	private Long staff_sale_id;
	
	@ManyToOne
	@JoinColumn(name = "staff_warehouse_id",insertable = false, updatable = false)
	private staffs staff_warehouse;
	
	@ManyToOne
	@JoinColumn(name = "staff_sale_id",insertable = false, updatable = false)
	private staffs staff_sale;

	@OneToMany(mappedBy = "request")
	private List<request_detail> request_detail;
	
	

}
