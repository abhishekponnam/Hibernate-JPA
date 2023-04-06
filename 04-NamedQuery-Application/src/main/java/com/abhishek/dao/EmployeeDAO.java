package com.abhishek.dao;

import java.util.List;

import com.abhishek.entity.EmployeeEntity;

public interface EmployeeDAO {
	 List<EmployeeEntity> executeNamedQuery(int deptNo);
	 List executeNamedNativeQuery(int sal);
	 List<EmployeeEntity> executeCriteriaQuery();

}
