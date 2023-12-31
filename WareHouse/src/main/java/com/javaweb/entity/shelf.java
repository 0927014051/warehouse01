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
@Table(name = "shelf")
public class shelf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long shelf_id;
	
	@Column
	private String shelf_name;
	
	@Column
	private Long area_id;
	
	@OneToMany(mappedBy = "shelf")
	private List<box> box;
	
	@ManyToOne
	@JoinColumn(name = "area_id",insertable = false, updatable = false)
	private area area;
}
