package com.abhishek.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable{
	//serializable is marker interface its mandatory to implement

	@Column(name = "roll_no")
	private Integer rollNumber;
	
	@Column(name = "section") // optional
	private String section;
	
	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	

}
