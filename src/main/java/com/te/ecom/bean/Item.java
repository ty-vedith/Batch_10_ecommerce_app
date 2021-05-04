package com.te.ecom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "items_info")
public class Item {

	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
}
