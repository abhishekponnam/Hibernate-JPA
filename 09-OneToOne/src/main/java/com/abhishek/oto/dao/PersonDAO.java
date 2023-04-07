package com.abhishek.oto.dao;

import com.abhishek.oto.entities.Person;

public interface PersonDAO {
		void savePerson(Person person);
		Person findPerson(Integer passportId);
		void removePerson(Integer passportId);
}
