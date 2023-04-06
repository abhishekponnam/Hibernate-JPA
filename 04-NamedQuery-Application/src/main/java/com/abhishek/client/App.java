package com.abhishek.client;

import java.util.List;

import com.abhishek.dao.EmployeeDAO;
import com.abhishek.dao.impl.EmployeeDAOImpl;
import com.abhishek.entity.EmployeeEntity;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAOImpl();
		/*List<EmployeeEntity> lst=dao.executeNamedQuery(20);
		for(Object obj:lst) {
			System.out.println(obj);
		}
		*/
//		List lst1=dao.executeNamedNativeQuery(2000);
//		for(Object obj:lst1) {
//			System.out.println(obj);
//		}
		
		List<EmployeeEntity> lst2 = dao.executeCriteriaQuery();
		for(Object obj:lst2) {
			System.out.println(obj);
		}

	}

}
