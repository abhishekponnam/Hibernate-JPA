package com.abhishek.otm.dao;

import com.abhishek.otm.entities.CategoryEntity;

public interface CategoryDAO {
	
	void saveCategory(CategoryEntity entity);
	CategoryEntity fetchCategory(Integer categoryId);
	void removeCategory(Integer categoryId);

}
