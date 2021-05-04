package com.te.ecom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "admin_info")
public class Admin {

	@Id
	@Column(name = "admin_id")
	private int id;
	
	@Column(name = "admin_password")
	private String password;
}
