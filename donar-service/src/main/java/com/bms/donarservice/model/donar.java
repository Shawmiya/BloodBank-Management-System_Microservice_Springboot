package com.bms.donarservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class donar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String fullName;
	Integer age;
	String emailId;
	String gender;

	@OneToOne(cascade = CascadeType.ALL)
	Address address;

	@OneToMany(mappedBy = "Donar", cascade = CascadeType.ALL)
	List<Telephone> telephone;

	Blood[] bloods;

	public donar() {
	}

	public donar(Integer id, String fullname, Integer age, String emailId, String gender, Address address,
			List<Telephone> tp) {

		this.id = id;
		this.fullName = fullname;
		this.age = age;
		this.emailId = emailId;
		this.gender = gender;
		this.address = address;
		this.telephone = tp;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Telephone> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<Telephone> telephone) {
		this.telephone = telephone;
	}

	public Blood[] getBloods() {
		return bloods;
	}

	public void setBloods(Blood[] bloods) {
		this.bloods = bloods;
	}

	public static List<donar> getAlldonars() {

		List<donar> donars = new ArrayList<donar>();
		List<Telephone> telephones = new ArrayList<>();
		telephones.add(new Telephone(3, "987364778"));

		donars.add(
				new donar(1, "abi", 20, "test@gmail.com", "male", new Address(1, "dehiwala", "colombo"), telephones));

		return donars;
	}
}
