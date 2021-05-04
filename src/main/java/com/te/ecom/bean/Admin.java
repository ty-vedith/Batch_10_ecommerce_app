package com.te.ecom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@Column(name = "adminid")
	private int id;
	
	@Column(name = "adminpwd")
	private String password;
}
