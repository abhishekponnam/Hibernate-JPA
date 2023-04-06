package com.abhishek.dao;

import java.util.List;

import com.abhishek.entity.EmployeeEntity;

public interface EmployeeDAO {
	EmployeeEntity  fetchEmployeeById(Integer empno);
	List<EmployeeEntity> fetchEmployees();
	List<Object[]> fetchNamesAndSalaries();

}
