package com.abhishek.client;

import com.abhishek.dao.EmpDAO;
import com.abhishek.dao.impl.EmployeeDAOImpl;

public class App {
	public static void main(String[] args) {
		EmpDAO dao=new EmployeeDAOImpl();
		dao.executeProcedure(7934);
	}

}
