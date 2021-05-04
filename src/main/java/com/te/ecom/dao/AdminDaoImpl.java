package com.te.ecom.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.ecom.bean.Admin;
import com.te.ecom.bean.Item;

public class AdminDaoImpl implements AdminDao {

	public Admin authenticate(Integer id, String password) {
		Admin admin = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecom");
			EntityManager manager = factory.createEntityManager();
			String sql = "from Admin where id =: id and password =: password";
			Query query = manager.createQuery(sql);
			query.setParameter("id", id);
			query.setParameter("password", password);
			admin = (Admin) query.getSingleResult();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return admin;
	}

	public boolean addItem(Item item) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecom");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(item);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean removeItem(Integer id) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecom");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Item item = manager.find(Item.class, id);
			manager.remove(item);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Item searchItem(Integer id) {
		Item item = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecom");
			EntityManager manager = factory.createEntityManager();
			item = manager.find(Item.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return item;
	}

	public List<Item> getAllItems() {
		List<Item> list = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecom");
			EntityManager manager = factory.createEntityManager();
			String sql = "from Item";
			Query query = manager.createQuery(sql);
			list  = query.getResultList();
			return list;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public boolean updateItem(Item item) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecom");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			System.out.println("id "+item.getId());
			Item originalItem = manager.find(Item.class, item.getId());
			
			if(item.getName() != null && item.getName() != "") {
				originalItem.setName(item.getName());
			}

			transaction.commit();
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
