package com.bms.bloodservice.service;

import java.util.List;

import com.bms.bloodservice.dto.BloodDto;
import com.bms.bloodservice.model.Blood;


public interface BloodService {

	Blood save(Blood bld);

	void deleteBlood(Integer id);

	List<Object> getAllBlood();

	BloodDto getBloodById(Integer id);

	BloodDto updateBlood(Integer id, BloodDto bloodDto);

}
