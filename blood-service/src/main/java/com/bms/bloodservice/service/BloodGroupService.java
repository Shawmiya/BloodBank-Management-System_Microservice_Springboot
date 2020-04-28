package com.bms.bloodservice.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.bms.bloodservice.dto.BloodDto;
import com.bms.bloodservice.dto.BloodgroupDto;
import com.bms.bloodservice.model.BloodGroup;

public interface BloodGroupService {

	BloodGroup save(BloodGroup grp);

	void deleteBloodGroup(Integer id);

	List<Object> getAllBloodGroup();

	BloodgroupDto getBloodGroupById(Integer id);

}
