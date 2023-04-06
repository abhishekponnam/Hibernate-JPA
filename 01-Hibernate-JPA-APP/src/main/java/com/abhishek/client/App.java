package com.abhishek.client;

import com.abhishek.DAO.ProductDAO;
import com.abhishek.DAO.Impl.ProductDAOImpl;
import com.abhishek.entity.ProductEntity;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to establish connection with Database
		ProductDAO dao=new ProductDAOImpl();
		/*
		 * Create new Product Entity 
		 */
		/*ProductEntity pEntity = new ProductEntity();
		pEntity.setProductId(1);
		pEntity.setProductName("Lappy");
		pEntity.setQuantity(11);
		pEntity.setUnitPrice(99000.00);
		
		dao.saveProduct(pEntity);*/
		
		/*
		 * lets update the product
		 */
//		ProductEntity p=dao.updateProductById(1, 100000.00);
//		System.out.println(p);
		dao.testEntityStates();
		
	}

}
