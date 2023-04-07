package com.abhishek.oto.client;

import java.time.LocalDate;
import java.time.Month;

import com.abhishek.oto.dao.PersonDAO;
import com.abhishek.oto.dao.impl.PersonDAOImpl;
import com.abhishek.oto.entities.Passport;
import com.abhishek.oto.entities.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDAO dao=new PersonDAOImpl();
		/*
		 * insert the data into data base
		 */
		
		
		//creation the person objects
		
		/*
		Person p1=new Person();
		p1.setPersonId(101);
		p1.setPersonName("Abhi");
		
		Person p2=new Person();
		p2.setPersonId(102);
		p2.setPersonName("Shek");
		
		Passport pa1=new Passport();
		pa1.setPassportId(10001);
		pa1.setExpirDate(LocalDate.of( 2025 , Month.MAY , 7 ));
		
		Passport pa2=new Passport();
		pa2.setPassportId(10002);
		pa2.setExpirDate(LocalDate.of( 2030, Month.SEPTEMBER, 7 ));
		
		p1.setPassport(pa1);
		p2.setPassport(pa2);
		
		dao.savePerson(p1);
		dao.savePerson(p2);
		*/
		
		/*
		 * fetch the details from data base
		 */
		
		/*
		Person person=dao.findPerson(101);
		System.out.println(person.getPersonName());
		System.out.println(person.getPersonId());
		Passport pass=person.getPassport();
		System.out.println(pass);*/
		
		dao.removePerson(101);

	}

}
