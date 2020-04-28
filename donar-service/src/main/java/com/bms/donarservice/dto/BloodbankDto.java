package com.bms.donarservice.dto;

public class BloodbankDto {

	private Integer id;
	private String fullName;
	private String emailId;
	private Integer contactNo;
	private Integer age;
	private String gender;
	private String address;
	private String bloodgroup;
	
	public BloodbankDto(Integer id, String fullName, String emailId, Integer contactNo, Integer age, String gender,
			String address, String bloodgroup) {
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.bloodgroup = bloodgroup;
		

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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	
	
	
	
}
