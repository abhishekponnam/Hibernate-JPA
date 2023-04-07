package com.abhishek.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.entity.DemoEntity;

public class Tester {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
		EntityManager em=factory.createEntityManager();
		DemoEntity emp=new DemoEntity();
		emp.setName("ram");
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(emp);
		t.commit();
		em.close();
		factory.close();
	}

}
