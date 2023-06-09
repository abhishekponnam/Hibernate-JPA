package com.abhishek.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.abhishek.constants.AppConstants;
import com.abhishek.dao.EmployeeDAO;
import com.abhishek.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	
	public EmployeeEntity fetchEmployeeById(Integer empno) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
		tq.setParameter(1, empno);
		EmployeeEntity e = tq.getSingleResult();
		em.close();
		return e;
	}

	
	public List<EmployeeEntity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY2, EmployeeEntity.class);
		List<EmployeeEntity> lstOfEmployees = tq.getResultList();
		em.close();
		return lstOfEmployees;
	}

	
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(AppConstants.QUERY3, Object[].class);
		List<Object[]> lst = tq.getResultList();
		em.close();
		return lst;
			
	}

}
