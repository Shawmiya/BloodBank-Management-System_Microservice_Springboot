package com.bms.seekerservice.dto;

public class SeekerDto {
	Integer id;
	String fullName;
	Integer contactno;
	String emailId;
	String message;

	public SeekerDto(Integer id, String fullName, Integer contactno, String emailId, String message) {
		this.id = id;
		this.fullName = fullName;
		this.contactno = contactno;

		this.emailId = emailId;
		this.message = message;
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

	public Integer getContactno() {
		return contactno;
	}

	public void setContactno(Integer contactno) {
		this.contactno = contactno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
