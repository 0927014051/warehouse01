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
@Table(name = "staffs")
public class staffs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long staff_id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private Date birthday;
	
	@Column
	private String address;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private Long role_id;
	
	@ManyToOne
	@JoinColumn(name = "role_id", insertable = false, updatable = false)
	private role role;
	
	@OneToMany(mappedBy = "staff_sale")
	private List<request> request_sale;
	
	@OneToMany(mappedBy = "staff_warehouse")
	private List<request> request_warehouse;
	
	@OneToMany(mappedBy = "staffs")
	private List<goods_order> goods_order;
	
	@OneToMany(mappedBy = "staffs")
	private List<goods_receipt> goods_receipt;

	public Long getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Long staff_id) {
		this.staff_id = staff_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public role getRole() {
		return role;
	}

	public void setRole(role role) {
		this.role = role;
	}

	public List<request> getRequest_sale() {
		return request_sale;
	}

	public void setRequest_sale(List<request> request_sale) {
		this.request_sale = request_sale;
	}

	public List<request> getRequest_warehouse() {
		return request_warehouse;
	}

	public void setRequest_warehouse(List<request> request_warehouse) {
		this.request_warehouse = request_warehouse;
	}

	public List<goods_order> getGoods_order() {
		return goods_order;
	}

	public void setGoods_order(List<goods_order> goods_order) {
		this.goods_order = goods_order;
	}

	public List<goods_receipt> getGoods_receipt() {
		return goods_receipt;
	}

	public void setGoods_receipt(List<goods_receipt> goods_receipt) {
		this.goods_receipt = goods_receipt;
	}
	

}
