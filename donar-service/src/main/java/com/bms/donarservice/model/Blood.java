package com.bms.donarservice.model;

public class Blood {

	private Integer id;
	private Integer donarId;
	private String bloodGroup;
	private String donarDate;
	private String expiryDate;
	private String quantity;
	private String description;

	public Blood(Integer id, Integer donarId, String bloodGroup, String donarDate, String expiryDate, String quantity,
			String description) {
		super();
		this.id = id;
		this.donarId = donarId;
		this.bloodGroup = bloodGroup;
		this.donarDate = donarDate;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
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

	public Integer getDonarId() {
		return donarId;
	}

	public void setDonarId(Integer donarId) {
		this.donarId = donarId;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
