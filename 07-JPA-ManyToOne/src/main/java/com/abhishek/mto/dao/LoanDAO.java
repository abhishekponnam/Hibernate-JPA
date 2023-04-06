package com.abhishek.mto.dao;

import com.abhishek.mto.entites.Loan;

public interface LoanDAO {
	void saveLoan(Loan loan);
	Loan fetchLoanDetailsById(Integer loanId);
	void removeLoan(Integer loanId);

}
