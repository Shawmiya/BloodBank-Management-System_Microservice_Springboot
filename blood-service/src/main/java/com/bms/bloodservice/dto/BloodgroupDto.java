package com.bms.bloodservice.dto;

public class BloodgroupDto {

	private Integer id;
	private String groupName;
	public BloodgroupDto(Integer id, String groupName ) {
		this.id=id;
		this.groupName = groupName;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
