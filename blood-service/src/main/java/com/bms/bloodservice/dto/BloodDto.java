package com.bms.bloodservice.dto;

public class BloodDto {
	private Integer id;
	private String bloodGroup;
	private String donorDate;
	private String expiryDate;
	private String description;

	public BloodDto(Integer id, String bloodGroup, String donorDate, String expiryDate, String description) {
		this.id = id;
		this.bloodGroup = bloodGroup;
		this.donorDate = donorDate;
		this.expiryDate = expiryDate;
		this.description = description;

	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDonorDate() {
		return donorDate;
	}

	public void setDonorDate(String donorDate) {
		this.donorDate = donorDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
