package com.te.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.ecom.bean.Admin;
import com.te.ecom.bean.Item;
import com.te.ecom.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDaoImpl adminDao;

	public Admin authenticate(Integer id, String password) {
		Admin admin = adminDao.authenticate(id, password);
		return admin;
	}

	public boolean addItem(Item item) {
		boolean result = adminDao.addItem(item) ;
		return result;
	}

	public boolean removeItem(Integer id) {
		boolean result = adminDao.removeItem(id);
		return result;
	}

	public Item searchItem(Integer id) {
		Item item = adminDao.searchItem(id);
		return item;
	}

	public List<Item> getAllItems() {
		List<Item> list = adminDao.getAllItems();
		return list;
	}

	public boolean updateItem(Item item) {
		boolean result = adminDao.updateItem(item);
		return result;
	}

}
