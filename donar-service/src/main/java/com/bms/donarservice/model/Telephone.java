package com.bms.donarservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Telephone")
public class Telephone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	String phoneNumber;

	@ManyToOne
	@JoinColumn
	donar Donar;

	public Telephone() {
	}

	public Telephone(Integer id, String Phn) {

		this.id = id;
		this.phoneNumber = Phn;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@JsonIgnore
	public donar getDonar() {
		return Donar;
	}

	public void setDonar(donar donar) {
		Donar = donar;
	}

}
