package com.javaweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class role {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column
	private Long role_id;
	
	@Column
	private String role_name;
	
	@OneToMany(mappedBy = "role")
	private List<staffs> staffs;
	
}
