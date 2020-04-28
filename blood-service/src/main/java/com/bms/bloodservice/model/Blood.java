package com.bms.bloodservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blood {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String bloodGroup;
	private String donarDate;
	private String expiryDate;

	private String description;

	public Blood(Integer id, String bloodGroup, String donarDate, String expiryDate, String description) {
		super();
		this.id = id;

		this.bloodGroup = bloodGroup;
		this.donarDate = donarDate;
		this.expiryDate = expiryDate;

		this.description = description;
	}

	public Blood() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDonarDate() {
		return donarDate;
	}

	public void setDonarDate(String donarDate) {
		this.donarDate = donarDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
