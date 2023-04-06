package com.abhishek.client;

import java.util.List;

import com.abhishek.dao.EmployeeDAO;
import com.abhishek.dao.impl.EmployeeDAOImpl;

public class App {
	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAOImpl();
        /*
         * getting single object with employee id 
         */
	
		
	//	EmployeeEntity e=dao.fetchEmployeeById(7839);
	//	System.out.println(e);
		
		
		/*
		 * getting the all object or data from the database
		 */
		
		/*
		List<EmployeeEntity> lst = dao.fetchEmployees();
		for (Object obj : lst) {
		    System.out.println(obj);
		}
		*/
		
		/*
		 * getting the particular columns from the database
		 */
		
		List<Object[]> lst1 = dao.fetchNamesAndSalaries();
		for (Object[] obj : lst1) {
		    System.out.println(obj[0] + " = " + obj[1]);
		}

		
//		List<Object[]> lst1 = dao.fetchNamesAndSalaries();
//		lst1.forEach(obj -> {
//			System.out.println( obj[0]+" , " + obj[1]);
//		});
	}
}
