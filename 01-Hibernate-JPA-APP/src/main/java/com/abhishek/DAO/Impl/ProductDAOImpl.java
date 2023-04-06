package com.abhishek.DAO.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.DAO.ProductDAO;
import com.abhishek.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {
private EntityManagerFactory factory;
	
	public ProductDAOImpl() {
		factory = Persistence.createEntityManagerFactory("test");
	}

	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println("Product is inserted to the Database....");
		}
		catch(Exception ex) {
			tx.rollback();
			System.out.println("Error in inserting a product...." + ex);
		}
		finally {
			entityManager.close();
		}
		
		return product;
	}

	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager= factory.createEntityManager();
		/*
		 * find():=> early Loading
		 * getReference():=> Lazy Loading
		 */
		ProductEntity p=entityManager.find(ProductEntity.class, productId);
		return p;
	}

	public ProductEntity updateProductById(Integer productId, double unitPrice) {
		
		EntityManager entityManager= factory.createEntityManager();
		ProductEntity p= entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		p.setUnitPrice(unitPrice);
		tx.commit();
		entityManager.close();
		
		return p;
	}

	public void deleteProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p= entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		entityManager.remove(p);
		tx.commit();
		entityManager.close();
		

	}
	
		public void testEntityStates() {
			EntityManager entityManager=factory.createEntityManager();
			/*
			 * create new product
			 */
//			ProductEntity pe= new ProductEntity();//Transient state
//			pe.setProductId(2);
//			pe.setProductName("Mobile Phones");
//			pe.setQuantity(29);
//			pe.setUnitPrice(39000.00);
			
			ProductEntity pe= entityManager.find(ProductEntity.class,2);
			
//			EntityTransaction tx=entityManager.getTransaction();
//			tx.begin();
//			entityManager.persist(pe);//persistent State
//			tx.commit();
			
			entityManager.detach(pe);// Detached state
			pe.setUnitPrice(40000.00);
			/*
			 * after detached state the changes in data into object it doesn't 
			 * effect .
			 */
			
			EntityTransaction t=entityManager.getTransaction();
			t.begin();
			entityManager.merge(pe);//moved from detached state to persistent state
			t.commit();
			entityManager.close();
			
		}

}
