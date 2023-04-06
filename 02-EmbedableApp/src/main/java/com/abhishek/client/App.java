package com.abhishek.client;

import com.abhishek.dao.StudentDAO;
import com.abhishek.dao.impl.StudentDAOImpl;
import com.abhishek.entity.StudentCompositeKey;
import com.abhishek.entity.StudentEntity;

public class App {
	public static void main(String[] args) {
		StudentDAO dao=new StudentDAOImpl();
		/*
		 * save the student data
		 */
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNumber(1);
		compositeKey.setSection("B");
//		
//		StudentEntity entity= new StudentEntity();
//		entity.setCompositeKey(compositeKey);
//		entity.setStudentName("Abhiram");
//		entity.setMarks(900);
//		
//		dao.saveStudent(entity);
		
		/*
		 * Fetch the student Details
		 */
		StudentEntity entity= dao.fetchStudent(compositeKey);
		System.out.println(entity);
		
	}

}
