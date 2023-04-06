package com.abhishek.mto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.mto.dao.LoanDAO;
import com.abhishek.mto.entites.Loan;

public class LoanDAOImpl implements LoanDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	public void saveLoan(Loan loan) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		try {
			em.merge(loan);
			t.commit();
			System.out.println("Loan is persisted into database sucessfully ....");
		}
		catch(Exception ex) {
			t.rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}

	}

	public Loan fetchLoanDetailsById(Integer loanId) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		Loan loan=em.find(Loan.class, loanId);
		return loan;
	}

	public void removeLoan(Integer loanId) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		try {
			Loan loan=em.find(Loan.class,loanId);
			em.remove(loan);
			t.commit();
			System.out.println("Removed object sucessfully ....");
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
