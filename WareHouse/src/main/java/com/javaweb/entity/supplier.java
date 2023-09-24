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
@Table(name ="supplier")
public class supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long supplier_id;
	
	@Column
	private String supplier_name;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@OneToMany(mappedBy = "supplier")
	private List<goods_order> goods_order;

}
