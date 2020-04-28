package com.bms.seekerservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seeker {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer id;
		String fullName;
		Integer contactno;
		String emailId;
		String message;
		
		
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


