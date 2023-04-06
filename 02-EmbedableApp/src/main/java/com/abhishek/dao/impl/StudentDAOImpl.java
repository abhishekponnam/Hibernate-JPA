package com.abhishek.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.dao.StudentDAO;
import com.abhishek.entity.StudentCompositeKey;
import com.abhishek.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {
	private EntityManagerFactory factory=
			Persistence.createEntityManagerFactory("test");

	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager entityManager= factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(entity);
			tx.commit();
			System.out.println("StudentEntity Object is Persisted in Database");
		}
		catch(Exception ex){
			tx.rollback();
			System.out.println("Issue in StudentEntity Inserting in Database");
			ex.printStackTrace();
			
		}
		finally {
			entityManager.close();
		}

	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity= entityManager.find(StudentEntity.class,compositeKey);
		entityManager.close();
		return entity;
	}

}
