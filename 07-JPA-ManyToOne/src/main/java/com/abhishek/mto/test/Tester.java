package com.abhishek.mto.test;

import com.abhishek.mto.dao.LoanDAO;
import com.abhishek.mto.dao.impl.LoanDAOImpl;
import com.abhishek.mto.entites.Customer;
import com.abhishek.mto.entites.Loan;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanDAO dao=new LoanDAOImpl();
		/*
		 * invoke saveLoan();
		 */
		/*Loan pLoan=new Loan();
		pLoan.setLoanId(101);
		pLoan.setLoanType("Personal Loan");
		pLoan.setLoanAmount(500000.00);
		
		Loan vLoan=new Loan();
		vLoan.setLoanId(102);
		vLoan.setLoanType("Vechile Loan");
		vLoan.setLoanAmount(100000.00);
		
		Loan hLoan=new Loan();
		hLoan.setLoanId(103);
		hLoan.setLoanType("Home Loan");
		hLoan.setLoanAmount(6000000.00);
		
		Customer customer1 =new Customer();
		customer1.setCustomerId(1);
		customer1.setCustomerName("Raju");
		
		pLoan.setCustomer(customer1);
		vLoan.setCustomer(customer1);
		hLoan.setCustomer(customer1);
		
		dao.saveLoan(pLoan);
		dao.saveLoan(hLoan);
		dao.saveLoan(vLoan);*/
		
		/*
		 * call fetchLoanDetails method
		 */
		/*Loan loan=dao.fetchLoanDetailsById(102);
		System.out.println(loan);*/
		
		/*
		 * remove Loan
		 */
		dao.removeLoan(103);
		
		
	}

}
