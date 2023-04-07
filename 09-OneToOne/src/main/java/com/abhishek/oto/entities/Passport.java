package com.abhishek.oto.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_passport")
public class Passport {
	@Id
	private Integer passportId;
	private LocalDate expirDate;
	public Integer getPassportId() {
		return passportId;
	}
	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}
	public LocalDate getExpirDate() {
		return expirDate;
	}
	public void setExpirDate(LocalDate expirDate) {
		this.expirDate = expirDate;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", expirDate=" + expirDate + "]";
	}
	
}
