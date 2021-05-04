package com.te.ecom.dao;

import com.te.ecom.bean.Admin;
import com.te.ecom.bean.Item;

import java.util.List;

public interface AdminDao {
public Admin authenticate(Integer id, String password);
	
	public boolean addItem(Item item);
	
	public boolean removeItem(Integer id);
	
	public Item searchItem(Integer id);
	
	public List<Item> getAllItems();
	
	public boolean updateItem(Item item);

}
