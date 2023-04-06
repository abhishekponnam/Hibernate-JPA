package com.abhishek.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.abhishek.dao.EmpDAO;

public class EmployeeDAOImpl implements EmpDAO {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");

	public void executeProcedure(int empNo) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		StoredProcedureQuery query=em.createNamedStoredProcedureQuery("pro1");
		query.setParameter("ENO", empNo);
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		query.execute();
		String s1=(String)query.getOutputParameterValue("NAME");
		double d=(Double)query.getOutputParameterValue("EXPERIENCE");
		System.out.println("NAME : "+s1);
		System.out.println("Experience :" +d);
		tx.commit();
		em.close();
		factory.close();
		

	}

}
