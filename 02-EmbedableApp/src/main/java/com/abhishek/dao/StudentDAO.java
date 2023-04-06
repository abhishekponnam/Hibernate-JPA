package com.abhishek.dao;

import com.abhishek.entity.StudentCompositeKey;
import com.abhishek.entity.StudentEntity;

public interface StudentDAO {
	
	void  saveStudent(StudentEntity entity);
	
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);

}
