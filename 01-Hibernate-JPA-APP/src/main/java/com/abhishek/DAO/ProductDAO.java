package com.abhishek.DAO;

import com.abhishek.entity.ProductEntity;

public interface ProductDAO {
	ProductEntity saveProduct(ProductEntity product);
	ProductEntity loadProductById(Integer productId);
	ProductEntity updateProductById(Integer productId,double unitPrice);
	void deleteProductById(Integer productId);
	void testEntityStates();
}
