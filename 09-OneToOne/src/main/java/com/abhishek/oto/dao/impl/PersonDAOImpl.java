package com.abhishek.oto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.oto.dao.PersonDAO;
import com.abhishek.oto.entities.Person;

public class PersonDAOImpl implements PersonDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		try {
			em.merge(person);
			t.commit();
			System.out.println("Sucessfully the object is persisted .....");
		}
		catch(Exception ex) {
			t.rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}

	}

	public Person findPerson(Integer passportId) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		Person person=em.find(Person.class, passportId);
		em.close();
		return person;
	}

	public void removePerson(Integer passportId) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		try {
			Person person=em.find(Person.class, passportId);
			em.remove(person);
			t.commit();
			System.out.println("The person object is deleted sucessfully.....");
		}
		catch(Exception ex){
			t.rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}

	}

}
