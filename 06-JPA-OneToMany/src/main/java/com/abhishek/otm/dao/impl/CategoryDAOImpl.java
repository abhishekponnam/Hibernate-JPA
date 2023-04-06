package com.abhishek.otm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.otm.dao.CategoryDAO;
import com.abhishek.otm.entities.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	
	public void saveCategory(CategoryEntity entity) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			em.persist(entity);
			t.commit();
			System.out.println("Category with Products are persisted into Database...");
		} catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}

	}

	
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		CategoryEntity entity = em.find(CategoryEntity.class, categoryId);
		em.close();
		return entity;
	}

	
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		CategoryEntity entity = em.find(CategoryEntity.class, categoryId);
		t.begin();
		try {
			em.remove(entity);
			t.commit();
			System.out.println("category with products is removed from Database");
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}
	}

}
